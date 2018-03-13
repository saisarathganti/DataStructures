public class SegmentTree {
	final static int MAX_VALUE=2555555;
	public static void ConstructTree(int input[],int segTree[],int low,int high,int root) {
		if(low==high) {
			segTree[root]=input[low];
			return;
		}
		int mid=(low+high)/2;
		ConstructTree(input,segTree,low,mid,(2*root)+1);
		ConstructTree(input,segTree,mid+1,high,(2*root)+2);
		segTree[root]=Math.min(segTree[(2*root)+1],segTree[(2*root)+2]);
	}
	public static int RangeMinQuery(int segTree[],int qlow,int qhigh,int low,int high,int root) {
		if(qlow<=low&&qhigh>=high) {    //////total overlapping
			return segTree[root];
		}
		if(qlow>high||qhigh<low) {      /////no overlapping
			return MAX_VALUE;
		}
		int mid=(low+high)/2;
		return Math.min(RangeMinQuery(segTree,qlow,qhigh,low,mid,(2*root)+1),RangeMinQuery(segTree,qlow,qhigh,mid+1,high,(2*root)+2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,6,7,8};
		int[] segTree=new int[15];
		ConstructTree(arr,segTree,0,7,0);
		System.out.println(RangeMinQuery(segTree,1,4,0,7,0));
		
	}

}
