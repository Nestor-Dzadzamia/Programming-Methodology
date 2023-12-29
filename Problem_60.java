import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem_60 extends ConsoleProgram {
	private static final int CONST = -1;
	
	public void run() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (true) {
			int input = readInt("Enter Number: ");
			if (input == CONST) break;
			list.add(input);
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			print(list.get(i) + " ");
		}
	}
}
