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
		
		GRect face = new GRect(300, 300);
		face.setFilled(true);
		face.setColor(Color.gray);
		add(face, (height / 2) - 150, (width / 2) - 150);
		
	}

}
