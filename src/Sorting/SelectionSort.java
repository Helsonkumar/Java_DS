package Sorting;

public class SelectionSort {

	// This is similar to BubbleSort
	// But the number of swapping is reduced to N/2.
	// But comparison is similar or BubbleSort : N ^ 2.
	// Complexity : O(N ^ 2)
	// Can be used for items of lesser number.
	// Used instead of Bubble sort where the swapping cost is costlier.

	static int[] in_arr = new int[25];

	public static void main(String[] args) {

		for (int x = 0; x < in_arr.length; x++) {
			in_arr[x] = (int) (Math.random() * 99);
		}

		for (int x = 0; x < in_arr.length; x++) {
			System.out.print(in_arr[x] + " ");
			;
		}

		selectionSort();

	}

	public static void selectionSort() {

		int start = 0;
		int end = in_arr.length - 1;

		while (start < end) {

		}

	}

	public static void swap(int x, int y) {
		int temp;
		temp = in_arr[x];
		in_arr[x] = in_arr[y];
		in_arr[y] = temp;

	}

}
