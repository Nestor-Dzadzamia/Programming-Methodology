import acm.program.ConsoleProgram;

public class Problem_31 extends ConsoleProgram{
	public void run() {
		int n = readInt("Enter your number:");
		println(isPrime(n));
	}
	
	private boolean isPrime(int n) {
		int divisors = (int)Math.sqrt(n);
		int count = 0;
		for(int i = divisors; i > 1; i--) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
