package utils;

import java.util.HashMap;

import com.app.core.BuddyClass;

import customExcep.CustomExc;

public class ValidationFunc {

		
		public static String loginType;
		

		public static boolean validateEmail(String email) throws CustomExc {
			if (!(email.contains("@") && email.endsWith(".com"))) {
				System.out.println("Email Is Invalid");
				return false;
			}
			return true;
		}
		

		public static boolean validateDuplicateEmail(String email, HashMap<String,BuddyClass> newBuddy)
				throws CustomExc {
			for (BuddyClass c : newBuddy.values())
				if (c != null && email.equals(c.getEmailID())) {
					System.out.println("EmailID Already present Try Another Email");
					return false;
				}
			return true;
		}
		
		public static boolean validateMobileNo(String mobile) {
			if (!(mobile.length() < 10 && mobile.length() > 10)) {
				String regex = "(0/6/7/8/9)?[7-9][0-9]{9}";
				if (!mobile.matches(regex)) {
					System.out.println("Invalid Mobile No");
					return false;
				}
			}
			return true;
		}

}
