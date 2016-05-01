public class Paddle {
	//Paddle's height
	private static final int HEIGHT = 30;
	
	private static final double PADDLE_SPEED = 5;
	
	//READ BOARD HEIGHT FROM BOARD CLASS WHEN IT EXISTS!!!!!!
	//Board max height (board's actual height is this * 2)
	private static final int BOARD_HEIGHT = 100;
	
	//Paddle's y-position
	private int posY;
	
	private Player.PlayerSide player;
	
	public Paddle(Player.PlayerSide p) {
		player = p;
		posY = 0;
	}
	
	public void moveUp() {
		if((posY + PADDLE_SPEED + (HEIGHT/2)) > BOARD_HEIGHT) {
			posY = BOARD_HEIGHT - HEIGHT/2;
		} else {
			posY += PADDLE_SPEED;
		}
	}
	
	public void moveDown() {
		if((posY - PADDLE_SPEED - (HEIGHT/2)) < -BOARD_HEIGHT) {
			posY = -BOARD_HEIGHT + HEIGHT/2;
		} else {
			posY -= PADDLE_SPEED;
		}
	}
	
	public int getPosY() {
		return posY;
	}
	
	public int getHeight() {
		return HEIGHT;
	}
	
	public Player.PlayerSide getPlayer() {
		return player;
	}
}