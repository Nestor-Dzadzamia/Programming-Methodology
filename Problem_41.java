import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem_41 extends GraphicsProgram {
	private static final int RADIUS = 10;
	public void run() {
		addMouseListeners();
	}
	
	public void mouseDragged(MouseEvent e) {
		GOval oval = new GOval(2 * RADIUS, 2 * RADIUS);
		oval.setFilled(true);
		add(oval, e.getX() - RADIUS, e.getY() - RADIUS);
	}
}
