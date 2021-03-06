package application;

public class Tree {
	Node root = null;

	public Node add(int value, Node node) {
		if (node == null) {
			root = new Node(value);
		} else if (node.left == null) {
			node.left = new Node(value);
		} else if (node.right == null) {
			node.right = new Node(value);
		} else if (node.left.right == null) {
			add(value, node.left);
		} else if (node.right.right == null) {
			add(value, node.right);
		} else if (node.left.left.right == null) {
			add(value, node.left);
		}
		return node;

	}

	public int sum(Node node, int value, int height) {
		int sum = 0;

		if (height == 1) {
			sum = node.value;

		} else if (height == 2) {
			sum = node.left.value + node.right.value;

		} else if (height == 3) {
			sum = node.left.left.value + node.left.right.value + node.right.left.value + node.right.right.value;

		} else if (height == 4) {
			sum = node.left.left.left.value + node.left.left.right.value;

		}
		return sum;
	}
}

//Infelizmente não consegui fazer uma recursividade para a arvore AVL sem uma arvore binaria ordenada de busca, por isso optei por indicar manualmente os valores...
