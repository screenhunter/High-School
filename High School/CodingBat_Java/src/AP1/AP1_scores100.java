package AP1;

import java.io.IOException;

public class AP1_scores100 {

	public static boolean scores100(int[] scores) {

		for (int i = 0; i < scores.length - 1; i++) {

			if (scores[i] == 100 && scores[i + 1] == 100) {

				return true;

			}

		}

		return false;

	}

	public static void main(String[] args) throws IOException {

		int[] scores = { 100, 100, 4 };
		System.out.println(scores100(scores));

	}

}
