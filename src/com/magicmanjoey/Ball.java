public class Ball {

	//The maximum amount the angle the ball bounces can vary from the actual amount it should be
	private static final int MAX_ANGLE_DIFFERENCE = 10;
	
	//Amount the ball moves per "tick"
	private double BALL_SPEED = 10;
	
	//The amount between the center and edge of the ball
	private int BALL_RADIUS = 8;
	
	//Ball's x and y positions
	private int posX;
	private int posY;
	
	private int angle;
	
	public Ball() {
		posX = 0;
		posY = 0;
		angle = Calc.random(0, 359);
	}
	
	public Ball(int angleInit) {
		posX = 0;
		posY = 0;
		if(checkAngle(angleInit)) {
			angle = angleInit;
		} else {
			angle = Calc.random(0, 359);
		}
	}

	//Checks if the angle is appropriate (between 0 and 359)
	private boolean checkAngle(int angle) {
		if(angle<0 || angle>=360) {
			return false;
		} else {
			return true;
		}
	}
	
	public void bounce() {
		angle = Calc.bounceAngle(angle);
	}
	
	public void move() {
		posX += BALL_SPEED * Math.cos(angle);
		posY += BALL_SPEED * Math.sin(angle);
	}

	public int getPosX() {
		return posX;
	}
	
	public int getPosY() {
		return posY;
	}
}
