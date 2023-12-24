import acm.program.ConsoleProgram;

public class Problem_48 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		String unique = uniqueLetters(text);
		
		for (int i = 0; i < unique.length(); i++) {
			char currChar = unique.charAt(i);
			int count = countChar(text, currChar);
			
			println("Symbol: " + currChar + " count: " + count);
		}
	}
	
	private int countChar(String text, char currChar) {
		int answer = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == currChar) {
				answer++;
			}
		}
		return answer;
	}
	
	private String uniqueLetters(String text) {
		String answer = "";
		for (int i = 0; i < text.length(); i++) {
			char currChar = text.charAt(i);
			
			if (answer.contains(Character.toString(currChar)) == false) {
				answer += currChar;
			}
		}
		return answer;
	}
}
