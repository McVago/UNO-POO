import javafx.scene.image.ImageView;
import java.io.IOException;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

public class CardPack {

	private Card[] deck;
	private int nextCard;
	private ImageView cardimage;
	private ImageView tempCardimage;

	public CardPack() throws IOException {
		this.deck = new Card[108];
		this.nextCard = 0;
		/*
		   Value 11 for skip
		   Value 13 for reverse
		   Value 15 for +2
		   Value 21 for Color Change
		   Value 23 for +4
		*/
		String[] type = {"O", "1", "2", "3", "4", "5", "6", "7", "8", "9", "skip","reverse", "+2", "ColorChange", "+4"};
		String[] color = {"red","blue","green","yellow"};
		int[] value = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 15, 21, 23};

		final int CardX = 240;
		final int CardY = 360;
		final int Rows = 8;
		final int Columns = 14;

		BufferedImage allCards = ImageIO.read(new File("res/img/Card Deck.png"));
		Image imgonSwing = SwingFXUtils.toFXImage(allCards, null);

		this.imgviewset = new ImageView(imgonSwing);
		BufferedImage tempimagecard;

	}
	public Card TakeCard() {
		if (this.nextCard < this.deck.length) {
			return this.deck[this.nextCard++];
		}
		return null;
	}
	public void test() {
		for (Card k : this.deck) {
			System.out.println(k)
		}
	}
}
