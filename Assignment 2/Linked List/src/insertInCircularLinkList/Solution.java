package insertInCircularLinkList;

public class Solution {

	//Test Case
	public static void main(String[] args) {
		//Input: head = [3,4,1], insertVal = 2
		//Output: [3,4,1,2]
		
		Node node1=new Node(3);
		Node node2=new Node(4);
		Node node3=new Node(1);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node1;
		
		Node result=insert(node1,2);
		Node cur=insert(node1,2);
		while(result.next!=cur) {
			System.out.print(result.val+" ");
			result=result.next;
		}
		
	}
	
    public static Node insert(Node head, int insertVal) {
        Node res = new Node(insertVal);
        if (head == null) {
            res.next = res;
            return res;
        }
        
        Node node = head; 
        Node cur = head.next;
        while (cur != head) {
            if (node.val <= insertVal && insertVal <= cur.val) {
            	break;
            }
            if (node.val > cur.val) {
                if (insertVal <= cur.val || insertVal >= node.val) {
                	break;
                }
            }
            node = cur;
            cur = cur.next;
        }
        node.next = res;
        res.next = cur;
        return head;
    }

}

//Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
}
