package com.app.sll;

public class SListUsingArray {

	public class SLNode{
		int data;
		int nxt;
		boolean isUsed;
	}
	
	private int size;
	private SLNode[] nodes;
	private int head;
	
	
	public SListUsingArray(int n) {
		
		size=n;
		nodes = new SLNode [size];
		head =-1;
		for(int i=0;i<size;i++) {
			nodes[i] = new SLNode();
			nodes[i].isUsed = false;
		}
	}
	
	private int getFreeNode() {
		for(int i=0;i<size;i++) {
			if(!nodes[i].isUsed) {
				nodes[i].isUsed = true;
				return i;
			}
			
		}
		return -1;
	}
	
	public void insert(int elem) {
		int n = getFreeNode();
		
		nodes[n].data =elem;
		nodes[n].nxt =-1;
		
		if(head == -1) {
			
			head =n;
			return;
		}
		
		int prev =-1;
		int curr =head;
		
		while((curr != -1 ) && (nodes[curr].data < nodes[n].data)) {
			
			prev = curr;
			curr = nodes[curr].nxt;
		}
		
		if(prev == -1) {
			
			nodes[n].nxt = head;
			head =n;
			return;			
		}
		
		if(curr==-1) {
			nodes[prev].nxt = n;
			return;		
		}
		
		nodes[prev].nxt =n;
		nodes[n].nxt=curr;
	}
	
	public void print() {
		int curr = head;
		while(curr != -1) {
			
			System.out.println(nodes[curr].data);
			curr = nodes[curr].nxt;
		}
		
	}
	
	
	public void delete(int no) {
		
		
		
	}
	
	
	
}
