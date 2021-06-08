package snake;

import javax.swing.ImageIcon;

/**
 * The Star class is a subclass of the tile class. 
 * It represents the points in the snake game.
 * The stars are what the snake "eats" to grow longer.
 *
 * @author Anastasia Ease
 *
 */
public class Star extends Tile{
	
	/**
	 * The star constructor sets the position and image of the star tile.
 * @param position
 */
public Star(Position position) {
		super(position);
		this.position = position;
		this.img = new ImageIcon("src/Render/Render/Images/star.png");
	}
}
