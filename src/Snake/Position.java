package snake;

/**
 * The position class represents a an x,y coordinate on the board.
 *
 * @author Anastasia Ease
 *
 */
public class Position {
	int x;
	int y;
	
	/**
	 * The position constructor sets the x and y coordinate of the position.
	 *
  * @param x coord
  * @param y coord
  */
 public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Gets the x coordinate.
	 *
  * @return x coordinate
  */
 public int getX() {
		return this.x;
	}

	/**
	 * Gets the y coordinate.
	 *
  * @return y coordinate
  */
 public int getY() {
		return this.y;
	}
}
