package BinaryTree;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeCreation t=new BinaryTreeCreation();
		t.insert(100);
		t.insert(50);
		t.insert(75);
		t.insert(300);
		t.insert(250);
		t.insert(20);
		t.insert(70);
		t.insert(400);
		t.insert(150);
		t.insert(80);
		System.out.println("Inorder is:");
		t.inorder(t.root);
		System.out.println("\nPreorder is:");
		t.preorder(t.root);
		System.out.println("\nPostorder is:");
		t.postorder(t.root);
		if(t.search(20)){
			System.out.println("\nFound");
		}
		else{
			System.out.println("Not Found");
		}
		if(t.search(25)){
			System.out.println("Found");
		}
		else{
			System.out.println("Not Found");
		}
		if(t.search(250)){
			System.out.println("Found");
		}
		else{
			System.out.println("Not Found");
		}
		System.out.println("Min element is: ");
		System.out.println(t.min());
		System.out.println("Max element is: ");
		System.out.println(t.max());
	}

}

