import acm.program.ConsoleProgram;

public class Problem_17 extends ConsoleProgram{
	public void run() {
		double number = readDouble("enter your Real Number");
		int whole = (int)number;
		double fraction = number - whole;
		
		println("whole part : " + whole + " fractional Part : " + fraction);
		
	}
}
