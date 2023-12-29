import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem_61 extends ConsoleProgram {
	public void run() {
		int m = readInt("Enter m: ");
		int n = readInt("Enter n: ");
		
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			int input = readInt("Input: ");
			arr[i] = input;
		}
		
		println(Arrays.toString(combination(arr, n, m)));
	}
	
	private int[] combination(int[] arr, int n, int m) {
		int[] answer = new int[2];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] + arr[i] == m) {
					answer[0] = arr[i];
					answer[1] = arr[j];
				}
			}
		}
		return answer;
		
	}
	
}
