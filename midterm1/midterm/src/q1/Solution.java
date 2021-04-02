package q1;

//Time complexity: O(n);
//Space complexity: O(1);

public class Solution {

	public static void main(String[] args) {
		ListNode node1=new ListNode(3);
		ListNode node2=new ListNode(1);
		ListNode node3=new ListNode(4);
		ListNode node4=new ListNode(5);
		ListNode node5=new ListNode(8);
		ListNode node6=new ListNode(1);
		ListNode node7=new ListNode(5);
		ListNode node8=new ListNode(6);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node6.next=node7;
		node7.next=node8;
		node8.next=node3;
		
		System.out.println(areConverging(node1,node6));
		

	}
	
	public static boolean areConverging(ListNode n1, ListNode n2) {
		if(n1==null&&n2==null) {
			return true;
		}
		if( n1==null || n2==null ) {
			return false;
		}
		
		ListNode cur1 = n1;
		ListNode cur2 = n2;
		while( cur1!=cur2){
			if(cur1==null) {
				cur1=n2;
			}else {
				cur1=cur1.next;
			}
			
			if(cur2==null) {
				cur2=n1;
			}else {
				cur2=cur2.next;
			}

		}
		
		if(cur1==null) {
			return false;
		}else {
			return true;
		}
	}

}

class ListNode{
	int val;
	ListNode next;
	ListNode(){
		
	}
	ListNode(int val){
		this.val=val;
	}
	ListNode(int val, ListNode next){
		this.val=val;
		this.next=next;
	}
}
