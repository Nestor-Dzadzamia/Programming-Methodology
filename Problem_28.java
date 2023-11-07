import acm.program.ConsoleProgram;

public class Problem_28 extends ConsoleProgram {
	private static final int FINAL_NUM = -1;
	
	public void run() {
		int count = 0;
		while (true) {
			int n = readInt("Enter number :");
			if (n == FINAL_NUM) {
				break;
			} else if (n % 2 == 0) {
				count++;
			}
		}
		
		println("Total even numbers: " + count);
		
	}
}
