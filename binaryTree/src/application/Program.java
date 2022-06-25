package application;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {

		ArrayList<Integer> nodeList = new ArrayList<Integer>();
		Tree arvore = new Tree();

		for (int i = 1; i < 10; i++) {
			arvore.add(i, arvore.root);
		}
		for (int i = 1; i < 5; i++) {
			nodeList.add(arvore.sum(arvore.root, i, i));
		}
		for (int num : nodeList) {
			System.out.println("List : " + num);
		}
	}
}