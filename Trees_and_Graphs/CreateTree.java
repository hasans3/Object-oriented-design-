
public class CreateTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_Functions tree = new Tree_Functions();
//		Tree_Functions tree1 = new Tree_Functions();
		tree.add(10);
		tree.add(2);
		tree.add(4);
		tree.add(1);
		tree.add(9);
//		tree.add(8);
//		tree1.add(11);
//		tree1.add(20);
//		tree1.add(14);
//		tree1.add(10);
//		tree1.add(90);
//		tree1.add(18);
		tree.FindElement(1);
//		tree1.FindElement(2);
		System.out.println("Number of elements in the tree: " + tree.Get_count());
		
	}

}
