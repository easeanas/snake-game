package snake;

import javax.swing.ImageIcon;

/**
 * The Tile class represents the a tile on the board (cell).
 * This has a position and an image if the tile is not blank.
 *
 * @author Anastasia Ease
 *
 */
public class Tile {
	Position position;
	ImageIcon img;
	
	/**
	 * The tile constructor sets the position and the default image.
	 *
 * @param position of the tile
 */
public Tile(Position position) {
		this.position = position;
		this.img = new ImageIcon("src/Render/Render/Images/blankTile.png");
	}

	/**
	 * Gets the position of the tile.
	 *
  * @return position of the tile
  */
 public Position getPosition() {
		return this.position;
	}
 
	/**
	 * Sets the position of the tile.
	 *
  * @param position of the tile
  */
 public void setPosition(Position position) {
		this.position = position;
	}
	/**
	 * Gets the image for the tile.
	 *
  * @return tile image
  */
 public ImageIcon getImage() {
		return this.img;
	}
}
