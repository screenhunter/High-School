import java.io.IOException;
import java.util.PriorityQueue;

public class temp12435145 {

	public static String str = "abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) throws IOException {

		PriorityQueue<Node> q = new PriorityQueue<Node>();

		Node x = new Node(3, 10);
		Node y = new Node(4, 1000000);
		x.children.add(y);

		q.add(new Node(1, 1000000));
		q.add(new Node(2, 1000000));
		q.add(x);
		q.add(x.children.get(0));

		int temp = 2;
		while (temp > 0) {

			Node n = q.poll();
			System.out.println(n.index + " " + n.dist);
			
			if (n.children.size() > 0)
				if (temp == 2)
					n.children.get(0).dist = 3;
				else
					n.children.get(0).dist = 1;

			q.add(n);
			temp--;

		}

		System.out.println(q.poll().index);

	}
}
