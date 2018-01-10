package Contest1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class finalfirstproject_old {
	public static void main(String[] args) {
		System.out.print("Input the first set of data seperated by only a comma: ");
		BufferedReader prt1 = new BufferedReader(new InputStreamReader(System.in));
		String name1 ="";
		name1 = readLineString(prt1, name1);
		String[] a = numbercatcher(name1);
	    Double b = convert(a[0]);
	    Double c = convert(a[1]);
	    Double SAL1 = annualsalary(b,c);
	    
	    System.out.print("Input the second set of data seperated by only a comma: ");
		BufferedReader prt2 = new BufferedReader(new InputStreamReader(System.in));
		String name2 ="";
		name2 = readLineString(prt2, name2);
		String[] d = numbercatcher(name2);
	    Double e = convert(d[0]);
	    Double f = convert(d[1]);
	    Double SAL2 = annualsalary(e,f);
	    
	    System.out.print("Input the third set of data seperated by only a comma: ");
		BufferedReader prt3 = new BufferedReader(new InputStreamReader(System.in));
		String name3 ="";
		name3 = readLineString(prt3, name3);
		String[] g = numbercatcher(name3);
	    Double h = convert(g[0]);
	    Double i = convert(g[1]);
	    Double SAL3 = annualsalary(h,i);
	    
	    System.out.print("Input the fourth set of data seperated by only a comma: ");
		BufferedReader prt4 = new BufferedReader(new InputStreamReader(System.in));
		String name4 ="";
		name4 = readLineString(prt4, name4);
		String[] j = numbercatcher(name4);
	    Double k = convert(j[0]);
	    Double l = convert(j[1]);
	    Double SAL4 = annualsalary(k,l);
	    
	    System.out.print("Input the fifth set of data seperated by only a comma: ");
		BufferedReader prt5 = new BufferedReader(new InputStreamReader(System.in));
		String name5 ="";
		name5 = readLineString(prt5, name5);
		String[] m = numbercatcher(name5);
	    Double n = convert(m[0]);
	    Double o = convert(m[1]);
	    Double SAL5 = annualsalary(n,o);
		
	    int p = (salarycounter(SAL1, SAL2, SAL3, SAL4, SAL5));
	    System.out.println("#1 The number of salaries that are over 10 million is " +p);
	    
	    Double q = (salaryaverage(SAL1, SAL2, SAL3, SAL4, SAL5));
	    System.out.println("#2 The average annual salary is " + ((long)q.longValue()));
	    
	    Double r = (numberthree(sixteen(SAL1), sixteen(SAL2), sixteen(SAL3), sixteen(SAL4), sixteen(SAL5)));
	    System.out.println("#3 The lowest average salary per game in a 16-game season is : " + Math.round(r));
	    
	    Double s = (numberfour(eighteen(SAL1), eighteen(SAL2), eighteen(SAL3), eighteen(SAL4), eighteen(SAL5)));
	    System.out.println("#4 The highest average salary per game in a 18-game season is : " + Math.round(s));
	    
	    Double t = (sixteen(salaryaverage(SAL1, SAL2, SAL3, SAL4, SAL5)));
	    Double u = (eighteen(salaryaverage(SAL1, SAL2, SAL3, SAL4, SAL5)));
	    Double v = (t-u);
	    System.out.println("#5 The difference between the average 16-game and 18-game salary is " + ((long)v.longValue()));
	}
	
	
	private static Double annualsalary(Double a, Double b) {
		Double l= 0.0;
		
		try {
			l = (b*1000000)/a;
		} catch (Exception e){
			
		}
		
		return l;
	}
	
	private static int salarycounter(Double a, Double b, Double c, Double d, Double e) {
		int n = 0;
		try {
			if (salarychecker(a)){
				n = n + 1;
			}
			if (salarychecker(b)){
				n = n + 1;
			}
			if (salarychecker(c)){
				n = n + 1;
			}
			if (salarychecker(d)){
				n = n + 1;
			}
			if (salarychecker(e)){
				n = n + 1;
			}
		} catch (Exception z){
			
		}
		
		return n;
	}
	
	private static boolean salarychecker(Double a) {
		
		if(a>10000000){
			return true;
		}else{
			return false;
		}
			
	}
	
	private static Double salaryaverage(Double a, Double b, Double c, Double d, Double e) {
		Double l= 0.0;
		
		try {
			l = (a+b+c+d+e)/5;
		} catch (Exception z){
			
		}
		
		return l;
	}
	
	private static Double sixteen(Double a) {
		Double l= 0.0;
		
		try {
			l = a/16;
		} catch (Exception e){
			
		}
		return l;
	}
	
	private static Double eighteen(Double a) {
		Double l= 0.0;
		
		try {
			l = a/18;
		} catch (Exception e){
			
		}
		
		return l;
	}
	
	private static Double numberthree (Double a, Double b, Double c, Double d, Double e) {
		Double l = 0.0;
		//Math.min(a, b);
		if(a<b){
			if (a<c){
				if (a<d) {
					if (a<e) {
						l= a;
					}
					else {
						l=e;}
				}
				else { 
					if (d<e) {
						l=d;
					}
					else {
						l=e;
					}
				}
				}
			else {
				if (c<d) {
					if (c<e) {
						l=c;
					}
					else {
						l=e;
					}
				}
				else {
					if (d<e) {
						l=d;
					}
					else {
						l=e;
					}	
				}
			}
		}
		else {
			if (b<c) {
				if (b<d) {
					if (b<e) {
						l=b;
					}
					else {
						l=e;
					}
				}
				else {
					if (d<e) {
						l=d;
					}
					else {
						l=e;
					}
				}
			}
			else {
				if (c<d) {
					if (c<e) {
						l=c;
					}
					else {
						l=e;
					}
				}
				else {
					if (d<e) {
						l=d;
					}
					else {
						l=e;
					}	
				}
			}
		}
		return l;
	}
	
	private static Double numberfour (Double a, Double b, Double c, Double d, Double e) {
		Double l = 0.0;
		//Math.min(a, b);
		if(a>b){
			if (a>c){
				if (a>d) {
					if (a>e) {
						l= a;
					}
					else {
						l=e;}
				}
				else { 
					if (d>e) {
						l=d;
					}
					else {
						l=e;
					}
				}
				}
			else {
				if (c>d) {
					if (c>e) {
						l=c;
					}
					else {
						l=e;
					}
				}
				else {
					if (d>e) {
						l=d;
					}
					else {
						l=e;
					}	
				}
			}
		}
		else {
			if (b>c) {
				if (b>d) {
					if (b>e) {
						l=b;
					}
					else {
						l=e;
					}
				}
				else {
					if (d>e) {
						l=d;
					}
					else {
						l=e;
					}
				}
			}
			else {
				if (c>d) {
					if (c>e) {
						l=c;
					}
					else {
						l=e;
					}
				}
				else {
					if (d>e) {
						l=d;
					}
					else {
						l=e;
					}	
				}
			}
		}
		return l;
	}

	private static String readLineString(BufferedReader br, String name) {
		String l= null;
		try {
		     name = br.readLine();
		     l = name;
		   } catch (IOException z) {
		     System.out.println("Error!");
		     System.exit(1);
		   }
		return l;
	}
	
	private static String[] numbercatcher (String name) {
		String[] values=null;
		try {
			
			
			values=name.split(",");
		} catch (Exception z) {
		     System.out.println("Error!");
		     System.exit(1);
		}
		return values;
	}
		
	private static Double convert(String blah) {
			Double l= 0.0;
			try {
			     l = Double.parseDouble(blah);
			   }catch (Exception z) {
				     System.out.println("Error!");
				     System.exit(1);
				}
			return l;
	}
}		