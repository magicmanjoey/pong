public class Game {

	private Player leftPlayer;
	private Player rightPlayer;
	private GameGUI gui;
	
	public Game() {
		leftPlayer = new Player(new Paddle(Player.PlayerSide.LEFT));
		rightPlayer = new Player (new Paddle(Player.PlayerSide.RIGHT));
		gui = new GameGUI();
	}

	public Player getLeftPlayer() {
		return leftPlayer;
	}


	public Player getRightPlayer() {
		return rightPlayer;
	}
	
	
	
	
}
