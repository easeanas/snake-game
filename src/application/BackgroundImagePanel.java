package application;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Background image panel allows for the background to be one full image.
 *
 * @author Anastasia Ease
 *
 */
public class BackgroundImagePanel extends JPanel {
  /**
   * Default serialVersionUID.
   */
  private static final long serialVersionUID = 1L;

  Image background;

  /**
   * Initializes a new JPanel with the main background image.
   *
   * @param cellsPerRow number of cells in each row
   * @param cellsPerCol number of cells in each column
   */
  public BackgroundImagePanel(int cellsPerRow, int cellsPerCol) {
    ImageIcon imageIcon = new ImageIcon("src/Render/Images/background.png");
    this.background = imageIcon.getImage().getScaledInstance(720, 690, Image.SCALE_SMOOTH);
    // To get the image to scale properly you need to put it into another imageIcon
    imageIcon = new ImageIcon(this.background);
    this.background = imageIcon.getImage();
    this.setLayout(new GridLayout(cellsPerRow, cellsPerCol, 0, 0));
    // this.setSize(720,690);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(this.background, 0, 0, null);
  }

}