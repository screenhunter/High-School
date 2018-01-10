import java.io.*;
import java.util.*;

public class A2 {
	
	public static int H, W, L, S;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] line = in.readLine().split(" ");
		W = Integer.parseInt(line[0]);
		H = Integer.parseInt(line[1]);

		L = W*(H-1) + (W-1)*H;
		S = W*H-1;

		System.out.println(L-S);

	}

}