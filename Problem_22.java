import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem_22 extends GraphicsProgram {
	public void run() {
		double width = getWidth();
		double height = getHeight();
		
		for (double i = width / 8; i <= width; i += width / 8) {
			for (double j = height / 8; j <= height; j += height / 8) {
				GRect horizontalLine = new GRect(0, j, width, j);
				GRect verticalLine = new GRect(i, 0, i, height);
				
			}
		}
	}
}