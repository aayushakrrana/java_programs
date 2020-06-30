import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int lim;
		System.out.println("Final limit: ");
		lim = s.nextInt();
		int a=1,b=1,fib;
		System.out.println(a);
		System.out.println(b);
		
		do
		{	
			fib = b+ a;
			if(fib<lim)
			System.out.println(fib);
			b=a;
			a=fib;

		}while(fib<lim);

	}
}