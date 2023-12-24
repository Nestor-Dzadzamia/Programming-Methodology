import acm.program.ConsoleProgram;

public class Problem_46 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter Text: ");
		
		int max = 0;
		char maxSymbol = 0;
		for (int i = 0; i < text.length(); i++) {
			char currChar = text.charAt(i);
			int count = countCurrChar(text, currChar);
			
			if (count > max) {
				maxSymbol = currChar;
				max = count;
			}
		}
		
		println(maxSymbol);
	}
	
	private int countCurrChar(String text, char currChar) {
		int answer = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == currChar) {
				answer++;
			}
		}
		return answer;
	}
}
