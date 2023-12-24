import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;

public class Problem_43 extends GraphicsProgram {
	private static final int RADIUS = 20;
	private boolean clickedBall = false;
	private GPoint clickPoint;
	private GOval ball;
	public void run() {
		createBall();
		
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		if (getElementAt(e.getX(), e.getY()) != null) {
			clickedBall = true;
			clickPoint = new GPoint(e.getPoint());
		} else {
			clickedBall = false;
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		if (clickedBall) {
			ball.move(e.getX() - clickPoint.getX(), e.getY() - clickPoint.getY());
			
			clickPoint = new GPoint(e.getX(), e.getY());
		}
		
		
	}
	
	private void createBall() {
		ball = new GOval(2 * RADIUS, 2 * RADIUS);
		ball.setFilled(true);
		add(ball, getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS);
	}
}
