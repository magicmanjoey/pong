import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGUI {

	private JFrame frame;
	private PongGamePanel gamePanel;
	private JPanel buttonsPanel;
	private JPanel leftControlsPanel;
	private JPanel rightControlsPanel;
	private JButton leftUpButton;
	private JButton leftDownButton;
	private JButton rightUpButton;
	private JButton rightDownButton;
	private JButton startPause;
	
	public static void main(String[] args) {
		new GameGUI();
	}
	
	public GameGUI() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gamePanel = new PongGamePanel();
		leftControlsPanel = new JPanel();
		rightControlsPanel = new JPanel();
		
		buttonsPanel = new JPanel();
		
		leftUpButton = new JButton("UP");
		leftDownButton = new JButton("DN");
		rightUpButton = new JButton("UP");
		rightDownButton = new JButton("DN");
		
		startPause = new JButton("Start!");
		
		leftControlsPanel.add(BorderLayout.NORTH, leftUpButton);
		leftControlsPanel.add(BorderLayout.SOUTH, leftDownButton);
		rightControlsPanel.add(BorderLayout.NORTH, rightUpButton);
		rightControlsPanel.add(BorderLayout.SOUTH, rightDownButton);
		
		buttonsPanel.add(BorderLayout.WEST, leftControlsPanel);
		buttonsPanel.add(BorderLayout.EAST, rightControlsPanel);
		buttonsPanel.add(BorderLayout.NORTH, startPause);
		
		frame.add(BorderLayout.CENTER, gamePanel);
		frame.add(BorderLayout.SOUTH, buttonsPanel);
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		frame.setVisible(true);
		
	}


	public void giveLeftPaddleCoord(int coord) {
		gamePanel.giveLeftPaddleCoord(coord);
	}

	public void giveRightPaddleCoord(int coord) {
		gamePanel.giveRightPaddleCoord(coord);
	}
	
	
	
	
}
