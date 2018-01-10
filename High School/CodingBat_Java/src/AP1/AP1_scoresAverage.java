package AP1;

import java.io.IOException;

public class AP1_scoresAverage {

	public static int scoresAverage(int[] scores) {

		int avg1 = average(scores, 0, scores.length / 2);
		int avg2 = average(scores, scores.length / 2, scores.length - 1);

		if (avg1 > avg2) {

			return avg1;

		} else {

			return avg2;

		}

	}

	static int average(int[] scores, int start, int end) {

		int total = 0;
		int divisor = 0;

		if (start == 1 && end == 1)

			end = scores.length;

		for (int x = start; x < end; x++) {

			total += scores[x];

		}

		if (scores.length <= 2) {

			divisor = 1;

		} else {

			divisor = end - start;

		}

		return (int) total / divisor;

	}

	public static void main(String[] args) throws IOException {

		int[] scores = { 5, 6 };

		System.out.println(scoresAverage(scores));

	}

}
