package snake;

import javax.swing.ImageIcon;

public class SnakePart extends Tile{

	public SnakePart(Position position) {
		super(position);
		this.position = position;
		this.img = new ImageIcon("src/Render/Render/Images/snakePart.png");
	}
}

