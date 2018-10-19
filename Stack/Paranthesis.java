import java.util.Scanner;
class Paranthesis
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String a = in.next();
		int n = a.length();
		StackChar s = new StackChar(n);
		int flag=1;
		for(int i= 0;i<n;i++)
		{
			char x = a.charAt(i);
			if((x=='(') || (x=='{') || (x=='['))
				s.push(x);
			else if(x==')')
			{
				if(s.peek()=='(')
					s.pop();
				else
				{
					flag=0;
					break;
				}
			}
			else if(x=='}')
			{
				if(s.peek()=='{')
					s.pop();
				else
				{
					flag=0;
					break;
				}
			}
			else if(x==']')
			{
				if(s.peek()=='[')
					s.pop();
				else
				{
					flag=0;
					break;
				}
			}
		}
		if(flag==0)
			System.out.println("Not Balanced");
		if(flag==1)
		{
			if(s.getTop()== -1)
				System.out.println("Balanced");
			else
				System.out.println("Not Balanced");
		}

	}
}