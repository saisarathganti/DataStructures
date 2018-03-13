import java.util.Scanner;

public class ternarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		
		int mid1,mid2;
		System.out.println("enter the key");
		int key=s.nextInt();
		int first=0,last=size-1;
		while(first<=last) {
			mid1=(first+last)/3;
			mid2=((first+last)/3)*2;
			if(arr[mid1]==key) {
				System.out.println("mid:"+mid1);
				return;
			}
			if(arr[mid2]==key) {
				System.out.println("mid:"+mid2);
				return;
		}
			if(arr[mid1]>key) {
				last=mid1-1;
			}
			else if(arr[mid2]<key) {
				first=mid2+1;
			}
			else {
				first=mid1+1;
				last=mid2-1;
			}
		
		}
		System.out.println("element not found");
	}

}
