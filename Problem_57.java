import java.lang.reflect.Array;
import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem_57 extends ConsoleProgram {
	public void run() {
		String text1 = readLine("Input 1 : ");
		String text2 = readLine("Input 2 : ");
		
		int[] sorted1 = sortArray(text1);
		int[] sorted2 = sortArray(text2);
		
		println(Arrays.equals(sorted1, sorted2));
	}
	
	private int[] sortArray(String text) {
		int[] arr = new int[26];
		
		for (int i = 0; i < text.length(); i++) {
			int temp = text.charAt(i) - 'a';
			arr[temp]++;
		}
		
		return arr;
 	}
	
}
