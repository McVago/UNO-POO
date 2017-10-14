/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Client;

/**
 *
 * @author andrey
 */
public interface IView {
    
    public void setClient(IClient client);
    
    public void retrieveCard(String color, String value);
    
    public void retrieveDeckCount(int playerID ,int cardsLeft);
    
    public void receiveMessage(String message);
    
    public void printCards(String color, String value);
    
    public void gameloop();
    
    public void gamewon();
 
}
