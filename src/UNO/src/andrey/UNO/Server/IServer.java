/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Server;

import andrey.UNO.Client.IClient;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author torre
 */
public interface IServer extends Remote {
    
    public void registerClient(IClient client) throws RemoteException;
    
    public void broadcastCard(String color, String value) throws RemoteException;
    
    public void broadcastDeckCount(int cardsLeft) throws RemoteException;
    
    public boolean testCard(String color, String value, int clientID) throws RemoteException;
    
    public void skipTurn() throws RemoteException;
    
    public boolean testTurn(int ID) throws RemoteException;
    
    
}
