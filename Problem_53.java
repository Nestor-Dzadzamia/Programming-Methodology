import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem_53 extends ConsoleProgram {
	public void run() {
		int word = 0;
		int symbol = 0;
		int point = 0;
		int questionMark = 0;
		int exclamationMark = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("radomText.txt"));
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				} else {
					StringTokenizer tokenizer = new StringTokenizer(line);
					
					while (tokenizer.hasMoreTokens()) {
						String currentWord = tokenizer.nextToken();
						println(currentWord);
						if (isWord(currentWord)) word++;
						if (isSymbol(currentWord)) symbol++;
						if (endsWithPoint(currentWord)) point++;
						if (endsWithQuestionMark(currentWord)) questionMark++;
						if (endsWithExclamationMark(currentWord)) exclamationMark++;
					}
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		println("Word : " + word);
		println("Symbol :" + symbol);
		println("Word that ends with Point : " + point);
		println("Word that ends with Question Mark : " + questionMark);
		println("Word that ends with Exclamation Mark : " + exclamationMark);
	}

	private boolean endsWithExclamationMark(String currentWord) {
		return currentWord.charAt(currentWord.length() - 1) == '!' && currentWord.length() > 1;
	}

	private boolean endsWithQuestionMark(String currentWord) {
		return currentWord.charAt(currentWord.length() - 1) == '?' && currentWord.length() > 1;
	}

	private boolean endsWithPoint(String currentWord) {
		return currentWord.charAt(currentWord.length() - 1) == '.' && currentWord.length() > 1;
	}

	private boolean isSymbol(String currentWord) {
		return currentWord.length() == 1 && (currentWord.charAt(0) < 'a' || currentWord.charAt(0) > 'z')
				&& (currentWord.charAt(0) < 'A' || currentWord.charAt(0) > 'Z');
	}

	private boolean isWord(String currentWord) {
		return currentWord.length() > 1;
	}
}
