import acm.program.ConsoleProgram;

public class Problem_47 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter Text: ");
		
		println(isPallindrome(text));
	}
	
	private boolean isPallindrome(String text) {
		String answer = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			answer += text.charAt(i);
		}
		
		return answer.equals(text);
	}
}
