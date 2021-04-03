package oddEvenLinkedList;


public class Solution {
	//Test Case
	public static void main(String[] args) {
		//built Linked List [1,2,3,4,5]
		//output: [1,3,5,2,4]
		
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		ListNode result=oddEvenList(node1);
		while(result!=null) {
			System.out.print(result.val+" ");
			result=result.next;
		}

	}
	
    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode oddNode = head;
        ListNode evenNode = head.next;
        ListNode evenBefore = evenNode;
        
        while(evenNode != null && evenNode.next != null){
            oddNode.next = evenNode.next;
            oddNode = oddNode.next;
            evenNode.next = evenNode.next.next;
            evenNode = evenNode.next;
        }
        
        oddNode.next = evenBefore;
        return head;
    }

}


//Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

