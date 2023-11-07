import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem_14 extends GraphicsProgram {
	public void run() {
		drawRobot();
		drawTheSybol();
	}

	private void drawTheSybol() {
		GRect flag = new GRect(300, 141.42);
		flag.setFilled(true);
		flag.setFillColor(Color.BLACK);
		add(flag, 580, 670);
		
		GOval oval = new GOval(141.42,141.42);
		oval.setFilled(true);
		oval.setFillColor(Color.WHITE);
		add(oval, 660, 670);
		
		GLine line1 = new GLine(700, 700, 730, 740);
		GLine line2 = new GLine(700, 700, 740, 670);
		GLine line3 = new GLine(730, 740, 770, 710);
		GLine line4 = new GLine(770, 710, 800, 750);
		GLine line5 = new GLine(730, 740, 760, 780);
		GLine line6 = new GLine(760, 780, 720, 810);
		GLine line7 = new GLine(730, 740, 690, 770);
		GLine line8 = new GLine(690, 770, 660, 730);
		line1.setColor(Color.black);
		add(line1);
		add(line2);
		add(line3);
		add(line4);
		add(line5);
		add(line6);
		add(line7);
		add(line8);
		
	}

	private void drawRobot() {
		drawHat();
		drawFace();
		drawEyes();
		drawMouth();
		drawNose();
	}

	private void drawHat() {
		int x = getWidth();
		int y = getHeight();
		GLine line1 = new GLine((y / 2) - 150, (x / 2) - 150 , (y / 2) , (x / 2) - 250);
		add(line1);
		
		GLine line2 = new GLine((y / 2) , (x / 2) - 250, (y / 2) + 150 ,(x / 2) - 150);
		add(line2);
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