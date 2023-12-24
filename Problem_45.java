import acm.program.ConsoleProgram;

public class Problem_45 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter Text: ");
		char symbol = readLine("Enter Symbol: ").charAt(0);
		
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol) {
				count++;
			}
		}
		
		println(count);
	}
}
