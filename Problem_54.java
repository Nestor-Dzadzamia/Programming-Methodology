import acm.program.ConsoleProgram;

public class Problem_54 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter Number : ");
		
		int firstMax = 0;
		int secondMax = 0;
		for (int i = 0; i < n; i++) {
			int input = readInt("Input :");
			
			if (input > firstMax) {
				int temp = firstMax;
				firstMax = input;
				secondMax = temp;
			} else if (input <= firstMax && input > secondMax) {
				secondMax = input;
			}
		}
		println("Max 2 numbers : " + firstMax + "  " + secondMax);
	}
}
