/*
PROG: crypt1
LANG: JAVA
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class crypt1 {
	
	private static int N;
	private static ArrayList<String> nums;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader("crypt1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crypt1.out")));
		
		N = Integer.parseInt(in.readLine());
		nums = new ArrayList<String>();
		String[] line = in.readLine().split(" ");
		for (int i = 0; i < N; i++)
			nums.add(line[i]);
		
		int count = 0;
		
		for (int i = 100; i <= 999; i++) {
			
			if (!check(i))
				continue;
			
			for (int j = 10; j <= 99; j++) {
				
				if (!check(j))
					continue;
				
				if ((i*j + "").length() != 4 || !check(i*j))
						continue;
				
				if ((i*(j/10) + "").length() != 3 || !check(i*(j/10)))
					continue;
				
				if ((i*(j%10) + "").length() != 3 || !check(i*(j%10)))
					continue;
				
				count++;
				
			}
			
		}
		
		out.println(count);
		
		in.close();
		out.close();
		System.exit(0);
		
	}
	
	private static boolean check(int x) {
		
		for (char c: (x + "").toCharArray())
			if (!nums.contains(c + ""))
				return false;
		
		return true;
		
	}

}
