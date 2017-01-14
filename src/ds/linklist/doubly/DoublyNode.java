package ds.linklist.doubly;


public class DoublyNode {

	public DoublyNode next;
	public DoublyNode prev;
	public int data;
	
	public DoublyNode(int data) {
		this.data = data;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "data: "+ data;
	}
}
