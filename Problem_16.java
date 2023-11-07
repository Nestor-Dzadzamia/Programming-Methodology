import acm.program.ConsoleProgram;

public class Problem_16 extends ConsoleProgram{
	public void run() {
		int a, b, c;
		a = readInt();
		b = readInt();
		c = readInt();
		
		double reverseA = 1 / ((double) a);
		double reverseB = 1 / ((double) b);
		double reverseC = 1 / ((double) c);
		
		double harmonic = 1 / (reverseA + reverseB + reverseC);
		println(harmonic);
	}
}
