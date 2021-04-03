package deleteNNodesAfterMNodesOfALinkedList;


public class Solution {

	public static void main(String[] args) {
		//Input: head = [1,2,3,4,5,6,7,8,9,10,11,12,13], m = 2, n = 3
		//Output: [1,2,6,7,11,12]
		
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		ListNode node6=new ListNode(6);
		ListNode node7=new ListNode(7);
		ListNode node8=new ListNode(8);
		ListNode node9=new ListNode(9);
		ListNode node10=new ListNode(10);
		ListNode node11=new ListNode(11);
		ListNode node12=new ListNode(12);
		ListNode node13=new ListNode(13);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		node8.next=node9;
		node9.next=node10;
		node10.next=node11;
		node11.next=node12;
		node12.next=node13;
		
		
		ListNode result=deleteNodes(node1,2,3);
		while(result!=null) {
			System.out.print(result.val+" ");
			result=result.next;

		}

			
	}
	
    public static ListNode deleteNodes(ListNode head, int m, int n) {
        if(head == null){
            return head;
        }
        
        ListNode cur = head;
        while(true){
            for(int i = 0; i < m - 1; i++){
                if(cur.next == null){
                    return head;
                }
                cur = cur.next;
            }

            ListNode del = cur;
            for(int i = 0; i < n; i++){
                if(del.next == null){
                    break;
                }
                del = del.next;
            }
            cur.next = del.next;

            if(cur.next == null){
                return head;
            }
            cur = cur.next;
        }
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
