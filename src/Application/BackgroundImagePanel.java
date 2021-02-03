package Application;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackgroundImagePanel extends JPanel {
	/**
	 * Default serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	Image background;
	
	/**
	 * Initializes a new JPanel with the main background image.
	 */
	public BackgroundImagePanel(int cellsPerRow, int cellsPerCol) {
		ImageIcon imageIcon = new ImageIcon("src/Render/Images/background.png");
		background = imageIcon.getImage().getScaledInstance(720, 690, Image.SCALE_SMOOTH);
		//To get the image to scale properly you need to put it into another imageIcon
		imageIcon = new ImageIcon(background);
		background = imageIcon.getImage();
		this.setLayout(new GridLayout(cellsPerRow, cellsPerCol, 0, 0));
		//this.setSize(720,690);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background, 0, 0, null);
	}

}
