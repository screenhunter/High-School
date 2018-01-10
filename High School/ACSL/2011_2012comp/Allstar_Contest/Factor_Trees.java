package Allstar_Contest;

import java.util.*;
import java.io.*;

public class Factor_Trees {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int uselesscount = 0; uselesscount < 10; uselesscount++) {
			
			int x = Integer.parseInt(in.readLine());
			System.out.println(x);
			ArrayList<Integer> temp = new ArrayList<Integer>();
			boolean b = factor(x, temp);
			if (!b)
				System.out.println(x);
			else
				combine(temp);
			
		}
		
	}
	
	private static boolean factor(int x, ArrayList<Integer> list) {
		int num = -1;
		
		for (int i = 2; i <= Math.sqrt(x); i++)
			if (x % i == 0) {
				
				num = i;
				break;
				
			}
		
		if (num < 0) {
			
			list.add(x);
			return false;
			
		} else {
			
			list.add(x/num);
			list.add(num);
			print(list);
			list.remove(list.indexOf(x/num));
			factor(x/num, list);
			return true;
			
		}
	}
	
	private static void print(ArrayList<Integer> list) {
		
		Collections.sort(list);
		
		String s = "";
		
		for (int i = list.size(); i > 0; i--) {
			
			if (i < list.size())
				s += " x ";
			
			s += list.get(i - 1);
			
		}
		
		System.out.println(s);
		
	}
	
	private static void combine(ArrayList<Integer> list) {
		
		Collections.sort(list);
		
		ArrayList<Integer> copy = new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i++)
			copy.add(list.get(i));
		
		ArrayList<Integer> counts = new ArrayList<Integer>();
		
		int prev = 0;
		
		for (int i = list.size(); i > 0; i--) {
			
			if (list.get(i - 1) == prev) {
				
				copy.remove(copy.indexOf(list.get(i - 1)));
				int x = counts.get(counts.size() - 1);
				counts.remove(counts.size() - 1);
				counts.add(x + 1);
				
			} else {
				
				prev = list.get(i - 1);
				counts.add(1);
				
			}
			
		}
		
		String s = "";
		
		for (int i = copy.size() - 1; i >= 0; i--) {
			
			if (i != copy.size() - 1)
				s += " x ";
			
			if (counts.get(copy.size() - 1 - i) == 1)
				s += copy.get(i);
			else
				s += copy.get(i) + " ^ " + counts.get(copy.size() - 1 - i);
			
		}
		
		System.out.println(s);
		
	}
	
}
