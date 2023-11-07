import acm.program.ConsoleProgram;

public class Problem_27 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n : ");
		int m = readInt("Enter m : ");
		int answ = 1;
		
		for (int i = 0; i < m; i++) {
			answ *= n;
		}
		println(answ);
	}
}
