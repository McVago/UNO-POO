/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Client;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author andrey
 */
public class ConsoleView implements IView {
        
    IClient client;
    
    public void show(){
    }
    
    public void setLocation(int x, int y){
    }
    
    public void setVisible(boolean var){
    }
    
    public void setClient(IClient client){
        this.client = client;
    }
    
    public void retrieveCard(String color, String value){
        System.out.println("\n----------------> La ultima carta jugada es: || " + color + " || " + value + " ||\n");
    }
    
    public void retrieveDeckCount(int playerID ,int cardsLeft){
        System.out.println("\n || Player " + playerID + " tiene " + cardsLeft + " restantes || \n");
    }
    
    
    public void receiveMessage(String message){
        System.out.println(message);
    }
    
    public void printCards(String color, String value){
        System.out.println(value + " " + color);
    }
    
    public void gamewon(){
        System.out.println("\n\n || YOU WON!! ||\n\n");
    }
    
    public void gameloop(){
        try{
            Scanner scanner = new Scanner(System.in);
            String color;
            String value;

            System.out.println("Color:");
            color = scanner.nextLine();
            System.out.println("Value:");
            value = scanner.nextLine();
            if(Objects.equals(color, "q") || Objects.equals(value, "q")){
                client.getnewCard();
            }
            else if(Objects.equals(color, "w") || Objects.equals(value, "w")){
                client.skipTurn();
            }
            else{
                client.sendCard(color, value);
            }
            client.printCards();
        }catch(Exception e){e.printStackTrace();}    
    } 
}
