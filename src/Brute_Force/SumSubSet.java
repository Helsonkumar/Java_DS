package Brute_Force;

public class SumSubSet {

	// Here we need to find all possible combination of numbers and compute on top
	// of them
	// So we create a STATE-SPACE-TREE with all possible combination of numbers and
	// evaluate them
	// Each possible input combination decides a branch
	// Imagine a STATE-SPACE-TREE here.
	// A branch may gives us the expected result or not
	// **** So keep evaluate a branch whilst constructing it. This is the core
	// idea*****
	// We use boundary condition to evaluate a branch. This reduces the time
	// complexity.
	public static void main(String[] args) {
		int[] arr = { 3, 1, 10, 8, 6, 5, 30, 3, 1 };
		// int[] arr = { 1, 1, 3, 3, 5, 6, 8, 10, 30 };
		// int[] arr = { 1, 2, 3, 4 };
		int accum_val = 0;
		int[] values = new int[arr.length];
		findSubSet(arr, 0, accum_val, 30, values);

	}

	public static void findSubSet(int[] inp_arr, int curr_indx, int accum_value, int sum, int[] values) {

		// If the accumalted value equals to expected sum or
		// when the sum value which is decremented for every call is equal to 0
		// The above 2 conditions tells if i have found the expected subset
		// Note : So this is the primary bound condition in the STATE-SPACE-TREE
		if (sum == 0) {
			System.out.print("possible: ");
			for (int x : values) {
				if (x != 0)
					System.out.print(x + " ");
			}
			System.out.println(" ");
			return;
		}

		// Condition 2 : If i have not found the value yet and i exceed the array , then
		// no result is possible for the given branch. So simply BACKTRACK it.
		if (curr_indx == inp_arr.length) {
			return;
		}

		if (inp_arr[curr_indx] <= sum) {
			values[curr_indx] = inp_arr[curr_indx];
			findSubSet(inp_arr, curr_indx + 1, accum_value + inp_arr[curr_indx], sum - inp_arr[curr_indx], values);
		}
		values[curr_indx] = 0;
		findSubSet(inp_arr, curr_indx + 1, accum_value, sum, values);

	}

}
