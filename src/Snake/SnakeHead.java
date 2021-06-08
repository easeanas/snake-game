package snake;

import javax.swing.ImageIcon;

/**
 * The SnakeHead class is a subclass of tile.
 * It represents the snakes head on the board.
 *
 * @author Anastasia Ease
 *
 */
public class SnakeHead extends Tile{
	
	/**
	 * The snake head constructor sets the position and image of the snake head tile.
	 *
  * @param position of the tile
  */
 public SnakeHead(Position position) {
		super(position);
		this.position = position;
		this.img = new ImageIcon("src/Render/Render/Images/snakeHead.png");
	}
}
