
public class Stack_Queue_Function {
	public Node head;
	public Node head1;
	private static int count = 0;
	private static int count1 = 0;
	
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
	
	public static void Incrementcount() {
		count++;
	}
	
	public static void Decrementcount() {
		count--;
	}
	
	public int Getcount() {
		return count;
	}
	
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
	
	public static void Incrementcount_Queue() {
		count1++;
	}
	
	public static void Decrementcount_Queue() {
		count1--;
	}
	
	public int Getcount_Queue() {
		return count1;
	}

}
