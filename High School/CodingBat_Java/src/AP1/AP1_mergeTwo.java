package AP1;

import java.util.ArrayList;

public class AP1_mergeTwo {

	public static String[] mergeTwo(String[] a, String[] b, int n) {
	  
		ArrayList<String> list = new ArrayList<String>();
		String[] array = new String[n];
	 
		for (int i=0; i< a.length; i++) {
	    
			list.add(a[i]); 
		
		}
	  
		for(int i=0; i < b.length; i++) {
	   
			list.add(b[i]); 
			
		}
	  
	 
		for (int i = 0; i < list.size(); i++) {
	      
			for (int j = 0; j < list.size(); j++) {
	          
				if (list.get(j).compareTo(list.get(i))>0) {
	                
					String temp = list.get(i);
	                list.set(i,list.get(j));
	                list.set(j,temp);
	            
				}
	        
			}
	   
		}
	     
	   for (int i = 0; i < list.size()-1;i++) {
	     
		   if (list.get(i+1).equals(list.get(i))) {
	      
			   list.remove(i);
			   
		   }
	   
	   }
	   for (int i = 0; i < array.length;i++) {
	     
		   array[i]=list.get(i);
	   
	   }
	      
	  return array; 
	   
	}


	public static void main(String[] args) {
		
		String[] a = {"a", "c", "z"};
		String[] b = {"b", "f", "z"};
		int n = 3;
		
		System.out.println(mergeTwo(a, b, n));

	}

}
