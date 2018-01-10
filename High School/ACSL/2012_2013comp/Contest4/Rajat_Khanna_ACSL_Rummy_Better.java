package Contest4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 * Rajat Khanna
 * Thomas Jefferson High School for Science and Technology
 * Junior Division
 * Contest #4 2012-2013
 * ACSL Rummy
 */

public class Rajat_Khanna_ACSL_Rummy_Better {

	private static final String nums = "A23456789TJQK";
	private static final String suits = "DCHS";

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int counter = 1; counter <= 5; counter++) {

			System.out
					.println("Please enter the input seperated by commas and/or spaces:");

			StringTokenizer st = new StringTokenizer(in.readLine(), ", ");

			HashMap<Integer, String> map = new HashMap<Integer, String>();
			ArrayList<Integer> cards = new ArrayList<Integer>();

			while (st.hasMoreElements()) {

				String c = st.nextToken();
				int x = suits.indexOf(c.charAt(1) + "")
						+ nums.indexOf(c.charAt(0) + "") * 4;
				map.put(x, c);
				cards.add(x);

			}

			ArrayList<Integer> nums = new ArrayList<Integer>();

			Collections.sort(cards);

			ArrayList<Integer> p1 = find(cards);
			if (p1 != null) {

				nums.addAll(p1);
				cards.removeAll(p1);

			}

			ArrayList<Integer> p2 = find(cards);
			if (p2 != null) {

				nums.addAll(p2);
				cards.removeAll(p2);

			}

			Collections.reverse(cards);

			nums.addAll(cards);
			print(nums, map, counter);

		}

		in.close();

	}

	private static void print(ArrayList<Integer> cards,
			HashMap<Integer, String> map, int x) {

		String ans = "";

		for (int i = 0; i < cards.size(); i++) {

			if (i != 0)
				ans += ", ";

			ans += map.get(cards.get(i));

		}

		System.out.println(x + ". " + ans);

	}

	private static ArrayList<Integer> find(ArrayList<Integer> cards) {

		ArrayList<Integer> p1 = runFinder(cards);
		ArrayList<Integer> p2 = setFinder(cards);

		if (p1 == null && p2 == null)
			return null;
		else if (p1 == null)
			return p2;
		else if (p2 == null)
			return p1;
		else if (p2.size() > p1.size())
			return p2;
		else
			return p1;

	}

	private static ArrayList<Integer> setFinder(ArrayList<Integer> cards) {

		ArrayList<Integer> ans = null;

		ArrayList<Integer> temp = new ArrayList<Integer>();

		for (int i = 0; i < cards.size(); i++) {

			temp.clear();

			for (int j = i; j < cards.size(); j++)
				if (cards.get(i) / 4 == cards.get(j) / 4)
					temp.add(cards.get(j));

			if (temp.size() >= 3)
				if (ans == null || temp.size() > ans.size())
					ans = (ArrayList<Integer>) temp.clone();

		}

		if (ans != null) {
			
			Collections.sort(ans);
			Collections.reverse(ans);
			
		}

		return ans;

	}

	private static ArrayList<Integer> runFinder(ArrayList<Integer> cards) {

		ArrayList<Integer> ans = null;

		ArrayList<Integer> temp = new ArrayList<Integer>();

		for (int i = 0; i < cards.size(); i++) {

			temp.clear();

			for (int j = i; j < cards.size(); j++)
				if (cards.get(j) == cards.get(i) + temp.size() * 4)
					temp.add(cards.get(j));

			if (temp.size() >= 3)
				if (ans == null || temp.size() > ans.size())
					ans = (ArrayList<Integer>) temp.clone();

		}

		if (ans != null)
			Collections.sort(ans);

		return ans;

	}

}
