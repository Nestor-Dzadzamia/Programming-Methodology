import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem_35 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUMBER_OF_GAMES = 100;
	public void run() {
		println(avgNumberOfTrials());
	}
	
	private double avgNumberOfTrials() {
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
