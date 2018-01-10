/*
PROG: packrec
LANG: JAVA
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.TreeSet;

public class packrec {

	private static Rect[][] nums;
	private static TreeSet<Rect> combo;
	private static int area;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("packrec.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"packrec.out")));

		nums = new Rect[4][2];
		for (int i = 0; i < 4; i++) {

			String[] line = in.readLine().split(" ");

			nums[i][0] = new Rect(Integer.parseInt(line[0]),
					Integer.parseInt(line[1]));
			nums[i][1] = new Rect(Integer.parseInt(line[1]),
					Integer.parseInt(line[0]));

		}

		area = Integer.MAX_VALUE;
		combo = new TreeSet<Rect>();

		iterate();

		out.println(area);

		for (Rect r : combo)
			out.println(r.toString());

		in.close();
		out.close();
		System.exit(0);

	}

	private static void iterate() {

		for (int a = 0; a < 2; a++)
			for (int b = 0; b < 2; b++)
				for (int c = 0; c < 2; c++)
					for (int d = 0; d < 2; d++) {

						Rect[] temp = { nums[0][a], nums[1][b], nums[2][c],
								nums[3][d] };

						case1(temp);
						caseWork(temp);

					}

	}

	private static void caseWork(Rect[] temp) {

		for (int a = 0; a < 4; a++)
			for (int b = 0; b < 4; b++)
				for (int c = 0; c < 4; c++)
					for (int d = 0; d < 4; d++)
						if (a == b || a == c || a == d || b == c || b == d
								|| c == d)
							continue;
						else {

							case2(a, b, c, d, temp);
							case3(a, b, c, d, temp);
							case4(a, b, c, d, temp);
							case5(a, b, c, d, temp);

						}

	}

	private static void case1(Rect[] temp) {

		int height = Math.max(Math.max(temp[0].l, temp[1].l),
				Math.max(temp[2].l, temp[3].l));
		int width = temp[0].w + temp[1].w + temp[2].w + temp[3].w;

		Rect newRect = new Rect(height, width);
		int newArea = height * width;

		add(newRect, newArea);
	}

	private static void case2(int a, int b, int c, int d, Rect[] temp) {

		int height = temp[a].w
				+ Math.max(Math.max(temp[b].l, temp[c].l), temp[d].l);
		int width = Math.max(temp[a].l, temp[b].w + temp[c].w + temp[d].w);

		Rect newRect = new Rect(height, width);
		int newArea = height * width;

		add(newRect, newArea);

	}

	private static void case3(int a, int b, int c, int d, Rect[] temp) {

		int height = Math.max(temp[a].l,
				temp[b].w + Math.max(temp[c].l, temp[d].l));
		int width = temp[a].w + Math.max(temp[b].l, temp[c].w + temp[d].w);

		Rect newRect = new Rect(height, width);
		int newArea = height * width;

		add(newRect, newArea);

	}

	private static void case4(int a, int b, int c, int d, Rect[] temp) {

		int height = Math.max(Math.max(temp[a].l + temp[b].l, temp[c].l),
				temp[d].l);
		int width = temp[c].w + temp[d].w + Math.max(temp[a].w, temp[b].w);

		Rect newRect = new Rect(height, width);
		int newArea = height * width;

		add(newRect, newArea);

	}

	private static void case5(int a, int b, int c, int d, Rect[] temp) {

		/*int height = Math.max(temp[a].l + temp[b].l, temp[c].l + temp[d].l);
		int width = Math.max(temp[a].w + temp[d].w, temp[b].w + temp[c].w);
		
		int height = Math.max(temp[a].l, temp[b].l) + Math.max(temp[c].l, temp[d].l);
		if (temp[a].l + temp[d].l == temp[b].l + temp[c].l)
			height = temp[b].l + temp[c].l;
		int width = Math.max(temp[a].w, temp[d].w) + Math.max(temp[b].w, temp[c].w);*/
		
		int width;
		if (temp[b].l >= temp[c].l + temp[d].l) {
			width = Math.max(Math.max(temp[a].w, temp[b].w + temp[c].w), temp[b].w + temp[d].w);
		} else if (temp[b].l >= temp[d].l){
			width = Math.max(Math.max(temp[a].w + temp[c].w, temp[b].w + temp[c].w), temp[b].w + temp[d].w);
		} else if (temp[d].l < temp[a].l + temp[b].l) {
			width = Math.max(Math.max(temp[a].w + temp[d].w, temp[a].w + temp[c].w), temp[b].w + temp[d].w);
		} else {
			width = Math.max(Math.max(temp[c].w, temp[a].w + temp[d].w), temp[b].w + temp[d].w);
		}
		
		int height = Math.max(temp[a].l + temp[b].l, temp[c].l + temp[d].l);
		
		Rect newRect = new Rect(height, width);
		int newArea = height * width;

		add(newRect, newArea);

	}

	private static void add(Rect r, int a) {

		if (a < area) {

			combo.clear();
			area = a;

		}

		if (a == area)
			if (!combo.contains(r))
				combo.add(r);

	}

}

class Rect implements Comparable<Rect> {

	public int l;
	public int w;

	public Rect(int a, int b) {

		l = a;
		w = b;

	}

	public boolean equals(Rect r) {

		if (l == r.l && w == r.w)
			return true;

		return false;

	}

	public String toString() {

		return Math.min(l, w) + " " + Math.max(l, w);

	}

	public int compareTo(Rect r) {

		return Math.min(l, w) - Math.min(r.l, r.w);

	}

}
