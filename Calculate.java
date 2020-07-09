import java.util.*;

class Calculate{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		int a=scan.nextInt();
		int b=scan.nextInt();
		try{
			System.out.println("A/B = " + (a/b));
		}
		catch(Exception e){
			System.out.println("A/B = " + "Infinity");
		}
		System.out.println("A+b = " + (a+b));
	}
}