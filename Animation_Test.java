import java.awt.Font;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Animation_Test extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int RADIUS = 50;

	public void run() {
		int xStart = 0;
		int xEnd = getWidth() - 2 * RADIUS; 
		
		int yConst = getHeight() / 2 - RADIUS; 
		
		GOval circle = new GOval(RADIUS * 2, RADIUS * 2);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle, 0, yConst);
		
		GLabel bounceCount = new GLabel("Bounce Count - ");
		bounceCount.setFont(new Font("Arial", Font.BOLD, 40));
		add(bounceCount, 0, bounceCount.getAscent());
		
		int bounce = 0;
		GLabel score = new GLabel(Integer.toString(bounce));
		score.setFont(new Font("Arial", Font.BOLD, 40));
		
		while (xStart != xEnd) {
			
			add(score, bounceCount.getWidth(), bounceCount.getAscent() + 2);
			
			circle.setLocation(xStart + 1, yConst);
			pause(1);
			xStart++;
			
			if (xStart == xEnd) {
				remove(score);
				bounce++;
				score = new GLabel(Integer.toString(bounce));
				score.setFont(new Font("Arial", Font.BOLD, 40));
				add (score, bounceCount.getWidth(), bounceCount.getAscent() + 2);
				circle.setColor(rgen.nextColor());
				xEnd = 0;
				while (xStart != xEnd) {
					circle.setLocation(xStart - 1, yConst);
					pause(1);
					xStart--;
				}
				remove(score);
				bounce++;
				score = new GLabel(Integer.toString(bounce));
				score.setFont(new Font("Arial", Font.BOLD, 40));
				circle.setColor(rgen.nextColor());
				xEnd = getWidth() - 2 * RADIUS; 
			}
		}
		
		
	}

}
