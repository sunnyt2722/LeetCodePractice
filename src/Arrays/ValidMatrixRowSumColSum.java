package Arrays;

public class ValidMatrixRowSumColSum {
//	Find Valid Matrix Given Row and Column Sums
	public static void main(String[] args) {
		int rowSum[] = { 5, 7, 10 };
		int colSum[] = { 8, 6, 8 };
		int restoredMatrixValue[][] = restoreMatrix(rowSum, colSum);
		for (int i = 0; i < restoredMatrixValue.length; i++) {
			System.out.println();
			for (int j = 0; j < restoredMatrixValue[i].length; j++)
				System.out.print("\t" + restoredMatrixValue[i][j]);
		}
	}

	public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
		int rowCount = rowSum.length;
		int colCount = colSum.length;

		// Initialize the matrix to return
		int[][] restoredMatrix = new int[rowCount][colCount];

		// Iterate over each cell in the matrix to calculate its value
		for (int row = 0; row < rowCount; ++row) {
			for (int col = 0; col < colCount; ++col) {
				// Determine the minimum value to satisfy both rowSum and colSum constraints
				int value = Math.min(rowSum[row], colSum[col]);
				restoredMatrix[row][col] = value;

				// After setting the value for restoredMatrix[row][col], subtract it from
				// the corresponding rowSum and colSum to maintain the sum constraints
				rowSum[row] -= value;
				colSum[col] -= value;
			}
		}
		// Return the restored matrix that matches the given row and column sums
		return restoredMatrix;
	}
}
