package render;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import snake.Star;
import snake.Tile;
import snake.Game;
import snake.Position;
import snake.Snake;
import snake.SnakeHead;
import snake.SnakePart;

public class Board extends JPanel {
	  private Game game;
	  private int cellsPerCol;
	  private int cellsPerRow;
	  private Tile tiles[]; //what si this for?
	  private JLabel labels[];

	  private JPanel boardPanel;

    /**
     * The board constructor, which sets the game and gamePanel objects.
     * It also sets the dimensions (number of rows and cols) of the board.
     * 
     * @param game
     * @param gamePanel
     * @param rows
     * @param cols
     */
	public Board(Game game, JPanel gamePanel, int rows, int cols){
		this.boardPanel = gamePanel;
		this.cellsPerCol = cols;
		this.cellsPerRow = rows;
	    setup();
	  }

	  /**
	   * Setup the board.
	   */
	  private void setup() {
	   // boardPanel.setSize(680,680);
	    setLabels();
	    redraw();
	  }

	  /**
	 * Sets the JLables of each cell in the board with their image.
	 */
	public void setLabels() {
			//Is the get method necessary?
		  this.labels = new JLabel[(this.cellsPerCol*getCellsPerRow())];
		  for (int i =  0; i < this.cellsPerCol; i++) {
		    	for (int j = 0; j < this.cellsPerRow; j++) {
		    		JLabel label = new JLabel(new Tile(new Position(i, j)).getImage());
		    		this.boardPanel.add(label);
		    	}
		  }
	      this.boardPanel.validate();
	      this.boardPanel.repaint();
	  }
	  
	  /**
	   * Redraw the board when any changes to it have been made.
	   * Updates the display.
	   */
	  public void redraw() {
		  this.boardPanel.removeAll();
	      this.boardPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SNAKE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Silom", 0, 18), new java.awt.Color(245, 225, 53))); // NOI18N
		  //boardPanel.setBackground(new java.awt.Color(15, 0, 104));

	    Snake snake = Game.getSnake();
	    //Position snakePos = snake.getHeadPosition();

	    for (int i =  0; i < this.cellsPerCol; i++) {
	    	for (int j = 0; j < this.cellsPerRow; j++) {
		      
		      Tile tile = this.game.getTile(i, j);
	    	  tile.setPosition(new Position(i,j));
	    	  this.labels[i*this.cellsPerRow+j].setIcon(tile.getImage());  
		  
		      //boardPanel.add(labels[i+j]);
		      this.boardPanel.revalidate();
		      this.boardPanel.repaint();
		      System.out.println("LOOP: i = "+i+", j= "+j);
//Chekc 
	    	}
	    }
	    this.boardPanel.updateUI();
	  }

	  /**
	   * Get the current board.
	   * @return JPanel board
	   */
	  public JPanel getBoardPanel(){return this.boardPanel;}

	  /**
	   * Play sound of the given URL
	   * @param url
	   */
	  public static void playSound(URL url){
	    try {
	      AudioClip clip = Applet.newAudioClip(url);
	      clip.play();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
    }

	/**
	 * Gets number of cells per row.
	 * 
	 * @return cells per row
	 */
	public int getCellsPerRow() {
		return this.cellsPerRow;
	}

	/**
	 * Sets number of cells per row.
	 * 
	 * @param cellsPerRow
	 */
	public void setCellsPerRow(int cellsPerRow) {
		this.cellsPerRow = cellsPerRow;
	}

	/**
	 * Gets number of cells per column.
	 * 
	 * @return number of cells per column
	 */
	public int getCellsPerCol() {
		return this.cellsPerCol;
	}
}