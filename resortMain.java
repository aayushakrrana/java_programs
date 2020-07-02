import java.util.*;
class Resort
{
	int price,days,rooms;
	
	Resort(int d,int r,String rtype)
	{	//System.out.println(rtype);
		rooms=r;
		days=d;
		if(rtype.equals("s"))
			{price=800;}
		else if (rtype.equals("sd")) {
			price = 1200;
		}
		else if(rtype.equals("sud"))
			{price=1500;}
		else
		{
			System.out.println("Invalid Input:");
			System.exit(0);
		}
	}

	void printData()
	{
		System.out.println("No. of Days: "+days);
		System.out.println("No. of Rooms: "+rooms);
		System.out.println("Room Price : "+ price);
		System.out.println("Total Amount: "+rooms*days*price);
	}

}
class resortMain
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Input No of Rooms: ");
		int rooms=Integer.parseInt(s.nextLine());
		System.out.println("Input No of Days: ");
		int days=Integer.parseInt(s.nextLine());
		System.out.println("Input Room type(s/sd/sud): ");
		String rtype=s.nextLine();
		Resort r = new Resort(days,rooms,rtype);
		r.printData();
	}
}