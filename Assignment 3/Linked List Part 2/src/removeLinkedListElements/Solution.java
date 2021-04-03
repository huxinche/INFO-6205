package removeLinkedListElements;


public class Solution {

	public static void main(String[] args) {
		// Input: head = [1,2,6,3,4,5,6], val = 6
		//Output: [1,2,3,4,5]
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(6);
		ListNode node4=new ListNode(3);
		ListNode node5=new ListNode(4);
		ListNode node6=new ListNode(5);
		ListNode node7=new ListNode(6);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		
		
		ListNode result=removeElements(node1,6);
		while(result!=null) {
			System.out.print(result.val+" ");
			result=result.next;

		}
	}
	
    public static ListNode removeElements(ListNode head, int val) {
        ListNode beforeHead=new ListNode(-1);
        beforeHead.next=head;
        
        ListNode pre=beforeHead;
        ListNode cur=head;
        
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
            }else{
                pre=cur;
            }
            cur=cur.next;
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
