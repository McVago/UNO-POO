/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;
import javafx.scene.image.ImageView;

/**
 *
 * @author Andres Garcia
 */
public class Card {
    private String type;
    private String color;
    private int value;
    private ImageView image;
    public Card(String type,String color,int value,ImageView image){
        this.type = type;
        this.color = color;
        this.value = value;
        this.image = image;
        this.image.setFitHeight(240);
        this.image.setFitWidth(148);
        
    }
    public String toString(){
        return this.type + " " + this.color;
    }
    public String getType(){
        return this.type;
    }
    public String getColor(){
        return this.color;
    }
    public int getValue(){
        return this.value;
    }
    public ImageView getImage(){
        return this.image;
    }
}
