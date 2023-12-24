import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;

public class Problem_42 extends GraphicsProgram {
	private int countClicks = 0;
	private GPoint firstPoint;
	private GPoint secondPoint;
	private GLine line;
	public void run() {
		
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
	}
	
	public void mouseDragged(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
	}
	
}
