/*
PROG: ctiming
LANG: JAVA
*/



import java.io.*;

public class ctiming {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader("ctiming.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ctiming.out")));
		
		String[] array = in.readLine().split(" ");
		
		int D = Integer.parseInt(array[0]);
		int H = Integer.parseInt(array[1]);
		int M = Integer.parseInt(array[2]);
		
		int min = con(11, 11, 11);
		int max = con(D, H, M);
		
		int num = max - min;
		
		if (num < 0)
			num = -1;
		
		in.close();
		out.println(num);
		out.close();
		
		System.exit(0);
		
	}
	
	private static int con(int d, int h, int m) {
		
		return d*60*24 + h*60 + m;
		
	}

}