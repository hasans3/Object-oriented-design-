
public class Stacks_and_Queues {

	// Declaring new object of the class
	public static Stack_Queue_Function s1;
	public static void main(String[] args) {
		// Initializing new object of the class
		s1 = new Stack_Queue_Function();
		// Adding items to a stack
		s1.Additemtostack(5);
		s1.Additemtostack(3);
		s1.Additemtostack(2);
		s1.Additemtostack(9);
		s1.Additemtostack(12);
		// Running some test case
		int num_of_stack_elems = s1.Getcount();
		s1.Print_Elem_in_Stack();
		System.out.println("Number of Elements in stack: " + num_of_stack_elems);
		int removed_item_from_stack = s1.Removeitemfromstack();		
		System.out.println("Element removed from stack: " + removed_item_from_stack);
		s1.Print_Elem_in_Stack();
		num_of_stack_elems = s1.Getcount();
		System.out.println("Number of Elements in stack: " + num_of_stack_elems);
		// Adding items to a queue
		s1.Additemtoqueue(4);
		s1.Additemtoqueue(6);
		s1.Additemtoqueue(1);
		s1.Additemtoqueue(3);
		s1.Additemtoqueue(2);
		s1.Additemtoqueue(8);
		// Running some test case
		s1.Print_Elem_in_Queue();
		int num_of_queue_elems = s1.Getcount_Queue();
		System.out.println("Number of Elements in queue: " + num_of_queue_elems);
		int removed_item_from_queue = s1.Removeitemfromqueue();		
		System.out.println("Element removed from queue: " + removed_item_from_queue);
		s1.Print_Elem_in_Queue();
		num_of_queue_elems = s1.Getcount_Queue();
		System.out.println("Number of Elements in queue: " + num_of_queue_elems);
	}

}
