package Queue;

public class PriorityQueue {
	// Used to fetch the MAX or MIN values on high priority.
	// Represented in the form of array.
	// Deletion takes: O(1) .
	// Insertion takes: O(N). Since it needs elements to be shifted based on the key
	// The elements in the PQueue are always sorted in order.

	static int[] in_arr = new int[20];
	static int nItems = 0;

	public static void main(String[] args) {

		int[] input_arr = { 5, 8, 1, 6, 3, 1, 8, 7 };

		for (int x : input_arr) {
			if (nItems < in_arr.length)
				insert(x);
			else {
				System.out.println("Array is already full");
				System.exit(0);
			}

		}

		delete();
		delete();
		delete();
		insert(2);

	}

	public static void insert(int item) {

		int pos;
		if (nItems == 0) {
			in_arr[0] = item;
			++nItems;
			print();
		} else {

			for (pos = nItems - 1; pos >= 0; pos--) {

				if (in_arr[pos] <= item)
					break;
				else
					in_arr[pos + 1] = in_arr[pos];

			}

			in_arr[pos + 1] = item;
			++nItems;
			print();
		}

	}

	public static void delete() {

		System.out.println(in_arr[--nItems]);
		print();

	}

	public static void print() {

		for (int x = 0; x < nItems; x++) {
			System.out.print(in_arr[x]);

		}
		System.out.println(" ");

	}

}
