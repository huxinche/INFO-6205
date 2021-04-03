package swapNodesInLinkList;



public class Solution {

	//Test Case
	public static void main(String[] args) {
		// Input: head = [1,2,3,4,5], k = 2
		//Output: [1,4,3,2,5]
		
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		
		ListNode result=swapNodes(node1,2);
		while(result!=null) {
			System.out.print(result.val+" ");
			result=result.next;
		}
	}
	
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode cur=head;
        ListNode last=head;
        ListNode pre=head;

        while(cur!=null && k>1)
        {
        	cur=cur.next;
            last=last.next;
            k--;
        }
        while(last.next!=null )
        {
        	last=last.next;
        	pre=pre.next;
        }
        
        int temp=pre.val;
        pre.val=cur.val;
        cur.val=temp;
        
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
