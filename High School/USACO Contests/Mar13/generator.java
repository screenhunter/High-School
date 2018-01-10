import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class generator {

	public static void main(String[] args) throws IOException {

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"proximity.in")));

		out.println("50000 49999");

		for (int i = 0; i < 50000; i++)
			out.println((int) (Math.random() * 50000 + 1));

		out.close();

	}

}
