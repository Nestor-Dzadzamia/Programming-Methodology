import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem_40 extends GraphicsProgram {
	private static final int RADIUS = 50;
	
	public void run() {
		GOval oval = new GOval(2 * RADIUS, 2 * RADIUS);
		oval.setFilled(true);
		
		int xStart = 0;
		int xEnd = getWidth() - 2 * RADIUS;
		
	}
}
