package snake;

import javax.swing.ImageIcon;

/**
 * The SnakePart class is a subclass of tile.
 * It represents one of the parts of the snake. 
 * The number of snake parts in a snake corresponds to the length of the snake.
 *
 * @author Anastasia Ease
 *
 */
public class SnakePart extends Tile{

	/**
	 * The snakePart constructor sets the position and image of the snakePart tile.
	 *
  * @param position of the tile
  */
 public SnakePart(Position position) {
		super(position);
		this.position = position;
		this.img = new ImageIcon("src/Render/Render/Images/snakePart.png");
	}
}

