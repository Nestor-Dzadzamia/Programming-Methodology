import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem14 extends GraphicsProgram {
	public void run() {
		drawRobot();
		drawTheSybol();
	}

	private void drawTheSybol() {
		GLine line1 = new GLine(100, 100, 130, 140);
		GLine line2 = new GLine(100, 100, 140, 70);
		GLine line3 = new GLine(130, 140, 170, 110);
		GLine line4 = new GLine(170, 110, 200, 150);
		GLine line5 = new GLine(130, 140, 160, 180);
		GLine line6 = new GLine(160, 180, 120, 210);
		GLine line7 = new GLine(130, 140, 90, 170);
		GLine line8 = new GLine(90, 170, )
		line1.setColor(Color.black);
		add(line1);
		add(line2);
		add(line3);
		add(line4);
		add(line5);
		add(line6);
		add(line7);
		
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
		int x = 30;
		int y = 30;
		
		GRect nose = new GRect(x, y);
		nose.setFilled(true);
		nose.setColor(Color.black);
		add(nose, (height / 2) - (x / 2), (width / 2) - (y / 2));
		
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
