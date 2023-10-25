import acm.program.ConsoleProgram;

public class Problem_30 extends ConsoleProgram {
	public void run() {
		int number = readInt("Enter your number : ");
		
		if (number > 0) {
			println(reverse(number));
		} else {
			println(0 - reverse(number));
		}
	}
	
	private int reverse(int number) {
		number = Math.abs(number);
		int digits = 0;
		int answ = 0;
		
		for (int i = number; i > 0; i /= 10) {
			digits++;
		}
		
		for (int i = digits; i > 0 ; i--) {
			while (number > 0) {
				double newNum = (number % 10) * Math.pow(10, i - 1);
				number /= 10;
				i--;
				answ += newNum;
			}
		}
		
		return answ;
	}
}
