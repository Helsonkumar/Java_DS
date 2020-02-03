package Brute_Force;

public class NxN_Queen {

	// ************************************** Problem Statement
	// ***************************************************
	// We have N queens.
	// Find all possible position in the N x N matrix where all queens can be placed
	// without conflict.
	// ************************************************************************************************************

	// Idea : We need to check all possible placements of the N queens within the N
	// x N matrix.
	// So we need to construct a SST(STATE-SPACE-TREE) in this brute force approach
	// Here the condition is to check if there is a conflict whilst placing any
	// Queen with other Queens
	// ****** Condition : Queens cannot be placed in the same row, column, diagonal
	//

	static int N;

	NxN_Queen(int N) {
		this.N = N;
	}

	public static void main(String[] args) {

		NxN_Queen queen = new NxN_Queen(10);
		int[] arr_holder = new int[N + 1];
		queen.place_Queen(arr_holder, 1);

	}

	public void place_Queen(int[] holder, int col) {

		if (col >= holder.length) {
			for (int items : holder) {
				if (items != 0)
					System.out.print(items + " ");
			}
			System.out.println(" ");

		}

		for (int i = col; i < holder.length; i++) {
			boolean conflict = false;
			for (int row_num = 1; row_num <= N; row_num++) {
				conflict = false;
				for (int inx = 1; inx < col; inx++) {
					if (holder[inx] == row_num) {
						conflict = true;
						break;
					}

					if (((row_num + col) == (holder[inx] + inx)) || ((row_num - col) == (holder[inx] - inx))) {
						conflict = true;
						break;
					}

				}

				if (!conflict) {
					holder[col] = row_num;
					place_Queen(holder, col + 1);

				}

			}

			return;
		}

	}

}
