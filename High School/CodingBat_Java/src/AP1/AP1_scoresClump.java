package AP1;

import java.io.IOException;

public class AP1_scoresClump {

	public static boolean scoresClump(int[] scores) {

		for (int i = 0; i < scores.length - 2; i++) {

			int tempA = scores[i];
			int tempB = scores[i + 1];
			int tempC = scores[i + 2];

			if (Math.abs(tempA - tempB) <= 2
					&& (Math.abs(tempB - tempC) <= 2 && Math.abs(tempA - tempC) <= 2)) {

				return true;

			}

		}

		return false;

	}

	public static void main(String[] args) throws IOException {

		int[] scores = { 2, 3, 5 };

		System.out.println(scoresClump(scores));

	}

}
