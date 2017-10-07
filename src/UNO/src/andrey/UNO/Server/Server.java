/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Server;


import andrey.UNO.Card.Card;
import andrey.UNO.Client.IClient;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author torre
 */
public class Server extends UnicastRemoteObject implements IServer {
    
    private static final long serialVersionUID = 1L;
    private ArrayList<IClient> clients;
    public ArrayList<Card> cards;
    public Card lastCard;
    
    protected Server() throws RemoteException {
        clients = new ArrayList<IClient>();
        this.createCards();
    }
    
    public synchronized void registerClient(IClient client) throws RemoteException {
        this.clients.add(client);
        if(clients.size() > 1){
            System.out.println("The game has started;");
            this.gameStart();
        }
    }
    
    public synchronized void broadcastCard(Card card) throws RemoteException {
        int i = 0;
        while(i < clients.size()){
            clients.get(i++).retrieveCard(card);
        }
    }
    
    private synchronized void createCards() throws RemoteException {
        cards = new ArrayList<Card>();
        for(int i = 0; i < 11; i++){
            String value = Integer.toString(i);
            if(i < 10){
                Card c = new Card("red", value);
                cards.add(c);
            }else{
                Card c = new Card("red", "skip");
                cards.add(c);
                c = new Card("red", "reverse");
                cards.add(c);
                c = new Card("red", "+2");
            }
        }
        
        for(int i = 0; i < 11; i++){
            String value = Integer.toString(i);
            if(i < 10){
                Card c = new Card("yellow", value);
                cards.add(c);
            }else{
                Card c = new Card("yellow", "skip");
                cards.add(c);
                c = new Card("yellow", "reverse");
                cards.add(c);
                c = new Card("yellow", "+2");
            }
        }
        
        for(int i = 0; i < 11; i++){
            String value = Integer.toString(i);
            if(i < 10){
                Card c = new Card("green", value);
                cards.add(c);
            }else{
                Card c = new Card("green", "skip");
                cards.add(c);
                c = new Card("green", "reverse");
                cards.add(c);
                c = new Card("green", "+2");
            }
        }
        
        for(int i = 0; i < 11; i++){
            String value = Integer.toString(i);
            if(i < 10){
                Card c = new Card("blue", value);
                cards.add(c);
            }else{
                Card c = new Card("blue", "skip");
                cards.add(c);
                c = new Card("blue", "reverse");
                cards.add(c);
                c = new Card("blue", "+2");
            }
        }
        
        Card c = new Card("black", "color");
        cards.add(c);
        
        c = new Card("black", "+4");
        cards.add(c);
    }
    
    public Card getCard() throws RemoteException {
        int randomNumber = ThreadLocalRandom.current().nextInt(0, cards.size() + 1);
        return cards.get(randomNumber);
    }
    
    public synchronized void gameStart() throws RemoteException {
        int randomNumber = ThreadLocalRandom.current().nextInt(0, cards.size() + 1);
        lastCard = new Card("yellow", Integer.toString(randomNumber));
        this.broadcastCard(lastCard);
    }
}
