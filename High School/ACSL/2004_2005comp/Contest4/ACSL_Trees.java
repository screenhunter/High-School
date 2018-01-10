package Contest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACSL_Trees {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int counter = 1; counter <= 5; counter++) {

			System.out.println("Please enter the input seperated by commas and/or spaces:");
			String line = in.readLine();

			Node root = null;

			for (char c : line.toCharArray()) {

				if (root == null) {
					
					root = new Node(c);
					continue;
					
				}
				
				Node temp = finder(root, c);
				
				if (temp.compareTo(c) > 0)
					temp.right = new Node (c);
				else
					temp.left = new Node(c);

			}
			
			System.out.println(counter + ". " + depth(root));

		}

		in.close();

	}
	
	private static Node finder(Node n, char c) {
		
		if (n.compareTo(c) > 0)
			if (n.right == null)
				return n;
			else
				return finder(n.right, c);
		else if (n.compareTo(c) < 0)
			if (n.left == null)
				return n;
			else
				return finder(n.left, c);
	
		return n;
		
	}

	private static int depth(Node n) {

		if (n == null)
			return -1;

		return 1 + Math.max(depth(n.left), depth(n.right));

	}

}

class Node {

	public Node right;
	public Node left;
	public char value;

	public Node(char val) {

		value = val;
		right = null;
		left = null;

	}

	public int compareTo(char c) {

		if (c > value)
			return 1;
		else
			return -1;

	}

}