import acm.program.ConsoleProgram;

public class Problem_24 extends ConsoleProgram{
	
	public void run() {
		int n = readInt();
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		
		println(count);
	}
}
