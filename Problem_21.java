import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem_21 extends GraphicsProgram{
	
	public void run() {
		double height = getHeight();
		double width = getWidth();
		
		for (double i = (width / 10); i <= width ; i += (width / 10)) {
			for (double j = (height / 10); j <= height; j += (height / 10)) {
				GLine verticalLine = new GLine(i, 0, i, height);
				GLine horizontalLine = new GLine(0, j, width, j);
				add(verticalLine);
				add(horizontalLine);
			}
		}
	}
}
