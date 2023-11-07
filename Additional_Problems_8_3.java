import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Additional_Problems_8_3 extends GraphicsProgram{
	private static final int FIB_NUMBER = 5;
	private static final int DISTANCE_BETWEEN_SQUARES = 10;
	
	public void run() {
		drawSquares(fibonacci(FIB_NUMBER));
	}
	
	private int fibonacci(int n) {
		int first = 0;
		int second = 1;
		int count = 0;
		int temp = 0;
		if (n > 1) {
			while (count != n - 1) {
				 temp = first;
				 first = second;
				 second = first + temp;
				 
				 count++;
			 }
			 if (n % 2 == 0) return second;
			 else return first;
			 
		 } else if (n == 1) return first;
		 else return second;	 
	}
	
	private void drawSquares(int n) {
		int length = 10 * n;
		int xCoordinate = 0;
			
		for (int i = 0; i < 5; i++) {
			GRect rect = new GRect(length, length);
			rect.setFilled(true);
			rect.setFillColor(Color.CYAN);
			add(rect, xCoordinate, 0);
			xCoordinate += (length + DISTANCE_BETWEEN_SQUARES);
		}
	}
	
}
