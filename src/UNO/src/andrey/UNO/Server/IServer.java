/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Server;

import andrey.UNO.Card.Card;
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
    
}
