//Queue
public class Data {
	public Node first;
	public Node last;
	public int sizeOfQueue;
	
	public class Node {
		public int item;
		public Node next;
	}
	
	public Data(){
		first = null;
		last = null;
		sizeOfQueue = 0;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int getValue(int i) {
		if (i == 0){
			return first.item;
		} else if (i == 1) {
			return first.next.item;
		} else if (i == 2) {
			return first.next.next.item;
		} else if (i == 3) {
			return first.next.next.next.item;
		} else if (i == 4) {
			return first.next.next.next.next.item;
		} else if (i == 5) {
			return first.next.next.next.next.next.item;
		}
		return -1;
	}
	
	public void add(int item){ //Enqueue
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) {
			first = last;
		} else {
			oldlast.next = last;
		}
		sizeOfQueue++;
	}
	
	public int remove(){ //Dequeue
		int item = first.item;
		first = first.next;
		sizeOfQueue--;
		return item;
	}
	
	public static void main(String[] args) {
		Data object = new Data();
		object.add(1);
		object.add(9);
		object.add(4);
		object.add(5);
		object.add(10);
		object.add(0);
		System.out.println(object.getValue(0));
		System.out.println(object.getValue(3));
	}
}
