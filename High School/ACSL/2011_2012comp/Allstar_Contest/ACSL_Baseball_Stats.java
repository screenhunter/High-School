package Allstar_Contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ACSL_Baseball_Stats {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double[][] p = new double[3][9];

		for (int i = 0; i < 3; i++) {
			
			System.out.println("Please enter the data seperated by either spaces or commas:");

			StringTokenizer st = new StringTokenizer(in.readLine(), ", ");
			for (int j = 0; j < 9; j++)
				p[i][j] = Integer.parseInt(st.nextToken());

		}

		String[] nums = new String[3];
		HashMap<String, String> players = new HashMap<String, String>();
		DecimalFormat df = new DecimalFormat(".000");
		ArrayList<String> win = new ArrayList<String>();

		part1(p, nums, players, df, win);
		clear(players, win);
		part2(p, nums, players, df, win);
		clear(players, win);
		part3(p, nums, players, df, win);
		clear(players, win);
		part4(p, nums, players, df, win);
		clear(players, win);

	}

	private static void part1(double[][] p, String[] nums,
			HashMap<String, String> players, DecimalFormat df,
			ArrayList<String> win) {

		for (int i = 0; i < 3; i++) {

			double x = 0;
			for (int j = 1; j <= 4; j++)
				x += p[i][j];

			double y = x + p[i][0] + p[i][5];
			nums[i] = df.format(x / y);

			if (i == 0)
				players.put("A", nums[i]);
			else if (i == 1)
				players.put("B", nums[i]);
			else if (i == 2)
				players.put("C", nums[i]);

		}
		Arrays.sort(nums);

		print(players, nums, win, 1, 2);

	}
	
	private static void part2(double[][] p, String[] nums,
			HashMap<String, String> players, DecimalFormat df,
			ArrayList<String> win) {
		
		for (int i = 0; i < 3; i++) {
			
			int x = 0;
			for (int j = 0; j < 6; j++)
				x += p[i][j];
			nums[i] = x + "";
			
			if (i == 0)
				players.put("A", nums[i]);
			else if (i == 1)
				players.put("B", nums[i]);
			else if (i == 2)
				players.put("C", nums[i]);
			
		}
		Arrays.sort(nums);
		
		print(players, nums, win, 2, 0);

	}
	
	private static void part3(double[][] p, String[] nums,
			HashMap<String, String> players, DecimalFormat df,
			ArrayList<String> win) {
		
		for (int i = 0; i < 3; i++) {
			
			double x = 0;
			for (int j = 1; j < 5; j++)
				x += j*p[i][j];
			double y = 0;
			for (int j = 0; j < 6; j++)
				y += p[i][j];
			nums[i] = df.format(x/y);
			
			if (i == 0)
				players.put("A", nums[i]);
			else if (i == 1)
				players.put("B", nums[i]);
			else if (i == 2)
				players.put("C", nums[i]);
			
		}
		Arrays.sort(nums);
		
		print(players, nums, win, 3, 2);

	}
	
	private static void part4(double[][] p, String[] nums,
			HashMap<String, String> players, DecimalFormat df,
			ArrayList<String> win) {
		
		for (int i = 0; i < 3; i++) {
			
			double x = 0;
			for (int j = 1; j < 5; j++)
				x += p[i][j];
			for (int j = 6; j < 8; j++)
				x += p[i][j];
			double y = 0;
			for (int j = 0; j < 9; j++)
				y += p[i][j];
			nums[i] = df.format(x/y);
			
			if (i == 0)
				players.put("A", nums[i]);
			else if (i == 1)
				players.put("B", nums[i]);
			else if (i == 2)
				players.put("C", nums[i]);
			
		}
		Arrays.sort(nums);
		
		print(players, nums, win, 4, 2);

	}

	private static void print(HashMap<String, String> players, String[] nums,
			ArrayList<String> win, int i, int index) {

		for (String s : players.keySet())
			if (players.get(s).equals(nums[index]))
				win.add(s);

		System.out.println(i + ". "
				+ win.toString().substring(1, win.toString().length() - 1)
				+ ", " + nums[index]);

	}

	private static void clear(HashMap<String, String> players,
			ArrayList<String> win) {
		
		players.clear();
		win.clear();
		
	}

}
