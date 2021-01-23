package recursion;

public class R1 { 
	
	static int multiply(int x, int y) { 
		
		if (x == 0) 
			return 0; 
	
		if (x > 0) 
			return (y + multiply(x-1, y)); 
	
		if (x < 0) 
			return -multiply(-x, y); 
			
		return -1; 
	} 
	
	public static void main(String[] args) { 
		
		System.out.print("\n" + multiply(6, 21)); 
		System.out.print("\n" + multiply(16, 12));
		System.out.print("\n" + multiply(10, 23));
		System.out.print("\n" + multiply(19,11));
		System.out.print("\n" + multiply(25, 20));
		System.out.print("\n" + multiply(31, 16));
	} 
} 

