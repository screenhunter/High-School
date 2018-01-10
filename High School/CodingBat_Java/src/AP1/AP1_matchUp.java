package AP1;

public class AP1_matchUp {

	public static int matchUp(String[] a, String[] b) {
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i].length() > 0 && b[i].length() > 0) {
				
				if (a[i].charAt(0) == b[i].charAt(0)) {
					
					count++;
					
				}
				
			}
			
		}
		
		return count;
		  
	}
	
	public static void main(String[] args) {

		String[] a = {"a", "bb", "ccc"};
		String[] b = {"aaa", "bbb", "c"};
		
		System.out.println(matchUp(a, b));

	}

}
