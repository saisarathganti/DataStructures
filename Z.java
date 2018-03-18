import java.util.*;
public class Z {
	public int[] calculate(char[] total) {
		int[] Z=new int[total.length];
		int left=0,right=0;
		for(int k=1;k<total.length;k++) {
			if(k>right) {
				left=right=k;
				while(right<total.length&&total[right]==total[right-left]) {
					right++;
				}
				Z[k]=right-left;
				right--;
			}
			else {
				int k1=k-left;
				if(Z[k1]<right-k+1) {
					Z[k]=Z[k1];
				}
				else {
					left=k;
					while(right<total.length&&total[right]==total[right-left]) {
						right++;
					}
					Z[k]=right-left;
					right--;
				}
			}
		}
		return Z;
	}
	public List<Integer> matchPattern(char[] string,char[] substring) {
		char[] total=new char[string.length+1+substring.length];
		int i=0;
		for(char ch : substring) {
			total[i]=ch;
			i++;
		}
		total[i]='$';
		i++;
		for(char ch : string) {
			total[i]=ch;
			i++;
		}
		List<Integer> result=new ArrayList<>();
		int Z[]=calculate(total);
		for(int j=0;j<Z.length;j++) {
			if(Z[j]==substring.length) {
				result.add(j-substring.length-1);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		/*
		String text = "aaabcxyzaaaabczaaczabbaaaaaabc";
        String pattern = "aaabc";
        ZAlgorithm zAlgorithm = new ZAlgorithm();
        List<Integer> result = zAlgorithm.matchPattern(text.toCharArray(), pattern.toCharArray());
        result.forEach(System.out::println);
		 */
		/////////////this type input is given
		s.close();
	}

}
