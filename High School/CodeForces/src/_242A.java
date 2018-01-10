import java.util.Scanner;

public class _242A {
	
	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		
		String[] nums = in.nextLine().split(" ");
		
		int x = Integer.parseInt(nums[0]);
		int y = Integer.parseInt(nums[1]);
		int a = Integer.parseInt(nums[2]);
		int b = Integer.parseInt(nums[3]);
		
		if (x <= b) {
			System.out.println(0);
			System.exit(0);
			
		}
		
		int vP = a;
		int pP = b;
		x = x-a;
		y = y-b;
		
			while (vP <= pP && x > 0) {
				
				vP++;
				x--;
				
			}
			
			int count = 0;
			
			for (int i = 0; i <= x; i++) {
				
				for (int j = 0; j <= y; j++) {
					
					if (vP + i > pP + j)
						count++;
					
				}
				
			}
			
			System.out.println(count);
			
			for (int i = 0; i <= x; i++) {
				
				for (int j = 0; j <= y; j++) {
					
					if (vP + i > pP + j)
						System.out.println((vP + i) + " " + (pP + j));
					
				}
				
			}
		
		in.close();
		System.exit(0);
		
	}

}
