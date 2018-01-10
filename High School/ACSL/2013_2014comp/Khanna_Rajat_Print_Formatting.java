/*
 * 
 * Rajat Khanna 10th Grade
 * Thomas Jefferson High School for Science and Technology
 * Senior Division
 * Contest #2 2013-2014
 * ACSL Print Formatting
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Khanna_Rajat_Print_Formatting {

	public static String value, format;
	public static BufferedReader in;

	public static void main(String[] args) throws Exception {

		in = new BufferedReader(new FileReader("acsl.in"));

		for (int counter = 1; counter < 6; counter++) {

			String[] line = in.readLine().split(" ");
			format = line[0];
			value = line[1];

			if (format.contains("*"))
				System.out.println(money2());
			else if (format.contains("$"))
				System.out.println(money());
			else if (format.contains("E"))
				System.out.println(exp());
			else if (format.contains("."))
				System.out.println(decimal());
			else if (format.contains(","))
				System.out.println(comma());
			else
				System.out.println(normal());

		}

		in.close();
		System.exit(0);

	}

	private static String normal() {

		while (value.length() > format.length())
			value = value.substring(1);

		while (value.length() < format.length())
			value = "*" + value;

		return value;

	}

	private static String comma() {

		format = format.replaceAll(",", "");

		while (value.length() > format.length())
			value = value.substring(1);

		while (value.length() < format.length())
			value = "*" + value;

		for (int i = value.length() - 3; i > 0; i -= 3)
			value = value.substring(0, i) + "," + value.substring(i);

		return value;

	}

	private static String decimal() {

		DecimalFormat df = new DecimalFormat(format.replaceAll("&", "0"));
		df.setRoundingMode(RoundingMode.HALF_UP);

		value = df.format(Double.parseDouble(value));
		
		while (value.length() > format.length())
			value = value.substring(1);
		
		int count = 0;
		while (value.charAt(0) == '0') {
			
			count++;
			value = value.substring(1);
			
		}
		
		for (int i = 0; i < count; i++)
			value = "*" + value;

		return value;

	}

	private static String money() {

		return "$" + value;

	}

	private static String money2() {

		int count = 0;
		for (int i = 0; i < format.length(); i++)
			if (format.charAt(i) == '&')
				count++;

		for (int i = 0; i < value.length(); i++)
			if (value.charAt(i) != '.')
				count--;

		while (count < 0) {

			value = value.substring(1);
			count++;

		}

		value = "$" + value;

		while (count > 0) {

			value = "*" + value;
			count--;

		}

		return value;

	}

	private static String exp() {

		format = format.replaceAll("E", "").replaceAll("&", "0");
		format = format.substring(0, 1) + "." + format.substring(1);

		DecimalFormat df = new DecimalFormat(format);
		df.setRoundingMode(RoundingMode.HALF_UP);

		double val = Double.parseDouble(value);
		int pow = (int) Math.floor(Math.log10(val));
		val /= Math.pow(10, pow);

		if (df.format(val).length() == 2)
			return df.format(val).charAt(0) + "E" + pow;
		else
			return df.format(val) + "E" + pow;

	}

}
