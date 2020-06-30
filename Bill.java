import java.util.*;
class Bill
{
	public static void main(String args[])
	{
		int unit;float bill;
		System.out.println("Input Units:");
		Scanner a =new Scanner(System.in);
		unit=a.nextInt();
		if(unit<=100)
		{
			bill=unit*4;
		} 
		else if(unit>100 && unit<=200)
		{
			bill=400;
			bill+=(unit-100)*4.5;
		}
		else
		{
			bill=unit*5;
		}

		System.out.println("Bill amount: " + bill);
	}
}