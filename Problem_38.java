import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem_38 extends ConsoleProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		playRoulette();
	}
	
	public void playRoulette() {
		int balance = 1000;
		
		while (balance != 0) {
			int bid = readInt("Enter The Amount You Would like to bid");
			int bidNumber = readInt("Enter The Number to bet");
		}
	}
}
