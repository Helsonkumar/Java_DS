package Dynamic_Programming;

public class KnapSack {

// Dynamic Programming =  Recursion + Memoization (Top Down Approach)
// Dynamic Programming =  Iteration + Tabulation (Bottom Up Approach)
// Used when there is a recursion and overlapping sub problem
// Idea is to store the calculated result of sub problem and reuse it when needed(in the overlapped space)
// We trade space for time . Time complexity reduces to linear(n) from Exponential (2 ^ n)

// DP is useful when you want to optimize something given a constraint
// Here in Knapsack you want to find the optimal price of the given constraint which is the capacity

	public static void main(String[] args) {

		int[] price = { 40, 25, 10, 6, 31 };
		int[] weight = { 2, 4, 1, 5, 3 };
		int x = price.length;
		KanpSack_Obj ks = new KanpSack_Obj(x, 7);
		ks.construct_mat(price, weight);

	}

	static class KanpSack_Obj {
		int[][] dp;
		int cap;

		public KanpSack_Obj(int row_size, int capacity) {
			dp = new int[row_size][capacity + 1];
			cap = capacity;
		}

		public void construct_mat(int[] price, int[] weight) {

			// Below 2 loops which initialize the matrix for the first element
			for (int i = 0; i < dp.length; i++) {
				dp[i][0] = 0;
			}

			for (int c = 1; c <= cap; c++) {
				if (weight[0] <= c) {
					dp[0][c] = price[0];
				}
			}

			// Core logic. Here we use the tabulation of bottom up approach
			// Note : *********All DP problem consist of a grid************.
			for (int r = 1; r < dp.length; r++) {
				for (int c = 1; c < dp[r].length; c++) {

					if (weight[r] > c) {
						// If weight of the curent element is greater than the given capcity.Get the
						// optimal value from the
						// previous processing for the given capacity.
						dp[r][c] = dp[r - 1][c];
					} else if (weight[r] == c) {
						// If the weight of the current element is equal to the given capacity
						// Check for the maximum of the previous calc and the current element value
						dp[r][c] = Math.max(price[r], dp[r - 1][c]);
					} else
						// If the weight of the current element is lesser than the given capacity
						// then check for the Max from the previous optimal value for the given capacity
						// And from the value derived by adding the cuurent element in the bag and value
						// of the
						// remaining space left after adding the current element
						dp[r][c] = Math.max(price[r] + dp[r - 1][c - weight[r]], dp[r - 1][c]);
				}
			}

			for (int r = 0; r < dp.length; r++) {
				for (int c = 0; c < dp[0].length; c++) {
					System.out.print(dp[r][c] + " ");
				}
				System.out.println(" ");

			}

		}

	}
}
