package queue;

import java.util.Scanner;

public class cQueueApp {
	public static void main(String[] args) {
		
			try(Scanner sc =new Scanner(System.in)){

			System.out.println("Enter Size of Queue");
		    int maxSize = sc.nextInt();
		    cirQue cqueue = new cirQue(maxSize);

		    System.out.println("Circular Queue is Empty "+cqueue.isEmpty());
		    
		    System.out.println("Adding Elemnts to Circular Queue");
		    cqueue.add(8);
		    cqueue.add(10);
		    cqueue.add(12);		    
		    cqueue.add(14);
		    cqueue.add(16);
            cqueue.add(19);
            
            cqueue.display();

            System.out.println("\n");
            System.out.println("Circular Queue is Full "+cqueue.isFull());
           
            cqueue.delete();
            cqueue.delete();
            cqueue.delete();
            cqueue.delete();


            cqueue.display();
            System.out.println("\n");
            System.out.println("Circular Queue is Full "+cqueue.isFull());
            System.out.println("Circular Queue is Empty "+cqueue.isEmpty());         
	
	}catch(Exception e) {
		
		e.getMessage();
	}
}
}