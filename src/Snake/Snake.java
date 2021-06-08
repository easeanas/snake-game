package snake;

import java.util.ArrayList;

import snake.Game.Direction;

/**
 * The snake class stores information about the snake.
 *
 * @author Anastasia Ease
 *
 */
public class Snake {
	private int length;
	private Position headPosition;
	private ArrayList<SnakePart> body;
	
	/**
	 * The snake constructors intialises the length and position of the snake.
	 *
  * @param length
  * @param position
  */
	public Snake(int length, Position position) {
		this.length = length;
		this.headPosition = position;
		this.body = new ArrayList<>();
	}
	
	/**
	 * Called when the snake eats a star
	 * Adds a body part to the snake and then updates the position of the snake
	 * @param dir
	 */
	public void ateStar(Direction dir) {
		addStar();
		moveAlong(dir);
	}
	
	private void moveAlong(Direction dir) {
		this.headPosition = new Position(this.headPosition.getX(), this.headPosition.getY());
		for (SnakePart part : this.body) {
			Position oldPos = part.getPosition();
			switch (dir) {
			case RIGHT:
				part.setPosition(new Position(oldPos.getX()+1, oldPos.getY()));
        break;
      case LEFT:
				part.setPosition(new Position(oldPos.getX()-1, oldPos.getY()));
        break;
      case UP:
				part.setPosition(new Position(oldPos.getX(), oldPos.getY()+1));
        break;
      case DOWN:
				part.setPosition(new Position(oldPos.getX(), oldPos.getY()-1));
        break;
      default:
        break;
			}
		}
	}
	
	private void addStar() {
		//Code contract: you can not call this method after the snake has moved because it uses the current position of the last tile
		Position lastStar = this.body.get(this.length-1).getPosition(); 
		this.body.add(new SnakePart(lastStar));
	}
	
	/**
	 * Gets the length of the snake.
	 *
  * @return length of snake
  */
 public int getLength() {
		return this.length;
	}
	/**
	 * Sets the length of the snake.
	 *
  * @param length of snake
  */
 public void setLength(int length) {
		this.length = length;
	}
	/**
	 * Gets the position of the head of the snake.
	 *
  * @return head position
  */
 public Position getHeadPosition() {
		return this.headPosition;
	}
	/**
	 * Sets the head position of the snake.
	 *
  * @param headPosition of the snake
  */
 public void setHeadPosition(Position headPosition) {
		this.headPosition = headPosition;
	}
	
}
