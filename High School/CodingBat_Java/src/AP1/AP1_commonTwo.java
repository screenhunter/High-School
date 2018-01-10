package AP1;

public class AP1_commonTwo {
	
	public static int commonTwo(String[] a, String[] b) {
		
		int count=0;
		int big = a.length + b.length;
		int temp=0;
		
		String[] common= new String[big+1];
		String last="";
		
		for (int i = 0; i < a.length; i++) {
		
			if (a[i] != last) {
		
				common[i] = a[i];
		
				last = a[i];
		
			}
		
		}
		
		int c = 0;
		last = "";
		
		for (int x = a.length; x < big; x++) {
			
			if (b[c] != last) {
		
				common[x] = b[c];
				last = b[c];
		
			}
		
			c++;
		
		}
		 
		for (int r = 0; r < big; r++) {
		
			temp=0;
		
			for (int z = 0; z < big; z++) {
				
				if (common[r] != null && common[z] != null) {
		
					if (common[r].equals(common[z])) {
		
						temp++;
						
					}
		
				}
				
			}
		
			if (temp > 1){
		
				count++;
			}
			
		}
		  
		return count/2;
		
	}

	
	public static void main(String[] args) {
		
		String[] a = {"b", "b", "z"};
		String[] b = {"b", "f", "z"};
		
		System.out.println(commonTwo(a, b));

	}

}
