import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Additional_Problems_8_2 extends GraphicsProgram {
	
	public void run() {
		int length = 100;
		boolean isFilled = true;
		int height = getHeight();
		int width = getWidth();
		
		add(drawSquare(Color.BLUE, length, isFilled), width / 2 - length / 2, height / 2 - length / 2);
	}

	private GRect drawSquare(Color color, int length, boolean isFilled) {
		int height = getHeight();
		int width = getWidth();
		
		GRect square = new GRect(length, length);
		square.setFilled(isFilled);
		square.setFillColor(color);
		return square;
	}
	
}
