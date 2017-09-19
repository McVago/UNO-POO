import javafx.scene.image.ImageView;
public class Card {
	private String number;
	private String color;
	private int value;
	private ImageView image;
	public Card(String number, String color, int value, ImageView image){
		this.type = type;
		this.color = color;
		this.value = value;
		this.image = image;
		this.image.setFitHeight(240);
		this.image.setFitWidth(135);
	}
	public String toString() {
		return this.type + " " + this.color;
	}
	public String getType() {
		return this.type;
	}
	public String getColor() {
		return this.color;
	}
	public int getValue() {
		return this.value;
	}
	public ImageView getImage() {
		return this.image;
	}
	public Card getCard() {
		return this;
	}
}
