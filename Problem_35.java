import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem_35 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUMBER_OF_TRIALS = 10;
	public void run() {
		
	}
	
	// total trials to get observe side of a coin
	private int totalTrials() {
		for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
			int coin = rgen.nextInt(0,1);
			int count = 1;
			if (coin == 1) {
				return count;
			} else count++;
		}

		
	}

}
