import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem_36 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUMBER_OF_GAMES = 2;
	public void run() {
		println(avgTrialsForThreeHeads());
	}
	
	public double avgTrialsForThreeHeads() {
		int countHeads = 0;
		int countTrials = 0;
		for (int i = 0; i < NUMBER_OF_GAMES; i++) {
			while (true) {
				int coin = rgen.nextInt(0, 1);
				if (coin == 1) {
					countTrials++;
					countHeads++;
				} else {
					countTrials++;
					countHeads = 0;
				}
	
				if (countHeads == 3) break;
			}
		}
		
		return countTrials / NUMBER_OF_GAMES;
		
	}
}
