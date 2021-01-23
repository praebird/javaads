package com.app.core;

import java.time.LocalDate;

/*
 *Your Buddyclass should capture Email Id, Name, Phone Number,
 * Date of Birth and City. Use Local Date for Date of birth
 */


public class BuddyClass {

	private String emailID;
	private String name;
	private String  phNo;
	private LocalDate doB;
	private String city;
	
	
	public BuddyClass(String emailID, String name, String phNo, LocalDate doB, String city) {
		super();
		this.emailID = emailID;
		this.name = name;
		this.phNo = phNo;
		this.doB = doB;
		this.city = city;
	}


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}


	public String getPhNo() {
		return phNo;
	}


	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}


	public LocalDate getDoB() {
		return doB;
	}


	public void setDoB(LocalDate doB) {
		this.doB = doB;
	}


	@Override
	public String toString() {
		return "Buddy Details [emailID=" + emailID + ", name=" + name + ", phNo=" + phNo + ", doB=" + doB + ", city="
				+ city + "]";
	}
}
