import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class PongGamePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//ACTUALLY HALF OF BOARD'S WIDTH
	private static final int BOARD_WIDTH = 200;
	
	//ACTUALLY HALF OF BOARD'S HEIGHT
	private static final int BOARD_HEIGHT = 100;
	
	//Amount of pixels between edge of the playing field and edge of the window
	private static final int X_PIXEL_MARGIN = 10;

	//Called to "refresh" the game display
	public void paintComponent(Graphics g) {
		paintBackground(g);
		paintPaddles(g);
	}
	
	public static int boardWidth() {
		return BOARD_WIDTH;
	}
	
	public static int boardHeight() {
		return BOARD_HEIGHT;
	}
	
	public static int xPixelMargin() {
		return X_PIXEL_MARGIN;
	}

	private void paintBackground(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}

	private void paintPaddles(Graphics g) {
		paintRightPaddle(g);
		paintLeftPaddle(g);
	}
	
	private void paintRightPaddle(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(((Calc.xCoordToPixel(-BOARD_WIDTH, this.getWidth(), X_PIXEL_MARGIN, BOARD_WIDTH)) - (int) (0.5 * Paddle.getWidth())), 
				((Calc.yCoordToPixel(getRightPaddleCoord(), this.getHeight(), BOARD_HEIGHT)) - (int) (0.5 * Paddle.getHeight())),
				Paddle.getWidth(), Paddle.getHeight());
	}
	
	private void paintLeftPaddle(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(((Calc.xCoordToPixel(BOARD_WIDTH, this.getWidth(), X_PIXEL_MARGIN, BOARD_WIDTH)) - (int) (0.5 * Paddle.getWidth())), 
				((Calc.yCoordToPixel(getLeftPaddleCoord(), this.getHeight(), BOARD_HEIGHT)) - (int) (0.5 * Paddle.getHeight())),
				Paddle.getWidth(), Paddle.getHeight());
	}
	
	private int getRightPaddleCoord() {
		return 0;
	}
	
	private int getLeftPaddleCoord() {
		return 0;
	}
}
