import acm.program.ConsoleProgram;

public class Problem_31 extends ConsoleProgram{
	public void run() {
		int n = readInt("Enter your number : ");
		println(isPrime(n));
	}
	
	private boolean isPrime(int n) {
		
		if (n > 1) {
			int divisors = (int)Math.sqrt(n);
			for(int i = divisors; i > 1; i--) {
				if (n % i == 0) {
					return false;
				}
			}
		} else return false;
		
		return true;
	}
}
