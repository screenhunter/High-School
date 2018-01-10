package Allstar_Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ACSL_Krypto {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int counter = 1; counter <= 10; counter++) {
			
			StringTokenizer st = new StringTokenizer(in.readLine(), ", ");
			
			int[] nums = new int[6];
			
			for (int i = 0; i < 6; i++)
				nums[i] = Integer.parseInt(st.nextToken());
			
			ArrayList<String> symbols = new ArrayList<String>();
			
		}
		
		in.close();
		
	}

}
