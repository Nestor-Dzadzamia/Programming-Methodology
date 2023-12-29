import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem_59 extends ConsoleProgram {
	public void run() {
		int[][] matrix1 = new int[][] {
			{0,1,1,0,0,1,0,0}, 
			{0,1,1,1,1,1,0,0},
			{0,0,1,1,1,1,0,0}, 
			{0,0,1,1,1,1,0,0},
		};
		
		int[][] matrix2 = new int[][] {
			{0,1,1,1,1,1,1,1,1,1,1,1,0}, 
			{0,0,1,1,1,1,1,1,1,1,1,0,0},
			{0,0,0,1,1,1,1,1,1,1,0,0,0}, 
			{0,0,0,0,1,1,1,1,1,0,0,0,0},
			{0,0,0,0,0,1,1,1,0,0,0,0,0},
			{0,0,0,1,1,1,1,1,1,1,1,0,0},
		};
		
		printMatrix(matrix1);
		println("-----------------");
		println("Max Rectangle Area : " + maxRectArea(matrix1));
		
		printMatrix(matrix2);
		println("-----------------");
		println("Max Rectangle Area : " + maxRectArea(matrix2));
	}
	
	private int maxRectArea(int[][] matrix) {
		int answer = 0;
		int row = matrix.length;
		int column = matrix[0].length;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				for (int k = i; k < row; k++) {
					for (int l = j; l < column; l++) {
						if (isValidMatrix(matrix, i, j, k, l)) {
							int area = (k - i + 1) * (l - j + 1);
							if (area > answer) {
								answer = area;
							}
						}
					}
				}
			}
		}
		return answer;
	}
	
	private boolean isValidMatrix(int[][] matrix, int i, int j, int k, int l) {
		for (int row = i; row <= k; row++) {
			for (int col = j; col <= l; col++) {
				if (matrix[row][col] != 1) return false; 
			}
		}
		return true;
	}
	
	private void printMatrix(int[][] matrix) {
		for (int[] arr : matrix) {
			println(Arrays.toString(arr));	
		}
	}
	
	
}
