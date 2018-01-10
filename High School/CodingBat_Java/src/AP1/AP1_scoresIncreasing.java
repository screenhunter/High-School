package AP1;

import java.io.IOException;

public class AP1_scoresIncreasing {

	public static boolean scoresIncreasing(int[] scores) {

		for (int i = 0; i < scores.length - 1; i++) {

			if (scores[i] > scores[i + 1]) {

				return false;

			}

		}

		return true;

	}

	public static void main(String[] args) throws IOException {

		int[] scores = { 4, 1, 4 };
		System.out.println(scoresIncreasing(scores));

	}

}
