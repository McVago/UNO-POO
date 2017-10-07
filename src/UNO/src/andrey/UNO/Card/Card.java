/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Card;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author torre
 */
public class Card extends UnicastRemoteObject implements ICard {
    
    private static final long serialVersionUID = 1L;
    public String color;
    public String value;
    
    
    public Card(String color, String value) throws RemoteException {
        this.color = color;
        this.value = value;
    }
}
