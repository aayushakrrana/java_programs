import java.util.*;

class MaximumInArray
{
	public static void main(String args[])
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("Input no of elements:");
		int size = s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=1;i<size;i++)
		{
			if(a[0]<a[i])
			{
				int temp;
				temp=a[0];
				a[0]=a[i];
				a[i]=temp;
			}
		}
		System.out.println("Maximum no :" + a[0]);

	}
}