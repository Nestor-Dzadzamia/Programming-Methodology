import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem_50 extends ConsoleProgram {
	public void run() {
		String input = readLine("Your Input: ");
		StringTokenizer tokenizer = new StringTokenizer(input);
		int count = 0;
		while(tokenizer.hasMoreTokens()) {
			String ans = tokenizer.nextToken();
			count++;
		}
		
		println(count);
	}
}
