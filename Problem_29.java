import acm.program.ConsoleProgram;

public class Problem_29 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number : ");
		
		fibonacci(n);
	}
	
	private int fibonacci(int n) {
		int first = 0;
		int second = 1;
		int temp;
		
		if (n > 2) {
			for (int i = 0; i < n - 2; i++) {
				temp = first;
				first = second;
				second = first + temp;
				println("first : " + first + " Second : " + second);
			}
		}
		
		return first;

	}
}
