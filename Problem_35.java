import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem_35 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUMBER_OF_TRIALS = 10;
	public void run() {
		
	}
	
	// total trials to get observe side of a coin
	private int totalTrials() {
		int count = 1;
		
		while (true) {
			int coin = rgen.nextInt(0,1);
			if (coin == 1) {
				return count;
			} else count++;
		}
	}

}
