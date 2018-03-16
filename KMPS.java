import java.util.*;
public class KMPS {
	public int[] subarray(char[] substring) {
		int pre[] =new int[substring.length];
		int j=0;
		for(int i=1;i<substring.length;) {
			if(substring[j]==substring[i]) {
				pre[i]=j+1;
				i++;
				j++;
			}
			else {
				if(j!=0)
					j=pre[j-1];
				else {
					pre[i]=0;
					i++;
				}
			}
		}
		return pre;
	}
	public boolean KMP(char[] substring,char[] string) {
		int[] pre=subarray(substring);
		int i=0,j=0;
		while(i<string.length&&j<substring.length) {
			if(string[i]==substring[j]) {
				i++;j++;
			}
			else {
				if(j!=0)
					j=pre[j-1];
				else
					i++;
			}
		}
		if(j==substring.length)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String string=s.next();
		String substring=s.next();
		KMPS ss=new KMPS();
		boolean result=ss.KMP(string.toCharArray(),substring.toCharArray());
		System.out.println(result);
		
	}

}
