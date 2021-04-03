package deleteNodeInALinkedList;

public class Solution {
	
	//Test Case
	public static void main(String[] args) {
		//built Linked List [4,5,1,9],node =5;
		//output: [4,1,9]
		
		ListNode node1=new ListNode(4);
		ListNode node2=new ListNode(5);
		ListNode node3=new ListNode(1);
		ListNode node4=new ListNode(9);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
	   deleteNode(node2);
	   ListNode cur=node1;
	   while(cur!=null) {
			System.out.print(cur.val+" ");
			cur=cur.next;
		}

	}
	
    public static void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }

}

//Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
