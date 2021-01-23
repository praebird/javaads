package com.app.sll;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SListUsingArray sl = new SListUsingArray(10);
		
		System.out.println("Print List Empty List");
		sl.print();
		
		sl.insert(5);
		sl.insert(10);
		sl.insert(1);
		sl.insert(2);
		
		sl.insert(15);
		sl.insert(20);
		sl.insert(31);
		sl.insert(62);
		
		System.out.println("Print List ");
		sl.print();
		
		
	}

}
