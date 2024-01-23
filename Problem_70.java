import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem_70 extends GraphicsProgram implements ComponentListener {
	public void init() {
		addComponentListener(this);
	}
	
	
	private void drawLines() {
		removeAll();
		
		for (int i = 0; i < getWidth(); i += getWidth() / 10) {
			GLine vertical = new GLine(i, 0, i, getHeight());
			add(vertical);
		}
		
		
		for (int j = 0; j < getHeight(); j += getHeight() / 10) {
			GLine horizontal = new GLine(0, j, getWidth(), j);
			add(horizontal);
		}
		
	}

	@Override
	public void componentResized(ComponentEvent e) {
		drawLines();
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
