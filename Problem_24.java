import acm.program.ConsoleProgram;

public class Problem_24 extends ConsoleProgram {
	
	public void run() {
		int a = readInt();
		int b = readInt();
		int max, min;
		
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		for (int i = max; ; i += min) {
			if (i % min == 0) {
				println(i);
				break;
			}
		}
	}

}
