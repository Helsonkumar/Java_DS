package Elementry_Algo;

public class Find_Duplicates {

	// How to find the duplicate element in the given array
	// Note : The given array contains elements within the range of arrays length
	// (0-9)

	// ***************************************************************************************************
	// ** Tip : Do always check for the relation between elements value and the
	// length of the array
	//
	// ** Tip : Do always check if the duplicate numbers are repeated only once or
	// more than once
	// ***************************************************************************************************

	// Time Complexity : O(N)
	// Space complexity : 0

	public static void main(String[] args) {

		int[] arr = { 10, 2, 5, 8, 2, 5, 8, 7, 2, 1 };
		int len = arr.length;

		for (int x : arr) {
			if (arr[len - Math.abs(x)] < 0) {
				System.out.println(Math.abs(x));
			} else
				arr[len - Math.abs(x)] = 0 - arr[len - Math.abs(x)];

		}

	}

}
