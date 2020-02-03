package Brute_Force;

// For a given set of matrices , identify the way to parenthesize the set of the multiplication

// of the matrices within the set returns lower cost of scalar multiplication.
//Importaant Note :
// Cost of one matrix A (PQ) = 0
// Cost of 2 Matrix : Matrix A(PQ) , Matrix(QR) = PQR
// Resultant matrix has dimension of PR
//Steps in DP:
//Step 1 : Define the optimal substructure
//Step 2 : Recursively define the optimal value
//Step 3 : Compute the optimal value of sub structure
//Step 4 : Compute the final optimal value by combining the optimal value of sub problem
//
//for given set of matrices (i,j) e.g (1,5)
// Optimal Result = func(1,k) + func(k+1,j) + PQR (cost of multiplying the resultant matrix)

public class MatrixMultiplication {
	static int[] mat_dim = { 2, 3, 4, 5, 2, 4 };
	static int n = mat_dim.length;

	public static void main(String[] args) {

		System.out.println(calc_paranthesis(mat_dim, 1, n - 1));

	}

	public static int calc_paranthesis(int[] mat_dim, int i, int j) {

		if (i == j) {
			return 0;
		} else if (j == i + 1) {

			return mat_dim[i - 1] * mat_dim[i] * mat_dim[j];
		}

		int min_val = Integer.MAX_VALUE;
		for (int k = i; k < j; k++) {
//Watch this carefully
			min_val = Math.min(min_val, (calc_paranthesis(mat_dim, i, k) + calc_paranthesis(mat_dim, k + 1, j)
					+ (mat_dim[i - 1] * mat_dim[k] * mat_dim[j])));

		}
		return min_val;

	}

}
