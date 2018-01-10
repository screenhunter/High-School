package Contest2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rajat_Khanna_Contest_2_Bits {
	public static void main(String[] args) throws IOException {
		String one1 = "";
		String one2 = "";
		String one3 = "";

		for (int i = 0; i < 5; i++) {

			System.out.print("Please input the number:");
			BufferedReader prt1 = new BufferedReader(new InputStreamReader(
					System.in));

			String part1 = prt1.readLine();

			boolean check = part1.contains("*");

			if (check == true) {

				if (counter(part1, '*') == 1) {

					if (part1.startsWith("*") == true) {

						StringTokenizer one = new StringTokenizer(part1, "*");

						one1 = one.nextToken();

						System.out.println("0" + one1 + ", 1" + one1);

					} else {

						if (part1.endsWith("*") == true) {

							StringTokenizer one = new StringTokenizer(part1,
									"*");

							one1 = one.nextToken();

							System.out.println("The Number(s) Are:");
							System.out.println(one1 + "0 , " + one1 + "1");

						} else {

							StringTokenizer one = new StringTokenizer(part1, "*");

							one1 = one.nextToken();
							one2 = one.nextToken();

							System.out.println("The Number(s) Are:");
							System.out.println(one1 + "0" + one2 +", " + one1 + "1" + one2);

						}

					}

				}

				if (counter(part1, '*') == 2) {

					if (part1.startsWith("*")) {

						if (part1.endsWith("*")) {
							
							StringTokenizer one = new StringTokenizer(part1,"*");
							one1 = one.nextToken();
							
							System.out.println("The Number(s) Are:");
							System.out.println("0" + one1 + "0");
							System.out.println("0" + one1 + "1");
							System.out.println("1" + one1 + "0");
							System.out.println("1" + one1 + "1");

						} else {
							
							StringTokenizer one = new StringTokenizer(part1,"*");
							one1 = one.nextToken();
							
							if (one.hasMoreTokens()) {
								
								one2 = one.nextToken();
								
								System.out.println("The Number(s) Are:");
								System.out.println("0" + one1 + "0" + one2);
								System.out.println("0" + one1 + "1" + one2);
								System.out.println("1" + one1 + "0" + one2);
								System.out.println("1" + one1 + "1" + one2);
								
							} else {
								
								System.out.println("The Number(s) Are:");
								System.out.println("00" + one1);
								System.out.println("01" + one1);
								System.out.println("10" + one1);
								System.out.println("11" + one1);
								
							}
							
						}

					} else {
						
						if (part1.endsWith("*")) {
							
							StringTokenizer one = new StringTokenizer(part1,"*");
							one1 = one.nextToken();
							
							if (one.hasMoreTokens()) {
								
								one2 = one.nextToken();
								
								System.out.println("The Number(s) Are:");
								System.out.println(one1 + "0" + one2 + "0");
								System.out.println(one1 + "0" + one2 + "1");
								System.out.println(one1 + "1" + one2 + "0");
								System.out.println(one1 + "1" + one2 + "1");
								
							} else {
								
								System.out.println("The Number(s) Are:");
								System.out.println(one1 + "00");
								System.out.println(one1 + "01");
								System.out.println(one1 + "10");
								System.out.println(one1 + "11");
								
							}
							
						} else {
							
							StringTokenizer one = new StringTokenizer(part1,"*");
							one1 = one.nextToken();
							one2 = one.nextToken();
							
							if (one.hasMoreTokens()) {
								
								one3 = one.nextToken();
								
								System.out.println("The Number(s) Are:");
								System.out.println(one1 + "0" + one2 + "0" + one3);
								System.out.println(one1 + "0" + one2 + "1" + one3);
								System.out.println(one1 + "1" + one2 + "0" + one3);
								System.out.println(one1 + "1" + one2 + "1" + one3);
								
							} else {
								
								System.out.println("The Number(s) Are:");
								System.out.println(one1 + "00" + one2);
								System.out.println(one1 + "01" + one2);
								System.out.println(one1 + "10" + one2);
								System.out.println(one1 + "11" + one2);
								
							}
							
						}
						
					}

				}

			} else {

				System.out.println("The Number(s) Are:");
				System.out.println(part1);

			}

		}

		System.out.println("Thank You");
		System.out.println("Program Created by Rajat Khanna");

	}

	private static int counter(String a, char b) {

		int c = 0;

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == b) {

				c = c + 1;

			}

		}

		return c;

	}
}