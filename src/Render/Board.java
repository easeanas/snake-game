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
	  private static int cellsPerCol = 50;
	  private static int cellsPerRow = 50;
	  private Tile tiles[]; //what si this for?

	  private JPanel boardPanel = new JPanel(new GridLayout(cellsPerRow,cellsPerCol,0,0));

	  public Board(){
	    setup();
	  }

	  /**
	   * Initialise the board.
	   */
	  private void setup() {
	    boardPanel.setSize(680,680);
	    redraw();
	  }

	  /**
	   * Redraw the board when any changes to it has been made.
	   * Updates the display.
	   */
	  public void redraw() {
		  boardPanel.removeAll();
	      boardPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SNAKE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Silom", 0, 18), new java.awt.Color(245, 225, 53))); // NOI18N
		  boardPanel.setBackground(new java.awt.Color(15, 0, 104));

	    JLabel labels[] = new JLabel[(cellsPerCol*getCellsPerRow())];
	    Snake snake = Game.getSnake();
	    //Position snakePos = snake.getHeadPosition();

	    for (int i =  0; i < cellsPerCol; i++) {
	    	for (int j = 0; j < cellsPerRow; j++) {
		      JLabel label;
		      
		      Tile tile = Game.getTile(i, j);
		      if (tile instanceof SnakeHead) {
		    	  label = new JLabel(new SnakeHead(new Position(i, j)).getImage());  
		      }
		      else if (tile instanceof SnakePart) {
		    	  label = new JLabel(new SnakePart(new Position(i, j)).getImage());   
		      }
		      else {
		    	  label = new JLabel(new Tile(new Position(i, j)).getImage()); 
	    	  }
		      
		      labels[i+j] = label;
		      boardPanel.add(labels[i+j]);
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

	public static int getCellsPerRow() {
		return cellsPerRow;
	}

	public void setCellsPerRow(int cellsPerRow) {
		this.cellsPerRow = cellsPerRow;
	}

	public static int getCellsPerCol() {
		return cellsPerCol;
	}
}