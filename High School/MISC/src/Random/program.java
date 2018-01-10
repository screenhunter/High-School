package Random;

public class program {
	
	public static void main(String[] args) {
		
		
		for (double i = -25; i < 50; i++) {
			
			if (Math.floor((-i + Math.sqrt(i*i - 24*i))/2) == (-i + Math.sqrt(i*i - 24*i))/2)
				System.out.println((-i + Math.sqrt(i*i - 24*i))/2);
			if (Math.floor((-i - Math.sqrt(i*i - 24*i))/2) == (-i - Math.sqrt(i*i - 24*i))/2)
				System.out.println((-i - Math.sqrt(i*i - 24*i))/2);
			
		}
		
	}

}
