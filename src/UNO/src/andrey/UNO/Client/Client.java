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
    
    
    protected Client(IServer server) throws RemoteException{
        card.createCards();
        this.server = server;
        for(int i = 0; i < 7; i++){ 
            deck.add(this.card.getCard());
            System.out.println(deck.get(i).value + " " + deck.get(i).color);
        }
        register();
    }
    
    //Registers the client into the server
    private void register() throws RemoteException {
        server.registerClient(this);
    }

    
    //Shows the last card played
    public void retrieveCard(String color, String value) throws RemoteException {
        System.out.println("La ultima carta jugada es: " + color + " " + value);
    }
    
    //Set unique ID for each client
    public void setID(int ID) throws RemoteException {
        this.ID = ID;
    }
    
    //Tests the card to see if it is a valid move
    public boolean sendCard(String color, String value, int clientID) throws RemoteException {
        boolean test = server.testCard(color, value, this.ID);
        //System.out.println("El test fue: " + test);
        if(test){
            int i = 0;
            while(i < deck.size()){
                if(Objects.equals(color, deck.get(i).color) && Objects.equals(value, deck.get(i).value)){
                    deck.remove(i);
                    break;
                }
                i++;
            }
            return true;
        }
        return false;
    }
    
    //Recieve messages from the server (It is not your turn, Your card is not a valid move)
    public void receiveMessage(String message) throws RemoteException {
        System.out.println(message);
    }
    
    //Add two cards to the deck
    public void get2() throws RemoteException {
        deck.add(card.getCard());
        deck.add(card.getCard());
        this.printCards();
    }
    
    //Add a card to the deck
    private void getnewCard() throws RemoteException {
        deck.add(card.getCard());
        this.printCards();
    }
    
    public void printCards(){
        for(int i = 0; i < deck.size(); i++){
            System.out.println(deck.get(i).value + " " + deck.get(i).color);
        }
    }

    //Run the thread for the clients
    public void run() {
        try{
            System.out.println("\nConnected, your ID is: " + ID + "\n");
            Scanner scanner = new Scanner(System.in);
            String color;
            String value;
            while(true) {
                try {
                    System.out.println("Color:");
                    color = scanner.nextLine();
                    System.out.println("Value:");
                    value = scanner.nextLine();
                    if(Objects.equals(color, "q") || Objects.equals(value, "q")){
                        this.getnewCard();
                    }
                    else if(Objects.equals(color, "w") || Objects.equals(value, "w")){
                        server.skipTurn();
                    }
                    else{
                        this.sendCard(color, value, this.ID);
                    }
                    this.printCards();
                    
                }catch(Exception e) {e.printStackTrace();}
            }
        }catch(Exception e){e.printStackTrace();}
    } 
}
