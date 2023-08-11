
public class CH07_Matrix {
	public static void makeMatrix(int arr[][]) {
		int row = arr.length;
		int col = arr[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = i + j;
			}
		}
	}

	public static void printMatrix(int arr[][]) {
		int row = arr.length;
		int col = arr[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] A = new int[3][5];
		int[][] B = new int[5][3];
		int[][] C = new int[3][3];

		CH07_Matrix.makeMatrix(A);
		CH07_Matrix.makeMatrix(B);
		CH07_Matrix.makeMatrix(C);

		// Print A, B, C
		System.out.println("\nMatrix A is ..");
		CH07_Matrix.printMatrix(A);
		System.out.println("\nMatrix B is ..");
		CH07_Matrix.printMatrix(B);
		System.out.println("\nMatrix C is ..");
		CH07_Matrix.printMatrix(C);
	}
}
