package Snake;

import java.util.ArrayList;

import Snake.Game.Direction;

public class Snake {
	private int length;
	private Position headPosition;
	private ArrayList<SnakePart> body;
	
	public Snake(int length, Position position) {
		this.length = length;
		this.headPosition = position;
		body = new ArrayList<>();
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
		headPosition = new Position(headPosition.getX(), headPosition.getY());
		for (SnakePart part : body) {
			Position oldPos = part.getPosition();
			switch (dir) {
			case RIGHT:
				part.setPosition(new Position(oldPos.getX()+1, oldPos.getY()));
			case LEFT:
				part.setPosition(new Position(oldPos.getX()-1, oldPos.getY()));
			case UP:
				part.setPosition(new Position(oldPos.getX(), oldPos.getY()+1));
			case DOWN:
				part.setPosition(new Position(oldPos.getX(), oldPos.getY()-1));
			}
		}
	}
	
	private void addStar() {
		//Code contract: you can not call this method after the snake has moved because it uses the current position of the last tile
		Position lastStar = body.get(length-1).getPosition(); 
		body.add(new SnakePart(lastStar));
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Position getHeadPosition() {
		return headPosition;
	}
	public void setHeadPosition(Position headPosition) {
		this.headPosition = headPosition;
	}
	
}
