import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem_56 extends ConsoleProgram {
	public void run() {
		int n = readInt("Input N: ");
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			int input = readInt();
			arr[i] = input;
		}
		
		println(Arrays.toString(sortedArray(arr)));
	}
	
	private int[] sortedArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
