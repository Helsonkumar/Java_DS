package Tree;

public class Segement_tree {

	static int arr_len;

	// Note:
	// This segment tree algorithm works for any number of input length,
	// not just for length which is power of 2 like 2,4,8,16,etc

	// To check if an array length is power of 2
	// for give n find log(n). This gives value y. If y is pure integer then that
	// number if power of 2
	// TO check if 'y' is power of 2 Math.ceil(y) == Math.floor(y). ceil(3.5) = 4,
	// Floor(3.5) = 3. Nearest integer

	// In binary tree : Parent of a child at index x can be found at (x-1)/2.
	// Left child of node at index x : 2x+1
	// Right child of node at index x : 2x+2

	public static void main(String[] args) {

		// int[] input_array = new int[] { 100, 20, 34, 1, 156, 54, 78, 2 };
		int[] input_array = new int[] { 100, 20, 34, 1, 156, 54, 78 };
		arr_len = input_array.length;
		int[] segment_tree = construct_tree(input_array);
		update_tree(4, 157, segment_tree);
		System.out.println(search_range(1, 5, segment_tree));

	}

	public static int[] construct_tree(int[] inp) {

		int[] segment_tree = new int[2 * arr_len - 1];
		int start = arr_len - 1;
		for (int x : inp) {
			segment_tree[start] = x;
			++start;
		}
		for (int i = arr_len - 2; i >= 0; i--) {
			segment_tree[i] = segment_tree[(2 * i) + 1] + segment_tree[(2 * i) + 2];
		}

		for (int y : segment_tree) {
			System.out.print(y + " ");
		}

		System.out.println("\n");
		return segment_tree;

	}

	public static void update_tree(int inx, int value, int[] segment_tree) {

		int seg_index = inx + arr_len - 1;
		segment_tree[seg_index] = value;

		while (seg_index > 0) {
			seg_index = (seg_index - 1) / 2;
			segment_tree[seg_index] = segment_tree[(2 * seg_index) + 1] + segment_tree[(2 * seg_index) + 2];

		}

		for (int x : segment_tree) {
			System.out.print(x + " ");

		}
		System.out.println("\n");

	}

	public static int search_range(int start, int end, int[] segment_tree) {

		// 3 6
		int seg_start = start + arr_len - 1;
		int seg_end = end + arr_len - 1;
		int sum = 0;
		while (seg_start < seg_end) {
			if ((seg_start % 2) == 0) {
				sum += segment_tree[seg_start];
				++seg_start;
			}

			if ((seg_end % 2) == 1) {
				sum += segment_tree[seg_end];
				--seg_end;
			}

			seg_start = (seg_start - 1) / 2;
			seg_end = (seg_end - 1) / 2;

			if (seg_start == seg_end) {
				sum += segment_tree[seg_start];
			}

		}

		return sum;

	}
}
