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

/**
 *
 * @author torre
 */
public class Server extends UnicastRemoteObject implements IServer {
    
    private static final long serialVersionUID = 1L;
    private ArrayList<IClient> clients;
    public Card lastCard = new Card("blue", "0");
    
    protected Server() throws RemoteException {
        clients = new ArrayList<IClient>();
        lastCard.createCards();
        lastCard = lastCard.getCard();
        System.out.println(lastCard.color + lastCard.value);
    }
    
    public synchronized void registerClient(IClient client) throws RemoteException {
        this.clients.add(client);
        broadcastCard(lastCard.color, lastCard.value);
    }
    
    public void broadcastCard(String color, String value) throws RemoteException {
        int i = 0;
        while(i < clients.size()){
            clients.get(i++).retrieveCard(color, value);
        }
    }
}
