import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem_13 extends GraphicsProgram {
	public void run() {
		splitScreen();
	}
	
	private void splitScreen() {
		GLine line = new GLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
		add(line);
	}
}
