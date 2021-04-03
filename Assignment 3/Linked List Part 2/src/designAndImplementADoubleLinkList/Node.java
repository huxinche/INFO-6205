package designAndImplementADoubleLinkList;

public class Node {
	public int val;
	public Node next;
	public Node prev;
	
	public Node(){}
	
	public Node(int val) {
		this.val=val;
		next=new Node();
		prev=new Node();
	}


	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	
}