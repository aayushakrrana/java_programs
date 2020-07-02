import java.util.*;
class Pallindrome
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = scan.nextLine();
		String reverse="";
		int len = str.length();
		for(int i=len-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
	}
}