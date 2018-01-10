import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyOfgenerator {

	public static void main(String[] args) throws IOException {

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"cowrace.in")));

		out.println("1000 1000");

		for (int i = 0; i < 2000; i++)
			out.println((int) (Math.random() * 1000 + 1) + " "
					+ (int) (Math.random() * 1000 + 1));

		out.close();

	}

}
