
public class Stack_Queue_Function {
	public Node head;
	public Node head1;
	private static int count = 0;
	private static int count1 = 0;
	
	// Method to add item to a stack
	public void Additemtostack(int dataval){
		if (head == null){
			head = new Node(dataval);
			Incrementcount();
			return;
		}
		else {
			Node temp = new Node(dataval);
			temp.next = head;
			head = temp;
			Incrementcount();
		}
	}
	
	// Method to delete item from a stack
	public int Removeitemfromstack(){
		if (head == null){
			System.out.println("Stack is empty");
			return 0;
		}
		int item = head.data;
		head = head.next;
		Decrementcount();
		return item;
	}
	
	// Method to print items in a stack
	public void Print_Elem_in_Stack(){
		Node current = head;
		System.out.print("Content of Stack: [");
		while (current.next != null) {
			System.out.print(current.data + ", ");
			current = current.next;			
		}
		System.out.print(current.data + "]");
		System.out.println();
	}
	
	// Method to increment count in a stack
	public static void Incrementcount() {
		count++;
	}
	
	// Method to decrement count in a stack
	public static void Decrementcount() {
		count--;
	}
	
	// Mehtod to obtain count in a stack
	public int Getcount() {
		return count;
	}
	
	// Method to add item to a queue
	public void Additemtoqueue(int dataval){
		if (head1 == null){
			head1 = new Node(dataval);
			Incrementcount_Queue();
			return;
		}
		else {
			Node temp = new Node(dataval);
			temp.next = head1;
			head1 = temp;
			Incrementcount_Queue();
		}
	}
	
	// Method to remove item from a queue
	public int Removeitemfromqueue(){
		Node prev = null;
		if (head1 == null){
			System.out.println("Queue is empty");
			return 0;
		}
		Node current = head1;
//		Node prev = null;
		while(current.next != null){
			prev = current;
			current = current.next;
		}
		int item = current.data;
		prev.next = null;
		current = prev;
		Decrementcount_Queue();
		return item;
	}
	
	// Method to print items in a queue
	public void Print_Elem_in_Queue(){
		Node current = head1;
		System.out.print("Content of Queue: [");
		while (current.next != null) {
			System.out.print(current.data + ", ");
			current = current.next;			
		}
		System.out.print(current.data + "]");
		System.out.println();
	}
	
	// Increment count in a queue 
	public static void Incrementcount_Queue() {
		count1++;
	}
	
	// Decrement count in a queue
	public static void Decrementcount_Queue() {
		count1--;
	}
	
	// Get count of the queue
	public int Getcount_Queue() {
		return count1;
	}

}
