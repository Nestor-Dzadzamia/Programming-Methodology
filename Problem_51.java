import acm.program.ConsoleProgram;

public class Problem_51 extends ConsoleProgram {
	public void run() {
		String input = readLine("Input : ");
		String answer = "";
		for (int i = 0; i < input.length(); i++) {
			char currChar = input.charAt(i);
			int count = countChar(currChar, i, input);
			
			if (count == 2) {
				answer += currChar;
				i++;
			} else {
				for (int j = 0; j < count; j++) {
					answer += currChar;
				}
				i += count - 1;
			}
		}
		println(answer);
	}

	private int countChar(char currChar, int i, String input) {
		int answer = 0;
		for (; i < input.length(); i++) {
			if (input.charAt(i) == currChar) {
				answer++;
			} else {
				return answer;
			}
		}
		return answer;
	}
}
