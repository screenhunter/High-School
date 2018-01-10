import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

/*
 * Problem G
 * How do I make change?
 */

public class G {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		double amount = Double.parseDouble(in.readLine().substring(1)) * 100;

		System.out.println(amount);

		PriorityQueue<Change> coins = new PriorityQueue<Change>();

		int x = (int) (amount / 25);
		int y = (int) (amount / 10);
		int z = (int) (amount / 5);
		int w = (int) (amount / 1);

		for (int a = 0; a <= x; a++)
			for (int b = 0; b <= y; b++)
				for (int c = 0; c <= z; c++)
					for (int d = 0; d <= w; d++)
						if (25 * a + 10 * b + 5 * c + d == (int) amount) {
							
							Change temp = new Change();
							if (a > 0)
								temp.add(a + " quarters");
							if (b > 0)
								temp.add(b + " dimes");
							if (c > 0)
								temp.add(c + " nickels");
							if (d > 0)
								temp.add(d + " pennies");
							
							coins.add(temp);

						}
		
		while (coins.size() > 0)
			coins.poll().print();

		in.close();

	}

}

class Change implements Comparable<Change> {

	private ArrayList<String> coins;
	private int num;

	public Change() {

		coins = new ArrayList<String>();
		num = 0;

	}

	public void add(String s) {

		num += Integer.parseInt(s.substring(0, s.indexOf(" ")));
		coins.add(s);

	}

	public int compareTo(Change o) {

		return this.num - o.num;

	}

	public void print() {

		System.out.println(coins.toString().substring(1, coins.toString().length()-1) + ".");

	}

}
