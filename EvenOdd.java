import java.util.*;

class EvenOdd
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int val;
		System.out.println("Input value");
		val = s.nextInt();
		String output=(val%2==0)?"EVEN":"ODD";
		System.out.println(output);
	}
}