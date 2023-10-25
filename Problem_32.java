import acm.program.ConsoleProgram;

public class Problem_32 extends ConsoleProgram{
	public void run() {
		
	}
	
	private boolean isPrime(int n) {
		int divisors = (int) Math.sqrt(n);
		
		if (n > 1) {
			for (int i = divisors; i > 1; i--) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		
	}
}
