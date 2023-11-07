import acm.program.ConsoleProgram;

public class Problem_18 extends ConsoleProgram {
	public void run() {
		solution();
	}
	
	private void solution() {
		int a = readInt();
		int b = readInt();
		if (a > b) {
			println(a + " is the highest Number");
		} else if (a < b) {
			println(b + " is the highest Number");
		} else {
			println("they are equal");
		}
	}
}
