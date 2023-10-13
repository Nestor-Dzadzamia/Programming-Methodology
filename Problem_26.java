import acm.program.ConsoleProgram;

public class Problem_26 extends ConsoleProgram {
	
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
		
		for (int i = min; i > 0; i--) {
			if (max % i == 0 && min % i == 0) {
				println(i);
				break;
			}
		}
	}

}
