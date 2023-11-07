import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem_12 extends GraphicsProgram {
	public void run() {
		drawHouse();
	}

	private void drawHouse() {
		drawRoof();
		drawRect();
		drawWindows();
		drawDoor();
	}

	private void drawRoof() {
		int x = getWidth();
		int y = getHeight();
		GLine line1 = new GLine((y / 2) - 150, (x / 2) - 150 , (y / 2) , (x / 2) - 250);
		add(line1);
		
		GLine line2 = new GLine((y / 2) , (x / 2) - 250, (y / 2) + 150 ,(x / 2) - 150);
		add(line2);
	}

	private void drawDoor() {
		int height = getHeight();
		int width = getWidth();
		int x = 60;
		int y = 150;
		
		GRect door = new GRect(x, y);
		door.setFilled(true);
		door.setColor(Color.black);
		add(door, (height / 2) - (x / 2), (width / 2));
		
	}

	private void drawWindows() {
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

	private void drawRect() {
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