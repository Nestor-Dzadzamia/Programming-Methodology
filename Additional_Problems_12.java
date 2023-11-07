import java.awt.Color;
import java.awt.Font;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Additional_Problems_12 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int COIN_LENGTH = 150;
	private static final int DELAY = 1000;
	private static final int TEXT_LENGTH = 30;
	
	
	public void run () {
		GOval coin = new GOval(COIN_LENGTH, COIN_LENGTH);
		coin.setFilled(true);
		add(coin, (getWidth() - COIN_LENGTH) / 2, (getHeight() - COIN_LENGTH) / 2);
		
		GCompound comp = new GCompound();
		
		while (true) {
			coin.setFillColor(flipCoin());
			pause(DELAY);
		}
		
	}
	
	private Color flipCoin() {
		boolean coin = rgen.nextBoolean();
		
		
		if (coin) {
			GLabel heads = new GLabel("Heads");
			heads.setFont(new Font("Times New Roman", Font.BOLD, TEXT_LENGTH));
			add(heads, (getWidth() - heads.getWidth()) / 2, (getHeight() + heads.getAscent()) / 2);
			return Color.RED;
		} else {
			GLabel tails = new GLabel("Tails");
			tails.setFont(new Font("Times New Roman", Font.BOLD, TEXT_LENGTH));
			add(tails, (getWidth() - tails.getWidth()) / 2, (getHeight() + tails.getAscent()) / 2);
			return Color.GREEN;
		}

	}

}
