/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Client;

import andrey.UNO.Card.Card;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author torre
 */
public interface IClient extends Remote {
    
    public void retrieveCard(String color, String value) throws RemoteException;
    
}
