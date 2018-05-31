
public class Tree_Functions {
	Node root;
	public int count = 0;
	
	public Node AddElement(Node current, int value){
		if (current == null){
			Increment_count();
			return new Node(value);
		}
		if (value < current.data){
			current.left = AddElement(current.left, value);
			System.out.println("Added value to the left of tree: " + value);
		}
		else if (value > current.data){
			current.right = AddElement(current.right, value);
			System.out.println("Added value to the right of tree: " + value);
		}
		else {
			return current;
		}
		return current;
	}
	
	public void add(int value){
		root = AddElement(root, value);
	}
	
	public void Increment_count(){
		count ++;
	}
	
	public int Get_count(){
		return count;
	}
	
	public boolean FindingElement(Node current, int value){
		if (current == null){
			return false;
		}
		if (value == current.data){
			return true;
		}
		return value < current.data ? FindingElement(current.left, value) : FindingElement(current.right, value);
	}

	public boolean FindElement(int value){
		boolean status = FindingElement(root, value);
		System.out.println("Element Status: " + status);
		return status;
	}
}
