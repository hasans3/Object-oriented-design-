
public class CreateLinkedList {
	public static MultiFunctionLinkedList n1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		n1 = new MultiFunctionLinkedList();
		n1.addNode(0);
		n1.addNode(1);
		n1.addNode(2);
		n1.addNode(1);
		n1.addNode(0);
//		n1.addNode(1);
		int size = n1.Getcount();
//		Object a = n1.head.data;
//		Object b = n1.head.next.data;
//		Object c = n1.head.next.next.data;
//		Object d = n1.head.next.next.next.data;
		n1.List();
//		System.out.println("First node: " + a);
//		System.out.println("Second Node: " + b);
//		System.out.println("Third Node: " + c);
//		System.out.println("Fourth Node: " + d);
		System.out.println("Linked List Size: " + size);
//		n1.Partition(5);
		boolean a = n1.Palindrome();
		System.out.println(a);
//		System.out.println("Content of Linked List before Removal: " + content_of_linked_list);
//		n1.removeNode(1);
//		HashSet<Object> content_of_linked_list1 = n1.List();
//		System.out.println("Content of Linked List after Removal: " + content_of_linked_list1);
//		n1.List();
//		size = n1.Getcount();
//		System.out.println("Linked List Size: " + size);
//		n1.removeDuplicate();
//		n1.List();
//		size = n1.Getcount();
//		System.out.println("Linked List Size: " + size);
//		n1.GetElementAtK(1);
	}
}
