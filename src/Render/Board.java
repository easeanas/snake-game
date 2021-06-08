package Render;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Snake.Star;
import Snake.Tile;
import Snake.Game;
import Snake.Position;
import Snake.Snake;
import Snake.SnakeHead;
import Snake.SnakePart;

public class Board extends JPanel {
	  private Game game;
	  private int cellsPerCol;
	  private int cellsPerRow;
	  private Tile tiles[]; //what si this for?
	  private JLabel labels[];

	  private JPanel boardPanel;

	  public Board(Game game, JPanel gamePanel, int rows, int cols){
		boardPanel = gamePanel;
		cellsPerCol = cols;
		cellsPerRow = rows;
	    setup();
	  }

	  /**
	   * Initialise the board.
	   */
	  private void setup() {
	    boardPanel.setSize(680,680);
	    setLabels();
	    //redraw();
	  }

	  public void setLabels() {
			//Is the get method necessary?
		  labels = new JLabel[(cellsPerCol*getCellsPerRow())];
		  for (int i =  0; i < cellsPerCol; i++) {
		    	for (int j = 0; j < cellsPerRow; j++) {
		    		JLabel label = new JLabel(new Tile(new Position(i, j)).getImage());
		    		boardPanel.add(label);
		    	}
		  }
	      boardPanel.validate();
	      boardPanel.repaint();
	  }
	  
	  /**
	   * Redraw the board when any changes to it has been made.
	   * Updates the display.
	   */
	  public void redraw() {
		  boardPanel.removeAll();
	      boardPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SNAKE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Silom", 0, 18), new java.awt.Color(245, 225, 53))); // NOI18N
		  //boardPanel.setBackground(new java.awt.Color(15, 0, 104));

	    Snake snake = Game.getSnake();
	    //Position snakePos = snake.getHeadPosition();

	    for (int i =  0; i < cellsPerCol; i++) {
	    	for (int j = 0; j < cellsPerRow; j++) {
		      
		      Tile tile = game.getTile(i, j);
	    	  tile.setPosition(new Position(i,j));
	    	  labels[i*cellsPerRow+j].setIcon(tile.getImage());  
		  
		      //boardPanel.add(labels[i+j]);
		      boardPanel.revalidate();
		      boardPanel.repaint();
		      System.out.println("LOOP: i = "+i+", j= "+j);
//Chekc 
	    	}
	    }
	    boardPanel.updateUI();
	  }

	  /**
	   * Get the current board.
	   * @return JPanel board
	   */
	  public JPanel getBoardPanel(){return boardPanel;}

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

	public int getCellsPerRow() {
		return cellsPerRow;
	}

	public void setCellsPerRow(int cellsPerRow) {
		this.cellsPerRow = cellsPerRow;
	}

	public int getCellsPerCol() {
		return cellsPerCol;
	}
}