package Snake;

import java.util.ArrayList;

public class Snake {
	private int length;
	private Position headPosition;
	private ArrayList<Tile> body;
	
	public Snake(int length, Position position) {
		this.length = length;
		this.headPosition = position;
		body = new ArrayList<>();
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
