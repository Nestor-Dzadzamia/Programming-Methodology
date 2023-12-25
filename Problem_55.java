import acm.program.ConsoleProgram;

public class Problem_55 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter N:  ");
		
		boolean answer = isSorted(n);
		if (answer) println("IS SORTED");
		else println("IS NOT SORTED");
	}
	
	private boolean isSorted(int n) {
		int prev = 0;
		for (int i = 0; i < n; i++) {
			int input = readInt();
			if (i > 0 && input < prev) {
				return false;
			}
			prev = input;
		}
		
		return true;
	}
}
