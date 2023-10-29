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
		
		println("Winning number is ---- " + winNumber);
		
		if (winNumber == number) {
			println("Congrats!!! you won");
		} else {
			println("Unfortunately, You Lost. don't give up, Losers Quit before they win big");
		}
	}
}
