import acm.program.ConsoleProgram;

public class Additional_Problems_6_2 extends ConsoleProgram {
	
	public void run() {
		double a,b;
		a = readDouble("Enter First Number : ");
		b = readDouble("Enter Second Number : ");
		String symbol = readLine("Enter the Symbol : ");
		
		// if version
		if (symbol.equals("+")) {
			println(add(a, b));
		} else if (symbol.equals("-")) {
			println(subtract(a, b));
		} else if (symbol.equals("/")) {
			println(divide(a, b));
		} else if (symbol.equals("*")) {
			println(multiply(a, b));
		} else {
			println("I don't know your symbol");
		}
		
		// switch version
		
		switch (symbol) {
		case "+":
			println(add(a, b));
			break;
		case "-":
			println(subtract(a, b));
			break;
		case "/":
			println(divide(a, b));
			break;
		case "*":
			println(multiply(a, b));
		default:
			println("I don't know your symbol");
		}
		
	}
	
	public double multiply(double a, double b) {
		return a * b;
	}
	
	public double divide(double a, double b) {
		return a / b;
	}
	
	public double subtract(double a, double b) {
		return Math.abs(a - b);
	}

	public double add(double a, double b) {
		return a + b;
	}
}
