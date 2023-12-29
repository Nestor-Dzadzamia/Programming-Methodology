import acm.program.ConsoleProgram;

public class Problem_58 extends ConsoleProgram {
	boolean found = false;
	public void run() {
		int n = readInt("Enter size : ");
		int [][] matrix = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = readInt("Enter val: ");
			}
		}
		
		println(isMagical(matrix, n));
	}
	
	private boolean isMagical(int[][] matrix, int n) {
		int[] answer = new int[n * n];
		int index = 0;
		if (matrix.length != matrix[0].length) return false;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				answer[index] = matrix[i][j];
				index++;
			}
		}
		
		for (int i = 1; i <= n * n; i++) {
			if (containsValue(answer, i) == false) return false;
		}
		
		return true;
	}
	
	private boolean containsValue(int[] answer, int i) {
		for (int j = 0; j < answer.length; j++) {
			if (answer[j] == i) return true;
		}
		return false;
	}
}
