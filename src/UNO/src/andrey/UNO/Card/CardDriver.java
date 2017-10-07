/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Card;

import andrey.UNO.Server.IServer;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author torre
 */
public class CardDriver {
    
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        try {
            
            String serverURL = "rmi://localhost/UNO";
            IServer server = (IServer) Naming.lookup(serverURL);
            Card c = new Card("blue", "0");
            
        } catch (RemoteException ex) {ex.printStackTrace();}
    }
    
}
