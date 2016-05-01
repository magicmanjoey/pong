public class Calc {

	public Calc() {}
	
	//Returns random int between two args
	public int random(int min, int max) {
		return (int) (Math.random() * (max-min) + min);
	}
	
	//Calculates "perfect" angle of reflection for ball bounce
	public int bounceAngle(int angle1) {
		return 360-angle1;
	}
	
}
