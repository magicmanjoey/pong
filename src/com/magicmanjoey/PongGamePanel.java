import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class PongGamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	//Called to "refresh" the game display
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
	}
	
}
