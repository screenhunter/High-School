package Random;

import java.util.ArrayList;

public class Brilliant {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int a = 1; a < 10; a++)
			for (int b = 0; b < 10; b++)
				if ((100*a+b) % (10*a+b) == 0)
					sum += 10*a+b;
		
		System.out.println(sum);
		
		int a = 2008;
		int b = 2010;
		int c = 2012;
		
		System.out.println(Math.pow(a, 2)+Math.pow(b, 2)+ Math.pow(c, 2) -a*b - b*c - c*a);
		
		int length = String.valueOf(Math.pow(101, 101)).length();
		
		System.out.println(length);
		
		int count = 0;
		
		for (int i = 1; i <= 1000; i++)
			for (int j = 1; j <= 1000; j++)
				if (2 + (i-1)*7 == 3 + (j-1)*9)
					count++;
		
		System.out.println(count);
		
		
		ArrayList<Integer> squares = new ArrayList<Integer>();
		
		for (int i = 1; i < Math.sqrt(1000); i++)
			squares.add((int)Math.pow(i, 2));
		
		Object[] cubes = squares.toArray();
		
		int count1 = 0;
		
		for (int a1 = 0; a1 < cubes.length - 2; a1++)
			for (int b1 = a1+1; b1 < cubes.length - 1; b1++)
				for (int c1 = b1+1; c1 < cubes.length; c1++)
					if ((int)cubes[b1]-(int)cubes[a1] == (int)cubes[c1]-(int)cubes[b1])
						count1++;
		
		System.out.println(count1);
			

	}

}
