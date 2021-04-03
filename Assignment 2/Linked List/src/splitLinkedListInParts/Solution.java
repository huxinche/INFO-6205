package splitLinkedListInParts;


public class Solution {

	//Test Case
	public static void main(String[] args) {
		//root = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 3
		//Output: [[1, 2, 3, 4], [5, 6, 7], [8, 9, 10]]
		
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
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		node8.next=node9;
		node9.next=node10;
		
		ListNode[] list=splitListToParts(node1,3);
		for(int i=0;i<list.length;i++) {
			System.out.print("[");
			ListNode node=list[i];
			while(node!=null) {
				System.out.print(node.val+" ");
				node=node.next;
			}
			System.out.print("]");
		}

	}
	
	public static ListNode[] splitListToParts(ListNode root, int k) {
	        ListNode[] result = new ListNode[k];
	        int i = 0;
	        ListNode node = root;
	        while (node!=null){
	            i++;
	            node = node.next;
	        }
	        int size = i / k;
	        int extraSize = i % k;
	        result[0]=root;
	        split(result, size, 1, extraSize, root, 0);
	        return result;
	    }
	
	public static void split(ListNode[] nodes, int size, int currentSize, int extreSize, ListNode node, int index){
	        if (node!=null){
	        	int finalSize;
	        	if(index<extreSize) {
	        		finalSize=size+1;
	        	}else {
	        		finalSize=size;
	        	}
		        
		        if (currentSize<finalSize) {
		        	split(nodes, size, currentSize+1, extreSize, node.next, index);
		        }else {
		            ListNode newNode = node.next;
		            node.next = null;
		            if (index<nodes.length-1){
		            nodes[index+1]=newNode;
		            split(nodes, size, 1, extreSize, newNode, index+1);}
		        }
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


