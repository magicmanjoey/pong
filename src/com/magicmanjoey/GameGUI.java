import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGUI {

	JFrame frame;
	PongGamePanel gamePanel;
	JPanel buttonsPanel;
	JPanel leftControlsPanel;
	JPanel rightControlsPanel;
	JButton leftUpButton;
	JButton leftDownButton;
	JButton rightUpButton;
	JButton rightDownButton;
	JButton startPause;
	
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
	
}
