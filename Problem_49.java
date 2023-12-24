import acm.program.ConsoleProgram;

public class Problem_49 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter Text: ");
		
		println(stringToInt(text));
	}
	
	private int stringToInt(String text) {
		int answer = 0;
		int temp = 10;
		for (int i = 0; i < text.length(); i++) {
			char currChar = text.charAt(i);
			int digit = currChar - '0';
			
			answer *= temp;
			answer += digit;
		}
		
		return answer;
 	}
}
