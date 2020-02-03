package Graph;

import java.util.HashMap;

public class Dijkstras_Algo {
	// Find the shortest path to reach a Node
	// Note :
	// Dijkstra's algorithm can be applied only to DIRECTED ACYCLIC WEIGHTED graph.
	// The Weight of the graph must be positive.
	public static void main(String[] args) {

		// As per this algo : A graph must contain all nodes in the graph with their
		// neighbours in the value along with the
		// cost to reach their neighbour from the given node.
		HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();

		// Cost is another table which contains the all node in the graph along with
		// the cost to
		// reach those nodes from the place START (This can be anyting node within the
		// graph).
		// So ideally we change the cost hashmap for different START node.
		// This table is updated whenever we find a least value to reach a node from
		// start.
		// This updation uodates the parent table as well.
		HashMap<String, Integer> cost = new HashMap<>();

		// Parent is another table which identifies the parent of a node.
		// The current parent denotes the parent thru which a node can be reached at
		// lower cost
		// This table is updated every time we find a lower cost to reach a node than
		// the existing minimum value
		HashMap<String, String> parent = new HashMap<>();

		// Steps in Djikstar's Algo :
		/*
		 * Pick a START Node. Find the immediate least cost neighbor node. Update the
		 * cost of its neighbors in the cost node.ie. cost of reaching it neighbors from
		 * START Node The go for the next node with least cost. If U find a node can be
		 * reached with lower cost than the existing value then update that cost in the
		 * cost table for the corresponding node. Update the parent of the node in the
		 * parent table Remember: Cost table contains cost of nodes cab be reached from
		 * START node with their parent in the parent table We can back track to find
		 * the path of the reaching a node from START node using the parent and cost
		 * tables.
		 */

	}

	public static void construct_graph(HashMap<String, HashMap<String, Integer>> graph) {

		HashMap<String, Integer> graph_val_start = new HashMap<>();
		graph_val_start.put("A", 5);
		graph_val_start.put("B", 2);
		graph.put("start", graph_val_start);

		HashMap<String, Integer> graph_val_A = new HashMap<>();
		graph_val_A.put("C", 4);
		graph_val_A.put("D", 2);
		graph.put("A", graph_val_A);

		HashMap<String, Integer> graph_val_B = new HashMap<>();
		graph_val_B.put("A", 8);
		graph_val_B.put("D", 7);
		graph.put("B", graph_val_B);

		HashMap<String, Integer> graph_val_C = new HashMap<>();
		graph_val_C.put("finish", 2);
		graph_val_C.put("D", 6);
		graph.put("C", graph_val_C);

		HashMap<String, Integer> graph_val_D = new HashMap<>();
		graph_val_D.put("finish", 1);
		graph.put("D", graph_val_D);

		graph.put("finish", null);

	}

	public static void contruct_cost(HashMap<String, Integer> cost) {

		int max_val = Integer.MAX_VALUE;

		cost.put("A", 5);
		cost.put("B", 2);
		cost.put("C", max_val);
		cost.put("D", max_val);
		cost.put("finish", max_val);

	}

	public static void construct_parent() {

	}

}
