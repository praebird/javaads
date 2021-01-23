package stack;
import java.util.Scanner;
public class stackApp {

	public static void main(String[] args) {
		
	try(Scanner sc =new Scanner(System.in)){
		// TODO Auto-generated method stub
		System.out.print("Enter Size of The Stack : ");
		 int size=sc.nextInt();
		 MyStack stack=new MyStack(size);
		
				 stack.push(6);
				 stack.push(8);
				 stack.push(34);
				 stack.push(42);
				 stack.push(91);
				 stack.push(97);
				
				 stack.display();
				 
				 
				 System.out.println("Reversed Stack:::");
				 int[] a;         
				 a = stack.reverse(); 
				 
				 for (int i = 0; i < a.length; i++) 
					 System.out.println( a[i]+ " ");     
				 //stack.display();


				 System.out.println();
				 stack.pop();
				 stack.pop();
				 stack.pop();			
				 stack.pop();
	
				 stack.display();
	}catch(Exception e) {
		e.getMessage();
		}
	}
}
