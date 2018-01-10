/*
rkhanna 
Rajat Khanna
XX/XX/2014
prog: bgm
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class bgm {
	
	public static BufferedReader in;
	public static PrintWriter out;
	
	public static void main(String[] args) throws Exception {
		
		long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("bgm.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("bgm.out")));
		
		int N = Integer.parseInt(in.readLine());
		HashMap<String, long[]> count = new HashMap<String, long[]>();
		
		count.put("B", new long[7]);
		count.put("E", new long[7]);
		count.put("S", new long[7]);
		count.put("I", new long[7]);
		count.put("G", new long[7]);
		count.put("O", new long[7]);
		count.put("M", new long[7]);
		
		//B, E, S, I, G, O, M
		String[] line;
		for (int i = 0; i < N; i++) {
			
			line = in.readLine().split(" ");
			count.get(line[0])[((Integer.parseInt(line[1]) % 7) + 7) % 7]++;
			
		}
		
		long ans = 0;
		
		for (int B = 0; B < 7; B++) if (count.get("B")[B] > 0)
			for (int E = 0; E < 7; E++) if (count.get("E")[E] > 0)
				for (int S = 0; S < 7; S++) if (count.get("S")[S] > 0)
					for (int I = 0; I < 7; I++) if (count.get("I")[I] > 0)
						for (int G = 0; G < 7; G++) if (count.get("G")[G] > 0)
							for (int O = 0; O < 7; O++) if (count.get("O")[O] > 0)
								for (int M = 0; M < 7; M++) if (count.get("M")[M] > 0)
									
									if (((B + 2*E + 2*S + I) * (G + O + E + S) * (M + 2*O)) % 7 == 0)
										ans += count.get("B")[B]*count.get("E")[E]*count.get("S")[S]*count.get("I")[I]*count.get("G")[G]*count.get("O")[O]*count.get("M")[M];
		
		out.println(ans);
		
		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
