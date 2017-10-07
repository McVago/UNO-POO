/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.imageio.ImageIO;
import javafx.embed.swing.SwingFXUtils;

/**
 *
 * @author Andres Garcia
 */
public class Deck {
    private Card[] Pack;
    private int nextCard;
    private ImageView imgViewsetCard;
    private ImageView tempImageViewValueCard;
    
    public Deck() throws IOException {
        this.Pack = new Card[108];
        this.nextCard = 0;
        
        String[] CardType = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14"};
        String[] Color = {"Green","Blue","Red","Yellow","Black"};
        int[] value = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        
        final int CardX = 146;
        final int CardY = 219;
        final int Rows = 8;
        final int Columns = 12;
        
        BufferedImage vsSetCardValue = ImageIO.read(new File("Deck.png", null));
        Image ImgVsetCard = SwingFXUtils.toFXImage(vsSetCardValue, null);
        
        this.imgViewsetCard = new ImageView(ImgVsetCard);
        BufferedImage tempValueCard;
        
        for (int Colort = 0; Colort < Rows; Colort ++){
            for (int CardTypet = 0; CardTypet < Columns; CardTypet++){
                tempValueCard = vsSetCardValue.getSubimage(
                CardTypet * CardX, Colort * CardY, CardX, CardY);
                Image tempImgValueCard = SwingFXUtils.toFXImage(tempValueCard, null);
                this.tempImageViewValueCard = new ImageView(tempImgValueCard);
                this.Pack[(CardTypet*(Colort * 8))] = new Card(
                CardType[CardTypet], Color[Colort], CardTypet, this.tempImageViewValueCard
                );
            }
        }
        
    }
        public Card takeCard(){
            if (this.nextCard < this.Pack.length){
                return this.Pack[nextCard++];
            }
            return null;
        }
        public void test(){
            for ( Card k : Pack){
                System.out.println(k);
            }
        }
    }

