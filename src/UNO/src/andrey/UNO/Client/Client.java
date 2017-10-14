/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Client;

import andrey.UNO.Card.Card;
import andrey.UNO.Server.IServer;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author torre
 */
public class Client extends UnicastRemoteObject implements IClient, Runnable {
    
    private static final long serialVersionUID = 1L;
    IServer server; //The server
    Card card = new Card("blue", "0"); //Creates a new card to access the card's methods
    private ArrayList<Card> deck = new ArrayList<>(); //Client's deck
    public int ID = 0; //Unique ID for turns
    private boolean playerWON = false;
    private IView view;
    
    
    protected Client(IServer server, IView view) throws RemoteException{
        card.createCards();
        this.server = server;
        for(int i = 0; i < 7; i++){ 
            deck.add(this.card.getCard());
            System.out.println(deck.get(i).value + " " + deck.get(i).color);
        }
        this.view = view;
        view.setClient(this);
        register();
    }
    
    //Registers the client into the server
    private void register() throws RemoteException {
        server.registerClient(this);
    }

    
    //Shows the last card played
    public void retrieveCard(String color, String value) throws RemoteException {
        view.retrieveCard(color, value);
    }
    
    public void retrieveDeckCount(int playerID ,int cardsLeft) throws RemoteException {
        if(cardsLeft == 0){
            System.out.println("\n\n || Player " + playerID + " has won!! || ");
            playerWON = true;
        }
        view.retrieveDeckCount(playerID, cardsLeft);
    }
    
    //Set unique ID for each client
    public void setID(int ID) throws RemoteException {
        this.ID = ID;
    }
    
    //Tests the card to see if it is a valid move
    public boolean sendCard(String color, String value) throws RemoteException {
        boolean test = server.testCard(color, value, this.ID);
        if(test){
            int i = 0;
            while(i < deck.size()){
                if(Objects.equals(value, "+4") || Objects.equals(value, "colorchange")){
                    if(Objects.equals(value, deck.get(i).value)){
                        deck.remove(i);
                        break;
                    }
                }else{
                    if(Objects.equals(color, deck.get(i).color) && Objects.equals(value, deck.get(i).value)){
                        deck.remove(i);
                        break;
                    }
                }
                i++;
            }
            server.broadcastDeckCount(deck.size());
            if(deck.size() == 0)
                playerWON = true;
            return true;
        }
        return false;
    }
    
    //Recieve messages from the server (It is not your turn, Your card is not a valid move)
    public void receiveMessage(String message) throws RemoteException {
        view.receiveMessage(message);
    }
    
    //Add two cards to the deck
    public void get2() throws RemoteException {
        deck.add(card.getCard());
        deck.add(card.getCard());
        this.printCards();
    }
    
    //Add a card to the deck
    public void getnewCard() throws RemoteException {
        deck.add(card.getCard());
        this.printCards();
    }
    
    public void printCards() throws RemoteException {
        System.out.println("\n Your Cards: ");
        for(int i = 0; i < deck.size(); i++){
            view.printCards(deck.get(i).color, deck.get(i).value);
        }
        System.out.println("\n\n");
    }
    
    public void skipTurn() throws RemoteException {
        server.skipTurn();
    }

    //Run the thread for the clients
    public void run() {
        System.out.println("\nConnected, your ID is: " + ID + "\n");
        while(!playerWON) {
            try {
                if(deck.isEmpty()){
                    view.gamewon();
                }
                view.gameloop();
            }catch(Exception e) {e.printStackTrace();}
        }
    }
}
