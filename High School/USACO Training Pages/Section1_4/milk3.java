/*
PROG: milk3
LANG: JAVA
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Queue;

public class milk3 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("milk3.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"milk3.out")));

		String[] temp = in.readLine().split(" ");
		int[] nums = new int[3];
		for (int i = 0; i < 3; i++)
			nums[i] = Integer.parseInt(temp[i].trim());
		
		int[] cur = {0, 0, nums[2]};

		TreeSet<Integer> ans = search(new State(cur, nums));
		
		String s = "";
		
		for (int x: ans)
			s += x + " ";
		
		out.println(s.trim());

		in.close();
		out.close();
		System.exit(0);

	}

	private static TreeSet<Integer> search(State o) {

		Queue<State> q = new LinkedList<State>();
		q.add(o);

		ArrayList<State> visited = new ArrayList<State>();

		State temp;
		State cur;
		
		TreeSet<Integer> vals = new TreeSet<Integer>();
		
		while (q.size() != 0) {

			cur = q.poll();
			
			if (visited.contains(cur))
				continue;

			visited.add(cur);
			
			if (cur.state[0] == 0)
				vals.add(cur.state[2]);
			
			if (cur.state[0] != 0) {

				temp = cur.pour(0, 1);
				if (!q.contains(temp) && !visited.contains(temp))
					q.add(temp);
				
				temp = cur.pour(0, 2);
				if (!q.contains(temp) && !visited.contains(temp))
					q.add(temp);

			}
			
			if (cur.state[1] != 0) {

				temp = cur.pour(1, 0);
				if (!q.contains(temp) && !visited.contains(temp))
					q.add(temp);
				
				temp = cur.pour(1, 2);
				if (!q.contains(temp) && !visited.contains(temp))
					q.add(temp);

			}
			
			if (cur.state[2] != 0) {

				temp = cur.pour(2, 0);
				if (!q.contains(temp) && !visited.contains(temp))
					q.add(temp);
				
				temp = cur.pour(2, 1);
				if (!q.contains(temp) && !visited.contains(temp))
					q.add(temp);

			}

		}
		return vals;

	}

}

class State implements Comparable<State> {

	public int[] capacity;
	public int[] state;

	public State(int[] a, int[] b) {

		capacity = b;
		state = a;

	}

	public State pour(int x, int y) {

		int[] newState = Arrays.copyOf(state, 3);
		newState[y] += newState[x];
		newState[x] = 0;
		if (newState[y] > capacity[y]) {

			newState[x] = newState[y] - capacity[y];
			newState[y] = capacity[y];
		}

		return new State(newState, capacity);

	}

	public boolean equals(Object o) {

		State s = (State) o;
		
		for (int i = 0; i < 3; i++)
			if (capacity[i] != s.capacity[i] || state[i] != s.state[i])
				return false;

		return true;

	}

	public int compareTo(State s) {

		if (s.equals(this))
			return 0;

		return 1;

	}
	
	public String toString() {
		
		return state[0] + " " + state[1] + " " + state[2];
		
	}

}
