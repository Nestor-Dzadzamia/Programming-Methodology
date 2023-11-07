import acm.program.ConsoleProgram;

public class Problem_23 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += i;
		}
		println(sum);
	}
}
