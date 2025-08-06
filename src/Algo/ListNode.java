package Algo;

public class ListNode {
	int val;
	ListNode next;
	ListNode() {
	
	}
	ListNode(int [] list) {
		for(int num : list) {
			this.val = num;
		}
		
	}
	ListNode(int val) { 
		this.val = val;
		
	}
	ListNode(int val, ListNode next) { 
		this.val = val; 
		this.next = next;
		
	}
	public ListNode(int i, int j, int k, int l) {
		this.val = i;
		this.val = j;
		this.val = k;
		this.val = l;
	}
	}