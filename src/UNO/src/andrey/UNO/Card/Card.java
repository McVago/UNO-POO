/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Card;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author torre
 */
public class Card extends UnicastRemoteObject implements ICard {
    
    private static final long serialVersionUID = 1L;
    public String color;
    public String value;
    public ArrayList<Card> cards = new ArrayList<Card>(); //Arraylist with all possible cards
    
    
    public Card(String color, String value) throws RemoteException {
        this.color = color;
        this.value = value;   
    }

    //Create all possible cards
    public synchronized void createCards() throws RemoteException {
        
        for(int i = 0; i < 11; i++){
            String value = Integer.toString(i);
            if(i < 10){
                Card c = (Card)new Card("Red", value);
                cards.add(c);
            }else{
                Card c = (Card)new Card("Red", "Skip");
                cards.add(c);
                c = (Card)new Card("Red", "Reverse");
                cards.add(c);
                c = (Card)new Card("Red", "+2");
                cards.add(c);
            }
        }
        
        for(int i = 0; i < 11; i++){
            String value = Integer.toString(i);
            if(i < 10){
                Card c = (Card)new Card("Yellow", value);
                cards.add(c);
            }else{
                Card c = (Card)new Card("Yellow", "Skip");
                cards.add(c);
                c = (Card)new Card("Yellow", "Reverse");
                cards.add(c);
                c = (Card)new Card("Yellow", "+2");
                cards.add(c);
            }
        }
        
        for(int i = 0; i < 11; i++){
            String value = Integer.toString(i);
            if(i < 10){
                Card c = (Card)new Card("Green", value);
                cards.add(c);
            }else{
                Card c = (Card)new Card("Green", "Skip");
                cards.add(c);
                c = (Card)new Card("Green", "Reverse");
                cards.add(c);
                c = (Card)new Card("Green", "+2");
                cards.add(c);
            }
        }
        
        for(int i = 0; i < 11; i++){
            String value = Integer.toString(i);
            if(i < 10){
                Card c = (Card)new Card("Blue", value);
                cards.add(c);
            }else{
                Card c = (Card)new Card("Blue", "Skip");
                cards.add(c);
                c = (Card)new Card("Blue", "Reverse");
                cards.add(c);
                c = (Card)new Card("Blue", "+2");
                cards.add(c);
            }
        }
        
        Card c = (Card)new Card("Black", "Colorchange");
        cards.add(c);
        
        c = (Card)new Card("Black", "+4");
        cards.add(c);
    }
    
    //Returns a card to add to a deck
    public Card getCard() throws RemoteException {
        int randomNumber = ThreadLocalRandom.current().nextInt(0, cards.size());
        return cards.get(randomNumber);
    }
    
    public static void main(String[] args) throws RemoteException {
        Card c = new Card("blue", "0");
        c.createCards();
    }
}
