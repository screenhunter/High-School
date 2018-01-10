package Contest2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_ACSL2 {
	public static void main(String[] args) throws IOException {
		int[] pos = new int[2];
		for (int i = 0; i < 5; i++) {

			System.out.print("Please input the number:");
			BufferedReader prt1 = new BufferedReader(new InputStreamReader(
					System.in));

			String input = prt1.readLine();
			pos[0] = input.indexOf("*");
			if (pos[0] > -1) {
				pos[1] = input.indexOf("*", pos[0]+1);
			} else {
				pos[1] = -1;
			}
			
			String[] list = new String[4];
			if (pos[0] > -1) {
				list[0] = new StringBuffer(input).replace(pos[0], pos[0]+1, "1").toString();
				list[1] = new StringBuffer(input).replace(pos[0], pos[0]+1, "0").toString();
				list[2] = new StringBuffer(input).replace(pos[0], pos[0]+1, "1").toString();
				list[3] = new StringBuffer(input).replace(pos[0], pos[0]+1, "0").toString();
			}
			if (pos[1] > -1) {
				list[0] = new StringBuffer(list[0]).replace(pos[1], pos[1]+1, "0").toString();
				list[1] = new StringBuffer(list[1]).replace(pos[1], pos[1]+1, "0").toString();
				list[2] = new StringBuffer(list[2]).replace(pos[1], pos[1]+1, "1").toString();
				list[3] = new StringBuffer(list[3]).replace(pos[1], pos[1]+1, "1").toString();
			}
			
			if ((pos[0] > -1) && (pos[1] == -1)) {
				System.out.println(list[0] + "," + list[1]);
			}
			else if (pos[1] > -1) {
				System.out.println(list[0] + "," + list[1] + "," + list[2] + "," + list[3]);
			}
			else if ((pos[0] == -1) && (pos[1] == -1)) {
				System.out.println(input);
			}
		}
	}
}