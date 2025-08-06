package Algo;

public class MergeTwoSortedList {

	
	public static void main(String[] args) {
		ListNode list1 = new ListNode(0);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(4);
        list2.next.next.next = new ListNode(5);

		
		ListNode resultNode = new ListNode();
		ListNode headNode = resultNode;
		while(list1!=null && list2!=null) {
			if(list1.val<=list2.val) {
				resultNode.next =list1;
				list1 = list1.next;
			}
			else {
				resultNode.next=list2;
				list2 = list2.next;
				
			}
			resultNode=resultNode.next;
		}
		if(list1==null) {
			resultNode.next=list2;
		}
		else if(list2==null) {
			resultNode.next=list1;
		}
		//ListNode actualData =headNode.next;
		System.out.println(headNode.next.val);
	}

}
