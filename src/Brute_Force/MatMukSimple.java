package Brute_Force;

public class MatMukSimple {

	/*
	 * This program is simply going to give you the multiplication of 2 matrix
	 * Matrix A = PQ , Matrix B = QR Note : Basic check is to see if the columns of
	 * A should be equal to rows of B ie. A.col == B.row. The product of A and B
	 * gives another matrix with dimension : PR The cost of multiplying A and B =
	 * PQR (for doing scalar multiplication)
	 */

	public static void main(String[] args) {

		int[][] mat1 = { { 2, 2, 2 }, { 2, 2, 2 } };
		int[][] mat2 = { { 3, 3, 4 }, { 3, 3, 4 }, { 3, 3, 4 } };

		int[][] result;
		// Check if the A.rows = B.columns
		if (mat1[0].length == mat2.length) {
			result = new int[mat1.length][mat2[0].length];
			for (int rows = 0; rows < mat1.length; rows++) {
				for (int col = 0; col < mat2[0].length; col++) {

					int C = 0;
					for (int k = 0; k < mat1[rows].length; k++) {
						C = C + (mat1[rows][k] * mat2[k][col]);
					}

					result[rows][col] = C;

				}

			}

			for (int x = 0; x < result.length; x++) {
				for (int y = 0; y < result[x].length; y++) {

					System.out.print(result[x][y] + " ");
				}
				System.out.println();

			}

		} else
			System.out.println("Matrix dimensions are invalid");

	}

}
