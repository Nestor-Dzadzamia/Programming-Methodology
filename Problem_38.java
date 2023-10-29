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
			int bid = readInt("Enter The Amount You Would like to bid : ");
			int bidNumber = readInt("Enter The Number to bet on : ");
			int winNumber = rgen.nextInt(0, 36);
			
			while (bid > balance) {
				bid = readInt("ReEnter the bid, you dont have this amount of money on your balance");
			}
			
			balance -= bid;
			
			println("Winning Number is -- " + winNumber);
			if (winNumber == bidNumber) {
				balance += bid * 2;
				println("Congrats, you won! your new balance : " + balance);
			} else {
				if (balance == 0) {
					println("Sadly You've Lost All your money!");
				} else {
					println("Unfortunately, you Lost! your new Balance : " + balance);
				}
			}
		}
	}
}
