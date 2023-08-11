
public class CH07_Matrix2 {

	public static void makeMatrix2(int arr[][]) {
		int row = arr.length;
		int col = arr[0].length;
		int n = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = n;
				n++;
			}
		}
	}

	public static void addition(int arr[][], int arr2[][]) {
		System.out.println("\nMatrix addition is ..");
		int row = arr.length;
		int col = arr[0].length;
		int n;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				n = arr[i][j] + arr2[i][j];
				System.out.print(n + " ");

			}
			System.out.println();
		}
	}

	public static void subtraction(int arr[][], int arr2[][]) {
		System.out.println("\nMatrix subtraction is ..");
		int row = arr.length;
		int col = arr[0].length;
		int n;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				n = arr[i][j] - arr2[i][j];
				System.out.print(n + " ");

			}
			System.out.println();
		}
	}

	public static void multiplication(int arr[][], int arr2[][]) {
		System.out.println("\nMatrix multiplication is ..");
		int row = arr.length;
		int col = arr[0].length;
		int[][] n = new int[3][3];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				for(int k = 0; k < col; k++) {
				n[i][j]+= arr[i][k] * arr2[k][j];
				}
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] A = new int[3][3];
		int[][] B = new int[3][3];

		CH07_Matrix2.makeMatrix2(A);
		CH07_Matrix.makeMatrix(B);

		// Print A, B, C
		System.out.println("\nMatrix A is ..");
		CH07_Matrix.printMatrix(A);
		System.out.println("\nMatrix B is ..");
		CH07_Matrix.printMatrix(B);

		CH07_Matrix2.addition(A, B);
		CH07_Matrix2.subtraction(A, B);
		CH07_Matrix2.multiplication(A, B);
	}
}
