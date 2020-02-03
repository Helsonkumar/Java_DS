package Tree;

public class Tree_algorithm {

	public static void main(String[] args) {

		System.out.println("This is Tree algorithm");
		Tree tree = new Tree();
		// Node n = new Node(32, "Helson");
		// tree.insert();

	}

}

class Node {

	int id;
	String Name;
	Node leftChild;
	Node rightChild;

	public void Node(int id, String Name) {

		this.id = id;
		this.Name = Name;

	}

}

class Tree {

	Node root;

	public void Tree() {
		root = null;
	}

	public boolean search(Node N) {

		Node current = root;

		if (root.id == N.id) {
			return true;
		} else
			current = root;
		while (current != null) {
			if (current.id < N.id) {
				current = current.leftChild;
			} else if (current.id > N.id) {
				current = current.rightChild;
			} else
				return true;
		}
		return false;
	}

	public boolean insert(Node N) {

		Node current;

		if (root == null) {
			root = N;
			return true;
		} else {
			current = root;
			while (current != null) {
				if (N.id < current.id) {
					current = current.leftChild;
				} else if (N.id > current.id) {
					current = current.rightChild;
				} else
					return false;
			}
			current = N;
			return true;
		}

	}

	// public boolean delet(Node N) {}
}