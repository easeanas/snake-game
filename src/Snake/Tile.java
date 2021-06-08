package Snake;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tile {
	Position position;
	ImageIcon img;
	
	public Tile(Position position) {
		this.position = position;
		img = new ImageIcon("src/Render/Render/Images/blankTile.png");
	}

	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public ImageIcon getImage() {
		return img;
	}
}
