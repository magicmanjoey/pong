public class Calc {

	public Calc() {}
	
	//Returns random int between two args
	public static int random(int min, int max) {
		return (int) (Math.random() * (max-min) + min);
	}
	
	//Calculates "perfect" angle of reflection for ball bounce
	public static int bounceAngle(int angle1) {
		return 360-angle1;
	}

	//Maps value1 between low1 and high1 to value between low2 and high2
	public static int map(int low1, int high1, int low2, int high2, int value1) {
		return (value1 * ((high2 - low2)/(high1 - low1)));
	}
	
	//Converts x-coordinate to the appropriate pixel value
	public static int xCoordToPixel(int xCoord, int windowWidth, int xPixelMargin, int boardWidth) {
		return (map(-boardWidth, boardWidth, 0, (windowWidth - 2*xPixelMargin), xCoord) + xPixelMargin);
	}
	
	//Converts y-coordinate to the appropriate pixel value
	public static int yCoordToPixel(int yCoord, int windowHeight, int boardHeight) {
		return (map(boardHeight, -boardHeight, 0, windowHeight, yCoord));
	}
}
