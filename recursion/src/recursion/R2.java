package recursion;

public class R2 {


		
		 static int n1=0,n2=1,n3=0;    
		 static void fibonacci(int count){    
		    if(count>0){    
		         n3 = n1 + n2;    
		         n1 = n2;    
		         n2 = n3;    
		         System.out.print(" "+n3);   
		         fibonacci(count-1);
		    }
		     } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fibonacci(6);
	}

}
