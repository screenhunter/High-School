/*
rkhanna
Rajat Khanna
XX/XX/2014
PROG: name
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;

public class auto {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, W;
	public static String[] inorder;
	public static HashMap<String, Integer> dict;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("auto.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("auto.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[1]);
		W = Integer.parseInt(line[0]);
		dict = new HashMap<String, Integer>();
		inorder = new String[W];

		for (int i = 0; i < W; i++) {
			
			inorder[i] = in.readLine();
			dict.put(inorder[i], i+1);

		}

		Arrays.sort(inorder);
		
		int term;
		String word;
		first: for (int count = 0; count < N; count++) {
			
			line = in.readLine().split(" ");
			term = Integer.parseInt(line[0]);
			word = line[1];
			
			int index = Arrays.binarySearch(inorder, word);
			if (index < 0)
				index = -(index + 1);
			
			index += term - 1;
			
			if (index >= W) {
				
				out.println(-1);
				continue first;
				
			}
			
			for (int i = 0; i < word.length() && i < inorder[index].length(); i++)
				if (word.charAt(i) != inorder[index].charAt(i)) {
					
					out.println(-1);
					continue first;
					
				}
			
			out.println(dict.get(inorder[index]));
			
		}

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

}
