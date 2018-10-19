import java.util.Scanner;
class PostFix
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in); 
		String a = in.next();
		int n = a.length();
		char[] b=new char[a.length()];
		int j=0;
		StackChar s = new StackChar(n);
		for(int i= 0;i<n;i++)
		{
			char x = a.charAt(i);
			if(x=='(')
				s.push(x);
			else if((x=='+') || (x=='-') || (x=='*') || (x=='/') || (x=='^'))
			{
				if(s.getTop()== -1)
					s.push(x);
				else
				{
					char k = s.peek();
					if(s.prec(x)>s.prec(k))
						s.push(x);
					else
					{
						while(s.prec(x)<=s.prec(k))
						{
							b[j]=s.pop();
							j++;
							k=s.peek();
						}
						s.push(x);
					}
				}

			}
			else if(x==')')
			{
				while(s.peek()!='(')
				{
					b[j]=s.pop();
					j++;
				}
				s.pop();
				
			}
			else
			{
				b[j]=x;
				j++;
			}
		}
		while(s.getTop()!= -1)
		{
			b[j]=s.pop();
			j++;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]);
		}
		
	}
}