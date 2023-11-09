import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Additional_Problems_14_1 extends GraphicsProgram {
	private static final int RADIUS = 25;
	private static final int WIDTH = 40;
	private static final int HEIGHT = 80;
	GPoint point;
	GObject obj;
	GOval circle;
	GRect rect;
	
	public void run() {
		setupCircle();
		setupRect();
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		point = new GPoint(e.getPoint());
		obj = getElementAt(e.getX(), e.getY());
	}
	
	public void mouseDragged(MouseEvent e) {
		if (obj != null) {
			obj.move(e.getX() - point.getX(), e.getY() - point.getY());
			point = new GPoint(e.getPoint());
		}

	}
	
	private void setupCircle() {
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		circle.setFillColor(Color.GRAY);
		add(circle, 0, 0);
	}
	
	private void setupRect() {
		rect = new GRect(WIDTH, HEIGHT);
		rect.setFilled(true);
		rect.setFillColor(Color.BLACK);
		add(rect, 0, 0);
	}

}
