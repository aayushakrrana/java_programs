import java.util.*;

class allException{
	public static void main(String args[]){
	String array[]={"1","5","a","f","7","q"};
	Scanner scan = new Scanner(System.in);
	System.out.println("Input Index: " );
	int index = scan.nextInt();
	System.out.println("Input Int Value: " );
	int val =scan.nextInt();
	try{
	int y = Integer.parseInt(array[index])/val;
	System.out.println(array[index] + "/" + val + " = "  + y );
	}
	catch(ArithmeticException e)
	{
	System.out.println("Cannot divide by zero");
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("No element present at this Index");
	}
	catch(NumberFormatException e){
		System.out.println("NumberFormatException");
	}
	}
}