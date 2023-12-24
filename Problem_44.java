import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem_44 extends GraphicsProgram {
	private static final int RADIUS = 25;
	private static final int DELAY = 10;
	private GOval ball = null;
	public void run() {
		addMouseListeners();
		while (true) {
			if (ball != null) {
				ball.move(0, 1);
			}
			
			pause(DELAY);
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		if (ball == null) {
			ball = new GOval(2 * RADIUS, 2 * RADIUS);
			ball.setFilled(true);
			add(ball, e.getX() - RADIUS, e.getY() - RADIUS);
		} else {
			ball.setLocation(e.getX() - RADIUS, e.getY() - RADIUS);
		}
	}
}
