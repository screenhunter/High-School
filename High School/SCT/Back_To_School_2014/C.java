import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class C {

	public static int N;
	public static double[][] eff;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(in.readLine());
		eff = new double[N][N];
		String[] line;
		for (int i = 0; i < N; i++) {

			line = in.readLine().split(" ");
			for (int j = 0; j < N; j++)
				eff[i][j] = Double.parseDouble(line[j]);

		}

		
		
		in.close();
		out.close();
		System.exit(0);

	}

}
