/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author torre
 */
public class ServerDriver {
    
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        try {
            
            Naming.rebind("UNO", new Server());
            
        } catch (RemoteException ex) {ex.printStackTrace();}
    }
}
