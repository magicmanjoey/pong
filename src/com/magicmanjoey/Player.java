public class Player {

	public enum PlayerSide {LEFT, RIGHT};
	
	private int score;
	private Paddle paddle;
	private PlayerSide side;
	
	public Player(Paddle paddle) {
		this.paddle = paddle;
		this.side = this.paddle.getPlayer();
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
