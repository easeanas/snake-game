package Snake;
import java.util.ArrayList;

import Application.GUI;
import Render.Board;

public class Game {
	private static Star star;
	private Board board;
	private static Snake snake;
	private static ArrayList<ArrayList<Tile>> tiles;
	
	
	public Game() {
		tiles = new ArrayList<ArrayList<Tile>>();
		//Add file reader to load level
		int count = 0;
		int cols = Board.getCellsPerCol();
		int rows = Board.getCellsPerRow();
		while (count < rows) {
			ArrayList<Tile> col = new ArrayList<>();
			int count2 = 0;
			while (count2 < cols) {
				if (count2 == 1 && count == 1) {
					col.add(new SnakeHead(new Position(count, count2)));
				}
				col.add(new Tile(null)); //Create a null tile? //TODO
				count2++;
			}
			tiles.add(col);
			count++;
		}
	}

	public static Star getStar() {
		return star;
	}

	public static Snake getSnake() {
		return snake;
	}

	public static Tile getTile(int row, int col) {
		return tiles.get(row).get(col);
	}
}
