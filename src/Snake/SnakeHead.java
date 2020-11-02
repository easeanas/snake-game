package Snake;

import javax.swing.ImageIcon;

public class SnakeHead extends Tile{
	
	public SnakeHead(Position position) {
		super(position);
		this.position = position;
		this.img = new ImageIcon("src/Render/Render.Images/snakeHead.png");
	}
}
