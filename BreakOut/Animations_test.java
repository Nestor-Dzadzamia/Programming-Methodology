
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Animations_test extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int BLOCK_WIDTH = 20;
	private static final int BLOCK_HEIGHT = 10;
	private static final int RADIUS = 50;

	public void run() {
		int width = getWidth();
		int height = getHeight();
		int xCoordinate = rgen.nextInt(0, width - 2 * RADIUS);
		int yCoordinate = rgen.nextInt(0, height - 2 * RADIUS);
		int xSpeed = 1;
		int ySpeed = 1;

		GRect[] rowOne = new GRect[width / BLOCK_WIDTH];
		int xStart = 0;
		for (int i = 0; i < width / BLOCK_WIDTH; i++) {
			rowOne[i] = new GRect(BLOCK_WIDTH, BLOCK_HEIGHT);
			rowOne[i].setFilled(true);
			rowOne[i].setFillColor(rgen.nextColor());
			add(rowOne[i], xStart, 0);
			xStart += BLOCK_WIDTH;
		}
		
		GRect[] rowTwo = new GRect[width / BLOCK_WIDTH];
		xStart = 0;
		for (int i = 0; i < width / BLOCK_WIDTH; i++) {
			rowTwo[i] = new GRect(BLOCK_WIDTH, BLOCK_HEIGHT);
			rowTwo[i].setFilled(true);
			rowTwo[i].setFillColor(rgen.nextColor());
			add(rowTwo[i], xStart, 10);
			xStart += BLOCK_WIDTH;
		}
		

		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		circle.setFillColor(rgen.nextColor());
		add(circle, xCoordinate, yCoordinate);

		while (true) {
			if (xCoordinate >= width - 2 * RADIUS || xCoordinate <= 0) {
				xSpeed *= -1;
				circle.setFillColor(rgen.nextColor());
			}

			if (yCoordinate >= height - 2 * RADIUS || yCoordinate <= 0) {
				ySpeed *= -1;
				circle.setFillColor(rgen.nextColor());
			}
			
			GObject obj = getElementAt(xCoordinate + RADIUS, yCoordinate - 1);
			
			if (obj != null) {
				remove(obj);
				ySpeed *= -1;
			}

			xCoordinate += xSpeed;
			yCoordinate += ySpeed;
			circle.setLocation(xCoordinate, yCoordinate);

			pause(1);
		}

	}
}