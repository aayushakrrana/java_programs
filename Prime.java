import java.util.*;

class Prime
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Input Value: ");
		int val = s.nextInt();
		int flag=0;
		for(int i=2;i<=val/2;i++)
		{
			if(val%i==0)
			 flag++;
		}
		if(flag>1)
		{
		System.out.println("Not Prime");
		}
		else
		{
		System.out.println("Prime");
		}

	}
}