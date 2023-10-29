import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem_37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		playRoulette();
	}
	
	public void playRoulette() {
		int number = readInt("Enter the number you would like to bet on --- ");
		int winNumber = rgen.nextInt(0,36);
		
		if (winNumber == number) {
			println("Congrats!!! you won");
		} else {
			println("You Lost, but dont give up. Losers Quit before they win big");
		}
	}
}
