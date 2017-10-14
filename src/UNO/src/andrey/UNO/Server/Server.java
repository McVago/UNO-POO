/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Server;

import andrey.UNO.Card.Card;
import andrey.UNO.Client.IClient;
import andrey.UNO.Server.IView;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author torre
 */
public class Server extends UnicastRemoteObject implements IServer, Action {
    
    private static final long serialVersionUID = 1L;
    private ArrayList<IClient> clients; //All registered clients
    public Card lastCard = new Card("blue", "0"); //Creates a new card to acces card's methods
    private int newID = 1; //Assigns this value to new clients (starts -> 1)
    private int clientTurnId = 1; //Client's turn (first in first move)
    private int lastPlayerID = 0;
    private boolean reverse = false; //To check the reverse card status
    private IView view;
    
    protected Server(IView view) throws RemoteException {
        clients = new ArrayList<IClient>();
        lastCard.createCards();
        lastCard = lastCard.getCard();
        this.view = view;
        System.out.println(lastCard.color + " " + lastCard.value);
    }
    
    //Register client into the arraylist clients and sets unique ID
    public synchronized void registerClient(IClient client) throws RemoteException {
        this.clients.add(client);
        client.setID(newID++);
        broadcastCard(lastCard.color, lastCard.value);
    }
    
    //Show last card played to all clients
    public void broadcastCard(String color, String value) throws RemoteException {
        int i = 0;
        while(i < clients.size()){
            clients.get(i++).retrieveCard(color, value);
        }
    }
    
    //Show the last player cards left
    public void broadcastDeckCount(int cardsLeft) throws RemoteException { 
        int i = 0;
        while(i < clients.size()){
            clients.get(i++).retrieveDeckCount(lastPlayerID, cardsLeft);
        }
    }
    
    //Show whos turn it is
    public void broadcastPlayerTurn() throws RemoteException {
        int i = 0;
        while(i < clients.size()){
            clients.get(i++).receiveMessage("\n || Es el turno del Player: " + clientTurnId + " || \n");
        }
    }
    
    
   // Tests card, if it is a valid move, if reverse, if skip, if +2, if +4 
    public synchronized boolean testCard(String color, String value, int clientID) throws RemoteException {
        System.out.println(color + " " + value + " " + clientID);
        if(clients.size() > 1){
            if(reverse){
                return this.testCardReverse(color, value, clientID);
            }else{
                if(clientID == clientTurnId){
                    System.out.println("Se concede el turno a la persona");
                    this.lastPlayerID = clientTurnId;
                    if(Objects.equals(color, lastCard.color) || Objects.equals(value, lastCard.value) || Objects.equals(value, Action.DrawFour) || Objects.equals(value, Action.ColorChange)){
                        System.out.println("La carta fue valida");
                        lastCard.color = color;
                        lastCard.value = value;
                        if(Objects.equals(value, Action.Reverse)){
                            this.reverse = !reverse;
                            clientTurnId--;
                            if(clientTurnId < 1){
                                clientTurnId = clients.size();
                            }
                            this.broadcastPlayerTurn();
                            this.broadcastCard(lastCard.color, lastCard.value);
                            return true;
                        }
                        if(Objects.equals(value, Action.Skip)){
                            clientTurnId++;
                            if(clientTurnId > clients.size()){
                                clientTurnId = 1;
                            }
                        }
                        if(Objects.equals(value, Action.DrawTwo)){
                            boolean done = false;
                            int i = 1;
                            while(i <= clients.size()){
                                if(i == clientID+1){
                                    clients.get(i-1).get2();
                                    done = true;
                                    break;
                                }
                                i++;
                            }
                            if(!done){
                                clients.get(0).get2();
                            }
                        }
                        if(Objects.equals(value, Action.DrawFour)){
                            boolean done = false;
                            int i = 1;
                            while(i <= clients.size()){
                                if(i == clientID+1){
                                    clients.get(i-1).get2();
                                    clients.get(i-1).get2();
                                    done = true;
                                    break;
                                }
                                i++;
                            }
                            if(!done){
                                clients.get(0).get2();
                                clients.get(0).get2();
                            }
                        }
                        clientTurnId++;
                        if(clientTurnId > clients.size()){
                            clientTurnId = 1;
                        }
                        this.broadcastPlayerTurn();
                        this.broadcastCard(lastCard.color, lastCard.value);
                        return true;
                    }else{
                        int i = 1;
                        while(i <= clients.size()){
                            if(i == clientID){
                                clients.get(i-1).receiveMessage("Su carta no es valida");
                                break;
                            }
                            i++;
                        }
                        return false;
                    }
                }else{
                    int i = 1;
                    while(i <= clients.size()){
                        if(i == clientID){
                            clients.get(i-1).receiveMessage("No es su turno");
                            break;
                        }
                        i++;
                    }
                    return false;
                }
            }
        }else{
            clients.get(0).receiveMessage("No hay suficientes jugadores");
        }
        return false;
    }
    
    // When reverse is active tests cards with this function
    public synchronized boolean testCardReverse(String color, String value, int clientID) throws RemoteException {
        if(clientID == this.clientTurnId){
            this.lastPlayerID = clientTurnId;
            if(Objects.equals(color, lastCard.color) || Objects.equals(value, lastCard.value) || Objects.equals(value, "+4") || Objects.equals(value, "colorchange")){
                lastCard.color = color;
                lastCard.value = value;
                if(Objects.equals(value, Action.Reverse)){
                    this.reverse = !reverse;
                    clientTurnId++;
                    if(clientTurnId > clients.size()){
                        clientTurnId = 1;
                    }
                    this.broadcastPlayerTurn();
                    this.broadcastCard(lastCard.color, lastCard.value);
                    return true;
                }
                if(Objects.equals(value, Action.Skip)){
                    clientTurnId--;
                    if(clientTurnId < 1){
                        clientTurnId = clients.size();
                    }
                }
                if(Objects.equals(value, Action.DrawTwo)){
                    boolean done = false;
                    int i = 1;
                    while(i <= clients.size()){
                        if(i == clientID-1){
                            clients.get(i-1).get2();
                            done = true;
                            break;
                        }
                        i++;
                    }
                    if(!done){
                        clients.get(clients.size()-1).get2();
                    }
                }
                if(Objects.equals(value, Action.DrawFour)){
                    boolean done = false;
                    int i = 1;
                    while(i <= clients.size()){
                        if(i == clientID+1){
                            clients.get(i-1).get2();
                            clients.get(i-1).get2();
                            done = true;
                            break;
                        }
                        i++;
                    }
                    if(!done){
                        clients.get(clients.size()-1).get2();
                        clients.get(clients.size()-1).get2();
                    }
                }
                clientTurnId--;
                if(clientTurnId < 1){
                    clientTurnId = clients.size();
                }
                this.broadcastPlayerTurn();
                this.broadcastCard(lastCard.color, lastCard.value);
                return true;
            }else{
                int i = 1;
                while(i <= clients.size()){
                    if(i == clientID){
                        clients.get(i-1).receiveMessage("Su carta no es valida");
                        break;
                    }
                    i++;
                }
                return false;
            }
        }else{
            int i = 1;
            while(i <= clients.size()){
                if(i == clientID){
                    clients.get(i-1).receiveMessage("No es su turno");
                    break;
                }
                i++;
            }
            return false;
        }
    }
    
    //To skip the client's turn
    public void skipTurn() throws RemoteException {
        int i = 0;
        while(i < clients.size()){
            clients.get(i++).receiveMessage("El turno del Player " + clientTurnId + " fue saltado");
        }
        if(!reverse){
            this.clientTurnId++;
            if(clientTurnId > clients.size())
                clientTurnId = 1;
        }
        else{
            this.clientTurnId--;
            if(clientTurnId < 1)
                clientTurnId = clients.size();
        }
        System.out.println("\n\n || Turno saltado, turno actual del cliente: " + clientTurnId+" ||\n\n");
    }  
}
