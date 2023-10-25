import acm.program.ConsoleProgram;

public class Problem_32 extends ConsoleProgram{
	public void run() {
		printPrimeNumbers();
	}
	
	private boolean isPrime(int n) {
		int divisors = (int) Math.sqrt(n);
		
		if (n > 1) {
			for (int i = divisors; i > 1; i--) {
				if (n % i == 0) return false;
			}
		} else return false;
		
		return true;
		
	}
	
	private void printPrimeNumbers() {
		for (int i = 0; i < 1_000; i++) {
			if (isPrime(i) == true) {
				println(i);
			}
		}
	}
}
