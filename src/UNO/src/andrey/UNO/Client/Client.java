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
    Card card = new Card("blue", "0");
    private ArrayList<Card> deck = new ArrayList<>();;
    
    protected Client(IServer server) throws RemoteException{

        card.createCards();
        this.server = server;        
        
        for(int i = 0; i < 7; i++){ 
            deck.add(this.card.getCard());
            System.out.println(deck.get(i).value + " " + deck.get(i).color);
        }
        
        register();
    }
    
    private void register() throws RemoteException {
        server.registerClient(this);
    }

    
    public void retrieveCard(String color, String value) throws RemoteException {
        System.out.println("La ultima carta jugada es: " + color + " " + value);
    }

    public void run() {
        try{
            
            System.out.println("Connected;");
            
        }catch(Exception e){e.printStackTrace();}
    }
    
}
