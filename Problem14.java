import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem14 extends GraphicsProgram {
	public void run() {
		drawRobot();
	}

	private void drawRobot() {
		drawFace();
		drawEyes();
		drawMouth();
		drawNose();
	}

	private void drawNose() {
		// TODO Auto-generated method stub
		
	}

	private void drawMouth() {
		// TODO Auto-generated method stub
		
	}

	private void drawEyes() {
		// TODO Auto-generated method stub
		
	}

	private void drawFace() {
		int height = getHeight();
		int width = getWidth();
		int x = 300;
		int y = 300;
		
		GRect face = new GRect(x, y);
		face.setFilled(true);
		face.setColor(Color.gray);
		add(face, (height / 2) - (x / 2), (width / 2) - (y / 2));
		
	}

}
