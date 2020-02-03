package Brute_Force;

public class PossibleBits {

	// This class simply generates all possible combination of binary numbers (1s &
	// 0s) for a given array of length N
	// The problem is to identify all possible combination of 1s and 0s in an array
	// So we used state space tree, which is in general used to display all possible
	// state of computation. A state is defined by the input we pass to the
	// computation

	// This is good instance of STATE-SPACE-TREE. (Recursion : Look for the stack
	// size at any time)

	// In state space tree the Time Complexity is :
	// [(2 ^ n) + (2 ^ n) - 1 ] = O(2^n) which is exponential
	// The leaf node in the tree defines our possible solutions and the backtracking
	// of items
	// gives the input used to derive that solution.

	static int[] arr;

	PossibleBits(int n) {
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

	}

	public static void main(String[] args) {

		PossibleBits pb = new PossibleBits(4);
		pb.bit_gen(arr, 0);
	}

	public void bit_gen(int[] arr_inp, int bit_pos) {

		if (bit_pos < arr_inp.length) {
			arr_inp[bit_pos] = 1;
			bit_gen(arr_inp, bit_pos + 1);
			arr_inp[bit_pos] = 0;
			bit_gen(arr_inp, bit_pos + 1);

		} else {
			for (int x : arr_inp) {
				System.out.print(x + " ");
			}
			System.out.println(" ");
		}

		return;

	}

}
