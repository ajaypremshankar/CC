package ds.linklist.doubly;

public class DoublyLinkList {

	private DoublyNode head;
	
	public static void main(String[] args) {
		DoublyLinkList doublyLinkList = new DoublyLinkList();
		doublyLinkList.createListOf(5);
		doublyLinkList.insertAt(0, new DoublyNode(21));
	}
	
	
	public void insertAt(int indexAt, DoublyNode node){
		
		if(indexAt == 0){
			insertHead(node);
			return;
		}
		
		DoublyNode currentNode = head;
		int index = 0;
		while(currentNode!=null && index != indexAt){
			currentNode = currentNode.next;
			index++;
		}
		
		if(indexAt>index){
			System.out.println("Provide valid index");
			return;
		}

		DoublyNode prevNode = currentNode.prev;
		
		prevNode.next = node;
		node.prev = prevNode;
		
		node.next = currentNode;
		currentNode.prev = node;
		
		System.out.println("Print new list as : ");
		
		printList();
		
	}
	
	public void insertHead(DoublyNode newHead){
		newHead.next = head;
		head.prev = newHead;
		head = newHead;
		System.out.println("Print new list as : ");
		printList();
		
	}
	
	
	public int getLength(){
		DoublyNode current = head;
		int currentLength = 0;
		while(current!=null){
			current = current.next;
			currentLength++;
		}
		
		return currentLength;
	}
	
	public void insertTail(DoublyNode tail){
		DoublyNode current = head;
		DoublyNode prev = null;
		while(current!=null){
			prev = current;
			current = current.next;
			
		}
		prev.next = tail;
		
		System.out.println("Print new list as : ");
		printList();
	}
	
	public void createListOf(int length){
		
		head = new DoublyNode(0);
		DoublyNode prev = head;
		for(int i=0; i<length; i++){
			
			DoublyNode current = new DoublyNode((i+1)*100);
			prev.next = current;
			current.prev = prev;
			prev = current;
		}
		printList();
	}
	
	public void printList(){
		DoublyNode current = head;
		int index = 0;
		while(current!=null){
			System.out.println("Data at : "+index++ + " : "+current + " prev: "+current.prev + " next: "+current.next);
			current = current.next;
		}
		
		System.out.println("Current length of list is : "+ getLength());
	}
	
}
