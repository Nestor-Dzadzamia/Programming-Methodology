import acm.program.ConsoleProgram;

public class Additional_Problems_6_1 extends ConsoleProgram {
	
	public void run() {
		int answ = 0;
		while (true) {
			int n = readInt("Enter your number : ");
			
			if (n == 0) break;
			else answ += n;
		}
		
		print(answ);
	}
}
