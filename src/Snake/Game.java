package snake;

import java.util.ArrayList;

import application.GUI;
import render.Board;

/**
 * The game class stores information about the state of the game. This includes
 * storing the star, the tiles, the board, and the snake.
 * 
 * @author Anastasia Ease
 *
 */
public class Game {
  private static Star star;
  private Board board;
  private static Snake snake;
  private ArrayList<ArrayList<Tile>> tiles;

  /**
   * The directions of movement the player can make.
   */
  public enum Direction {
    RIGHT, LEFT, UP, DOWN
  }

  /**
   * Initalises the board and sets all cells.
   * 
   * @param b
   */
  public void init(Board b) {
    this.board = b;
    // Add file reader to load level or just set random goal TODO:
    int cols = this.board.getCellsPerCol();
    int rows = this.board.getCellsPerRow();
    this.tiles = new ArrayList<>();
    
    int rowCount = 0;
    while (rowCount < rows) {
      int colCount = 0;
      
      ArrayList<Tile> col = new ArrayList<>();
      
      while (colCount < cols) {
        if (colCount == 1 && rowCount == 1) {
          col.add(new SnakeHead(new Position(rowCount, colCount)));
        } else {
          col.add(new Tile(new Position(rowCount, colCount)));
        }
        colCount++;
      }
      this.tiles.add(col);
      rowCount++;
    }
    System.out.println("****\n"+tiles);
  }

  /**
   * Gets the star.
   * 
   * @return the star
   */
  public static Star getStar() {
    return star;
  }

  /**
   * Gets the snake object.
   * 
   * @return the snake
   */
  public static Snake getSnake() {
    return snake;
  }

  /**
   * Gets the tile at the given position.
   * 
   * @param row
   * @param col
   * @return tile at row, col
   */
  public Tile getTile(int row, int col) {
    return this.tiles.get(row).get(col);
  }
}
