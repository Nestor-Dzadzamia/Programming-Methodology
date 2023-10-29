import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem_35 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUMBER_OF_GAMES = 10;
	public void run() {
		
	}
	
	// total trials to get observe side of a coin
	private int totalTrials() {
		double count = 0;
		
		for (int i = 0; i < NUMBER_OF_GAMES; i++) {
			while (true) {
				int coin = rgen.nextInt(0,1);
				if (coin == 1) {
					count++;
					break;
				} else count++;
			}
		}
		
		return count / NUMBER_OF_GAMES;
		
	}
}
