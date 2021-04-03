package swapNodesInPairs;

public class Solution {
	
	//test case
	public static void main(String[] args) {
		//built Linked List [1,2,3,4]
		//Output: [2,1,4,3]
		
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		ListNode result=swapPairs(node1);
		while(result!=null) {
			System.out.print(result.val+" ");
			result=result.next;
		}
		
	}
	
    public static ListNode swapPairs(ListNode head) {
        ListNode beforeHead = new ListNode(-1);
        beforeHead.next = head;
        head = beforeHead;
        
        while (head.next != null && head.next.next != null) {
            ListNode node1 = head.next, node2 = head.next.next;
            head.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            head = node1;
        }
        
        return beforeHead.next;
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

