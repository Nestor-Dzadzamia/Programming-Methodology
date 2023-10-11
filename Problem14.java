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
		int height  = getHeight();
		int width = getWidth();
		
		
	}

	private void drawMouth() {
		int height = getHeight();
		int width = getWidth();
		int x = 120;
		int y = 50;
		
		GRect mouth = new GRect(x, y);
		mouth.setFilled(true);
		mouth.setColor(Color.black);
		add(mouth, (height / 2) - (x / 2), (width / 2) + 50);
		
	}

	private void drawEyes() {
		int height = getHeight();
		int width = getWidth();
		int x = 70;
		int y = 70;
		
		GRect leftEye = new GRect(x, y);
		leftEye.setFilled(true);
		leftEye.setColor(Color.black);
		add(leftEye, (height / 2) - 150 + 30, (width / 2) - 150 + 30);
		
		GRect rightEye = new GRect(x, y);
		rightEye.setFilled(true);
		rightEye.setColor(Color.black);
		add(rightEye, (height / 2) + 150 - 30 - x, (width / 2) - 150 + 30);
		
	}

	private void drawFace() {
		int height = getHeight();
		int width = getWidth();
		println(height + " " + width);
		int x = 300;
		int y = 300;
		
		GRect face = new GRect(x, y);
		face.setFilled(true);
		face.setColor(Color.gray);
		add(face, (height / 2) - (x / 2), (width / 2) - (y / 2));
	}

}
