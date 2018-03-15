import java.util.*;
public class TreapNode {
	int element,priority;
	TreapNode left,right;
	public TreapNode() {
		this.priority=Integer.MAX_VALUE;
		this.element=0;
		this.left=this;
		this.right=this;
	}
	public TreapNode(int ele)
    {
        this(ele, null, null);
    } 
	public TreapNode(int ele,TreapNode left,TreapNode right) {
		this.element=ele;
		this.left=left;
		this.right=right;
		this.priority=new Random().nextInt();
	}
	
}
