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

/**
 *
 * @author torre
 */
public class Client extends UnicastRemoteObject implements IClient, Runnable {
    
    private static final long serialVersionUID = 1L;
    IServer server;
    private ArrayList<Card> deck;
    
    protected Client(IServer server) throws RemoteException{
        this.server = server;
        server.registerClient(this);
        deck = new ArrayList<Card>();
    }

    
    public void retrieveCard(Card card) throws RemoteException {
        System.out.println("La ultima carta jugada es: " + card.color + " " + card.value);
    }

    public void run() {
        try{
            
            for(int i = 0; i < 7; i++){
                Card c = server.getCard();
                deck.add(c);
            }
            
            int i = 0;
            while(i < 3){
                System.out.println(deck.get(i).value + " " + deck.get(i++).color);
                i++;
            }
            
        }catch(Exception e){e.printStackTrace();}
    }
    
}
