import java.util.HashSet;

public class MultiFunctionLinkedList {
	public static Node head1;
	public static Node head2;
	public Node head;
	private static int count;
	Node next;
	private int i = 0;
	
	public void addNode(int data) {
		if (head == null) {
			head = new Node(data);
			count = 1;
			return;
		}
		Node temp = new Node(data);
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = temp;
		Incrementcount();
	}
	
	public static Node addNodemodified(int data) {
		if (head1 == null) {
			head1 = new Node(data);
			count = 1;
			return head1;
		}
		Node temp = new Node(data);
		Node current = head1;
		while (current.next != null) {
			current = current.next;
		}
		current.next = temp;
		Incrementcount();
		return head1;
	}
	
	public static Node addNodemodified1(int data) {
		if (head2 == null) {
			head2 = new Node(data);
			count = 1;
			return head2;
		}
		Node temp = new Node(data);
		Node current = head2;
		while (current.next != null) {
			current = current.next;
		}
		current.next = temp;
		Incrementcount();
		return head2;
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
	
	public void List() {
		Node current = head;
		System.out.print("Content of Linked List: [");
		while (current.next != null) {
			System.out.print(current.data + ", ");
			current = current.next;			
		}
		System.out.print(current.data + "]");
		System.out.println();
	}
	
	public void removeNode(int index) {
		Node current = head;
		i = 1;
		while(i != index) {
			current = current.next;
			i++;
		}
		current.next = current.next.next;
		Decrementcount();
	}
	
	public void removeDuplicate() {
		HashSet<Object> set = new HashSet<Object>();
		Node previous = null;
		Node current = head;
		while (current.next != null) {
			if (set.contains(current.data)) {
				previous.next = current.next;
				Decrementcount();
			}
			else {
				set.add(current.data);
				previous = current;
			}
			current = current.next;
		}
		if (set.contains(current.data)) {
			previous.next = current.next;
			Decrementcount();
		}
	}
	
	public void GetElementAtK(int index) {
		int i = 1;
		Node current = head;
		while(i != index) {
			if(index > Getcount()) {
				System.out.println("Index not available in the linked list");
				return;
			}
			else {
				current = current.next;
				i++;
			}
		}
		System.out.println("Element at kth index: " + current.data);
	}
	
	public void Partition(int x) {
		Node current = head;
		Node lessthan = null;
		Node gthan = null;
		while(current != null) {
//			System.out.println(current.data);
			if (current.data < x) {
				System.out.println("Added element < x " + current.data);
				lessthan = addNodemodified(current.data);
			}
			else if (current.data >= x) {
				System.out.println("Added element > x " + current.data);
				gthan = addNodemodified1(current.data);
			}
			current = current.next;
		}
		while (lessthan.next != null) {
//			System.out.println(lessthan.data);
			lessthan = lessthan.next;
		}
//		System.out.println(lessthan.data);
		lessthan.next = gthan;
//		System.out.println("Element of lessthan: " + lessthan.data + lessthan.next.data + lessthan.next.next.data + lessthan.next.next.next.data + lessthan.next.next.next.next.data);
		System.out.println("Element of gthan: " + gthan.data + gthan.next.data + gthan.next.next.data);
	}
	
	public boolean Palindrome(){
		Node new_head = null;
		Node current = head;
		while (current != null){
			Node temp = new Node(current.data);
			temp.next = new_head;
			new_head = temp;
			current = current.next;
		}
		Node current1 = head;
		while(current1 != null && new_head != null){
			if (current1.data != new_head.data){
				return false;
			}
			current1 = current1.next;
			new_head = new_head.next;
		}
		return true;
	}
}
