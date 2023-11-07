import acm.program.ConsoleProgram;

public class Problem_15 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter First Number :");
		int b = readInt("Enter Second Number :");
		
		double avg = ((double)(a + b)) / 2;
		println(avg);
	}
}
