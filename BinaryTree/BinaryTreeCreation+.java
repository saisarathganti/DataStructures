package BinaryTree;

public class BinaryTreeCreation {
	public Node root=null;
	public void insert(int n){
		Node key=new Node(n);
		Node x=root;
		if(root==null){
			root=key;
		}
		else{
			Node parent=root;
			while(x!=null){
				if(key.data<x.data){
					parent =x;
					x=x.left;
				}
				else{
					parent=x;
					x=x.right;
				}
			}
			if(key.data<parent.data)
				parent.left=key;
			if(key.data>parent.data)
				parent.right=key;
		}
		
	}
	public void inorder(Node key){
		if(key!=null){
			inorder(key.left);
			System.out.print(key.data+" ");
			inorder(key.right);
		}
		else
			return;
	}
	public void preorder(Node key){
		if(key!=null){
			System.out.print(key.data+" ");
			preorder(key.left);
			preorder(key.right);
		}
	}
	public void postorder(Node key){
		if(key!=null){
		
			postorder(key.left);
			postorder(key.right);
			System.out.print(key.data+" ");
			
		}
	}
	public boolean search(int key){
		Node k=root;
		while(k!=null){
			if(key<k.data){
				k=k.left;
			}
			else if(key>k.data){
				k=k.right;
			}
			else
				return true;
		}
		return false;
	}
	public int min(){
		Node k=root;
		while(k.left!=null){
			k=k.left;
		}
		return k.data;
	}
	public int max(){
		Node k=root;
		while(k.right!=null){
			k=k.right;
		}
		return k.data;
	}
	public void deletion(int key){
		Node k=root;
		while(k!=null){
			if(key<k.data){
				k=k.left;
			}
			else if(key>k.data){
				k=k.right;
			}
			else
				
		}
	}
}

