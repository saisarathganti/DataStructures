import java.util.*;			
public class Treap {
	private TreapNode root;
	private static TreapNode nil=new TreapNode();
	public Treap() {
		root=nil;
	}
	public void insert(int x) {
		root=insert(x,root);
	}
	public TreapNode insert(int x,TreapNode T) {
		if(T==nil) {
			return new TreapNode(x,nil,nil);
		}
		else if(x<T.element) {
			T.left=insert(x,T.left);
			if(T.left.priority<T.priority) {
				TreapNode L=T.left;
				T.left=L.right;
				L.right=T;
				return L;
			}
		}
		else if(x>T.element) {
			T.right=insert(x.T.right);
			if(T.right.priority<T.priority) {
				TreapNode R=T.right;
				T.right=R.left;
				R.left=T;
				return R;
			}
		}
		return T;
	}
	

}
