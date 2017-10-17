/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author torre
 */
public interface IClient extends Remote {
    
    public void retrieveCard(String color, String value) throws RemoteException;
    
    public void retrieveDeckCount(int playerID, int cardsLeft) throws RemoteException;
    
    public void setID(int ID) throws RemoteException;
    
    public void receiveMessage(String message) throws RemoteException;
    
    public void getnewCard() throws RemoteException;
    
    public void get2() throws RemoteException;
    
    public void skipTurn() throws RemoteException;
    
    public void printCards() throws RemoteException;
    
    public boolean sendCard(String color, String value) throws RemoteException;
    
    public boolean testTurn() throws RemoteException;
    
}
