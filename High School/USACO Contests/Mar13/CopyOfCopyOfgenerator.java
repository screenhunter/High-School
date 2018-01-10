import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyOfCopyOfgenerator {

	public static void main(String[] args) throws IOException {

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"assign.in")));

		out.println("15 50");

		for (int i = 0; i < 50; i++)
			out.println("S " + (int) (Math.random() * 15 + 1) + " "
					+ (int) (Math.random() * 15 + 1));

		out.close();

	}

}
