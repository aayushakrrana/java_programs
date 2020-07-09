import java.util.*;
class arrayIndexOutOfBound{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[]={4,5,9,7,5};
		int index= scan.nextInt();
		try{
			System.out.println("Element at Index " + index + " : " + array[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Index");
		}
	}
}