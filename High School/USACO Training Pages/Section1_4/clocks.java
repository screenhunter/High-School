/*
PROG: clocks
LANG: JAVA
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class clocks {

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("clocks.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"clocks.out")));

		int[] state = new int[9];

		for (int i = 0; i < 3; i++) {

			String[] line = in.readLine().split(" ");

			for (int j = 0; j < 3; j++)
				state[i * 3 + j] = Integer.parseInt(line[j])/3 % 4;

		}

		int[] move = new int[9];
		boolean flag = true;
		String list = "";
		String cur = "999999999999999999999999999";

		for (int i1 = 0; i1 < 4; i1++)
			for (int i2 = 0; i2 < 4; i2++)
				for (int i3 = 0; i3 < 4; i3++)
					for (int i4 = 0; i4 < 4; i4++)
						for (int i5 = 0; i5 < 4; i5++)
							for (int i6 = 0; i6 < 4; i6++)
								for (int i7 = 0; i7 < 4; i7++)
									for (int i8 = 0; i8 < 4; i8++)
										for (int i9 = 0; i9 < 4; i9++) {

											Arrays.fill(move, 0);
											flag = true;
											list = "";

											move[0] = (i1 + i2 + i4) % 4;
											move[1] = (i1 + i2 + i3 + i5) % 4;
											move[2] = (i2 + i3 + i6) % 4;
											move[3] = (i1 + i4 + i5 + i7) % 4;
											move[4] = (i1 + i3 + i5 + i7 + i9) % 4;
											move[5] = (i3 + i5 + i6 + i9) % 4;
											move[6] = (i4 + i7 + i8) % 4;
											move[7] = (i5 + i7 + i8 + i9) % 4;
											move[8] = (i6 + i8 + i9) % 4;

											for (int i = 0; i < 9; i++)
												if ((move[i] + state[i]) % 4 != 0)
													flag = false;

											if (flag) {

												for (int i = 0; i < i1; i++)
													list += 1 + " ";
												for (int i = 0; i < i2; i++)
													list += 2 + " ";
												for (int i = 0; i < i3; i++)
													list += 3 + " ";
												for (int i = 0; i < i4; i++)
													list += 4 + " ";
												for (int i = 0; i < i5; i++)
													list += 5 + " ";
												for (int i = 0; i < i6; i++)
													list += 6 + " ";
												for (int i = 0; i < i7; i++)
													list += 7 + " ";
												for (int i = 0; i < i8; i++)
													list += 8 + " ";
												for (int i = 0; i < i9; i++)
													list += 9 + " ";
												
												if (Double.parseDouble(list.replaceAll(" ", "")) < Double.parseDouble(cur.replaceAll(" ", "")))
													cur = list;
											}

										}
		
		out.println(cur.trim());

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}
}
