//import java.util.*;

class Stringg
{
	public static void main(String args[])
	{
		//Scanner s = new Scanner (System.in);
		String s1="Happy";
		String s2="Happy";
		String s3= new String ("Happy");
		String s4= new String ("Happy");
		boolean b=s1==s2;
		System.out.println("s1==s2 "+b);
		b=s1==s3;
		System.out.println("s1==s3 "+b);
		b=s3==s4;
		System.out.println("s3==s4 "+b);


		System.out.println("s1 eq s2 "+ s1.equals(s2));
		System.out.println("s1 eq s3 "+ s1.equals(s3));
		System.out.println("s3 eq s4 "+ s3.equals(s4));


	}
}