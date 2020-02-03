package Brute_Force;

// Given a rod of length N and it can be cut into to pieces of length in range (1,N) and the given
// cost of each rod pieces of given length, calculate how the given rod can be cut into pieces 
// of any length so the total cost of those pieces makes the maximum cost/profit

// this is similar to KnapSack problem. But instead of 
// Items : we have rods of specific length
// Cost : we have price of each rod pieces
// weight : we have length of the given rod N

// So for Dynamic programming we have the given constraint as length. ie total length of rod pieces cannot exceed the 
// given length N
// The optimization factor is cost of rods.ie maximum of sum of rod pieces
// So here after cutting a rod in to a piece of 1 inch : we have the remaining piece of length 3
// for which we need to find the max profit
// So this follows a sub problem structure

// Formulated as follows : max[1<= i <= N](p(i) + fun(N-i))

public class RodCutting {

	public static void main(String[] args) {
		int[] price = { 1, 5, 8, 9, 7, 20, 2, 18, 11, 14, 4, 6 };
		int max_profit = calc(price, 12);
		System.out.println(max_profit);

	}

	public static int calc(int[] p, int N) {

		if (N <= 0) {
			return 0;
		}

		int max_val = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			max_val = Math.max(max_val, p[i] + calc(p, N - i - 1));
		}

		return max_val;

	}

}
