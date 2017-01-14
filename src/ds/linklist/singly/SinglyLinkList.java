package ds.linklist.singly;

public class SinglyLinkList {

	private SinglyNode head;
	
	public static void main(String[] args) {
		SinglyLinkList singlyLinkList = new SinglyLinkList();
		singlyLinkList.createListOf(5);
		singlyLinkList.printList();
		singlyLinkList.insertAt(2, new SinglyNode(1));
		singlyLinkList.deleteAt(2);
		
	}
	
	
	public SinglyNode deleteAt(int index){
		SinglyNode current = head;
		SinglyNode prev = null;
		int i = 0;
		while(current!=null && i != index){
			prev = current;
			current = current.next;
			i++;
		}
		
		if(index>i){
			System.out.println("Provide valid index");
			return null;
		}
		
		prev.next = current.next;
		
		System.out.println("Print new list as : ");
		
		printList();
		
		return current;
		
	}
	
	public void insertAt(int indexAt, SinglyNode node){
		
		SinglyNode current = head;
		SinglyNode prev = null;
		int index = 0;
		while(current!=null && index != indexAt){
			prev = current;
			current = current.next;
			index++;
		}
		
		if(indexAt>index){
			System.out.println("Provide valid index");
			return;
		}
		
		prev.next = node;
		node.next = current;
		
		System.out.println("Print new list as : ");
		
		printList();
		
	}
	
	public void insertHead(SinglyNode newHead){
		newHead.next = head;
		head = newHead;
		
		System.out.println("Print new list as : ");
		
		printList();
		
	}
	
	
	public int getLength(){
		SinglyNode current = head;
		int currentLength = 0;
		while(current!=null){
			current = current.next;
			currentLength++;
		}
		
		return currentLength;
	}
	
	public void insertTail(SinglyNode tail){
		SinglyNode current = head;
		SinglyNode prev = null;
		while(current!=null){
			prev = current;
			current = current.next;
			
		}
		prev.next = tail;
		
		System.out.println("Print new list as : ");
		printList();
	}
	
	public void createListOf(int length){
		
		head = new SinglyNode(0);
		SinglyNode prev = head;
		for(int i=0; i<length; i++){
			
			SinglyNode current = new SinglyNode((i+1)*100);
			prev.next = current;
			prev = current;
		}
	}
	
	public void printList(){
		SinglyNode current = head;
		while(current!=null){
			System.out.println(current.data);
			current = current.next;
		}
		
		System.out.println("Current length of list is : "+ getLength());
	}
	
}
