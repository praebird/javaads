package collectionUtils;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.HashMap;

import com.app.core.BuddyClass;

public class BuddyData {
	
	public static ArrayList<BuddyClass> populateData() {
	
		//BuddyData Containing All Information
		ArrayList<BuddyClass> budLst=new ArrayList<BuddyClass>();
	
		BuddyClass  B1=new BuddyClass("prateik@gmail.com", "Prateik","9011990220",parse("1998-12-06"), "Pune");
		BuddyClass  B2=new BuddyClass("pre712@gmail.com", "Prerak", "9451260240", parse("1995-05-05"), "Satara");
		BuddyClass  B3=new BuddyClass("19Vishu@gmail.com", "Vishnu", "7059801210", parse("1999-02-06"), "Satara");
		BuddyClass  B4=new BuddyClass("deep1001@yahoo.com", "Deepesh", "7620341909", parse("1999-11-19"), "Kolhapur");
		BuddyClass  B5=new BuddyClass("remi1001@yahoo.com", "Ramesh", "7058735377", parse("1996-12-23"), "Pune");
	
		budLst.add(B1);
		budLst.add(B2);
		budLst.add(B3);
		budLst.add(B4);
		budLst.add(B5);
		return budLst;
	}
	
	public static HashMap<String,BuddyClass> populateMapData(ArrayList<BuddyClass> budLst){
		HashMap<String,BuddyClass> map=new HashMap<>(); 
		for(BuddyClass b: budLst)
		map.put(b.getEmailID(), b);
		return map;
		
	}
}