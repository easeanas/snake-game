package snake;

import javax.swing.ImageIcon;

public class Star extends Tile{
	
	public Star(Position position) {
		super(position);
		this.position = position;
		this.img = new ImageIcon("src/Render/Render/Images/star.png");
	}
}
