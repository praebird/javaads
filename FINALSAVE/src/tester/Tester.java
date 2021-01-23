package tester;

import static collectionUtils.BuddyData.populateData;
import static collectionUtils.BuddyData.populateMapData;

import java.time.LocalDate;
import static java.time.LocalDate.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import java.util.Scanner;


import static utils.ValidationFunc.*;
import com.app.core.BuddyClass;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
		System.out.println("******** Welcome to My Buddies *****");
		HashMap<String,BuddyClass> bmap=new HashMap<>();
		bmap=populateMapData(populateData());
		
		boolean j=true;
		while(j) {
			System.out.println(

					"1.Add New Buddy"+
					"\n2.Search Buddy by Email Id"+
					"\n3.Delete Buddy by Email Id"+
					"\n4.Display all my buddies"+
					"\n5.Sort all buddies of given date of birth"+
					"\n6.Exit"

				);
			try{
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter Email");
						
                 String emailId=(sc.next());
                 if (validateEmail(emailId)) {
						if (validateDuplicateEmail(emailId, bmap)) {
                 
							System.out.println("Enter Name"); 
							String Name=sc.next();
                 
							System.out.println("Enter PhoneNo");
							String phone=sc.next();
							if(validateMobileNo(phone))
							{
							System.out.println("Enter DOB");
							LocalDate date=parse(sc.next());
							
							System.out.println("Enter City:");
							String City=sc.next();
							 BuddyClass B6=new BuddyClass(emailId,Name,phone,date,City);
			                 bmap.put(emailId, B6);
			                 System.out.println("Buddy Added SuccesFully");
							}
						}
                 }
                 else {
                	
                	 System.out.println("Cannot Add Buddy....!!!!");
                 }
                 
                 
                
                 
                 
				break;
			case 2:
				System.out.println("Enter Email of Buddy to search:");
				String email1=sc.next();
				System.out.println(bmap.get(email1));

				break;
			case 3:
				 System.out.println("Enter Email of Buddy to Delete:");
			        String email2=sc.next();
			        bmap.remove(email2);
				break;
				
			case 4:
              System.out.println("View Details of all buddies");
              for(BuddyClass b : bmap.values())
            	  System.out.println(b);
				break;
				
			case 5:
				
				List<BuddyClass> bld = new ArrayList<>(bmap.values());
				
				Collections.sort(bld,new Comparator<BuddyClass>(){
					
					public int compare(BuddyClass b1,BuddyClass b2) {
						int res = b2.getDoB().compareTo(b1.getDoB());
						return res;
					}
					
				}
			);
				
				
				System.out.println("Sorted BuddyList according to DOB");
				for(BuddyClass i:bld) {
					
					System.out.println(i.toString());
				}
			
				break;
				
			case 6:
               j=false;
				break;
			
			default:
				System.out.println("Wrong Choice ,,, Please Choose above options Only.....");
				break;

			}
		}
	
		catch(Exception e) {
			e.getMessage();
		}
		sc.nextLine();
	}
		}
	}

}
