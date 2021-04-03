package mergeInBetweenLinks;

public class Solution {

	//Test Case
	public static void main(String[] args) {
		// Input: list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
		//Output: [0,1,2,1000000,1000001,1000002,5]
		ListNode node1=new ListNode(0);
		ListNode node2=new ListNode(1);
		ListNode node3=new ListNode(2);
		ListNode node4=new ListNode(3);
		ListNode node5=new ListNode(4);
		ListNode node6=new ListNode(5);
		
		ListNode nodeA=new ListNode(1000000);
		ListNode nodeB=new ListNode(1000001);
		ListNode nodeC=new ListNode(1000002);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		
		nodeA.next=nodeB;
		nodeB.next=nodeC;
		
		ListNode result=mergeInBetween(node1,3,4,nodeA);
		while(result!=null) {
			System.out.print(result.val+" ");
			result=result.next;
		}
		
	}

	public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode front=new ListNode(-1);
        ListNode back=new ListNode(-1);
        front.next=list1;
        back.next=list1;
        
        for(int i=0;i<a;i++){
            front=front.next;
        }

        for(int i=0;i<b+2;i++){
            back=back.next;
        }

        ListNode cur=new ListNode(-1);
        cur.next=list2;
        while(cur.next!=null){
            cur=cur.next;
        }

        front.next=list2;
        cur.next=back;
        return list1;
    }
}

// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
