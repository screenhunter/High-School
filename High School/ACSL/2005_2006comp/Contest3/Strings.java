package Contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strings {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int counter = 0; counter < 5; counter++) {
			
			String[] contents = in.readLine().split("/");
			
			String line = contents[contents.length - 1];
			
			for (int i = 0; i < contents.length - 1; i++)
				line = calculator(line, Integer.parseInt(contents[i].substring(3, 4)) ,contents[i]);
			
			System.out.println(line);
			
		}
		
	}
	
	private static String calculator(String line, int x, String func) {
		
		String temp = "";
		
		for (int i = 0; i < x; i++)
			temp += "#";
		
		if (func.equals("LS"))
			return line.substring(x) + temp;
		else if (func.equals("RS"))
			return temp + line.substring(0, line.length() - x);
		else if (func.equals("LC"))
			return line.substring(x) + line.substring(0, x);
		else if (func.equals("RC"))
			return line.substring(line.length() - x) + line.substring(0, line.length() - x);
		
		return mc(line, func);
		
	}

	private static String mc(String line, String func) {
		
		String nums = func.substring(3);
		
		String switched = line.substring(Integer.parseInt(nums.charAt(0) + "") - 1, Integer.parseInt(nums.charAt(0) + "") + Integer.parseInt(nums.charAt(1) + "") - 1);
		
		String[] split = line.split(switched);
		
		int x = Integer.parseInt(nums.charAt(2) + "");
		
		if (nums.contains("L"))
			return split[0] + calculator(switched, x, "LC") + split[1];
		else
			return split[0] + calculator(switched, x, "RC") + split[1];
		
	}

}
