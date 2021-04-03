package designAndImplementADoubleLinkList;

public class DoubleLinkedList {
	public Node head;
	public Node tail;
	
	public DoubleLinkedList() {
		
	}
	
	public void insertHead(int data){
        Node nodeInserted = new Node(data);
        if(head == null){
            tail = nodeInserted;
        }else {
            head.setPrev(nodeInserted);
        }
        nodeInserted.setNext(head);
        head = nodeInserted;
	}
	
	public void insertTail(int data){
        Node nodeInserted = new Node(data);
        tail.setNext(nodeInserted);
        nodeInserted.setPrev(tail);
        this.tail = nodeInserted;
    }
	
	public void printList(){
        StringBuilder result = new StringBuilder("[");
        Node temp = head;
        while (temp.getNext() != null){
            result.append(temp.getVal() + ", ");
            temp = temp.getNext();
        }
        result.append(temp.getVal() + "]");
        System.out.println(result.toString());
    }
	
	public int size(){
        Node temp = head;
        int size=0;
        while (temp.getNext() != null){
            temp = temp.getNext();
            size++;
        }
        
        return size;
    }
	
}
