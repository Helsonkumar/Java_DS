package Sorting;

public class BubbleSort {

	static int[] in_arr = new int[25];

	// This is a simple Bubble Sort Algorithm.
	// This is how it works : Compare each element with the very next one.
	// If it is greater that its right one then swap it.
	// Keep repeating this until the end boundary is reached.(in the inner loop).
	// Then decrement the end boundary(in the outer loop)
	// Stop the outer loop when the end boundary reaches 0.

	// Complexity : O(N ^ 2)
	// For each element we do N-1 Comparison and Swapping
	// N + (N-1) + (N-2) + (N-3) + .... => [N * (N-1)] / 2.

	public static void main(String[] args) {

		for (int x = 0; x < 25; x++) {
			in_arr[x] = (int) (Math.random() * 99);

		}

		for (int x = 0; x < 25; x++) {
			System.out.print(in_arr[x] + " ");
			;
		}

		System.out.println(" ");

		bubbleSort();

	}

	public static void bubbleSort() {

		int end = in_arr.length - 1;

		// Check for this outer Loop : Which ensures that end is greater than 0
		while (end > 0) {
			int start = 0;
			// Check for this inner loop : Which ensures that the start is always lesser
			// than the pre-set end
			// *** This is a great thinking : Outer Loop and Inner Loop
			while (start < end) {
				if (in_arr[start] > in_arr[start + 1]) {
					swap(start, start + 1);
				}
				++start;
			}
			--end;

		}

		for (int x = 0; x < in_arr.length; x++) {
			System.out.print(in_arr[x] + " ");
		}

	}

	public static void swap(int x, int y) {

		int temp;
		temp = in_arr[x];
		in_arr[x] = in_arr[y];
		in_arr[y] = temp;

	}
}
