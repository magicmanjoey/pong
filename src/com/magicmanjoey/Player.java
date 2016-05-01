public class Player {

	public enum PlayerSide {LEFT, RIGHT};
	
	private int score;
	private Paddle paddle;
	private PlayerSide side;
	
	public Player(PlayerSide side, Paddle paddle) {
		this.side = side;
		this.paddle = paddle;
	}
	
	public void incrementScore() {
		score++;
	}
	
	public void setScore(int score) {
		if(score>=0) {
			this.score = score;
		}
	}

	public PlayerSide getPlayerSide() {
		return side;
	}

	public int getScore() {
		return score;
	}
}
