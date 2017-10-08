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
                Card c = (Card)new Card("red", value);
                cards.add(c);
            }else{
                Card c = (Card)new Card("red", "skip");
                cards.add(c);
                c = (Card)new Card("red", "reverse");
                cards.add(c);
                c = (Card)new Card("red", "+2");
                cards.add(c);
            }
        }
        
        for(int i = 0; i < 11; i++){
            String value = Integer.toString(i);
            if(i < 10){
                Card c = (Card)new Card("yellow", value);
                cards.add(c);
            }else{
                Card c = (Card)new Card("yellow", "skip");
                cards.add(c);
                c = (Card)new Card("yellow", "reverse");
                cards.add(c);
                c = (Card)new Card("yellow", "+2");
                cards.add(c);
            }
        }
        
        for(int i = 0; i < 11; i++){
            String value = Integer.toString(i);
            if(i < 10){
                Card c = (Card)new Card("green", value);
                cards.add(c);
            }else{
                Card c = (Card)new Card("green", "skip");
                cards.add(c);
                c = (Card)new Card("green", "reverse");
                cards.add(c);
                c = (Card)new Card("green", "+2");
                cards.add(c);
            }
        }
        
        for(int i = 0; i < 11; i++){
            String value = Integer.toString(i);
            if(i < 10){
                Card c = (Card)new Card("blue", value);
                cards.add(c);
            }else{
                Card c = (Card)new Card("blue", "skip");
                cards.add(c);
                c = (Card)new Card("blue", "reverse");
                cards.add(c);
                c = (Card)new Card("blue", "+2");
                cards.add(c);
            }
        }
        
        Card c = (Card)new Card("black", "color");
        cards.add(c);
        
        c = (Card)new Card("black", "+4");
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
