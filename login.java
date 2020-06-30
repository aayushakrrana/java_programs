import java.util.*;

class login
{
	public static void main(String args[])
	{
		String users[]={"aayush","adarsh","dev"};
		String pass[]={"aayush123","adarsh123","dev123"};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Username");
		String user=s.nextLine();
		for(int i=0;i<users.length;i++)
		{
			if(users[i].equals(user))
			{
				System.out.println("Enter password");
				String passw=s.nextLine();
				for(int j=0;i<pass.length;j++)
				{
				if(pass[i].equals(passw))
				{
					System.out.println("Verified Login!!!");
					break;
				}
				else
				{
					System.out.println("Invalid pass");
					break;

				}
		        }		
			}
			else
			{
				System.out.println("Invalid Username");
				break;

			}
		}
		
		
	}
}

