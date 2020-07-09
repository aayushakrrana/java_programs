import java.util.*;

class numberFormatException{
	public static void main(String args[]){

	Scanner scan = new Scanner(System.in);
	int num=0;
	String ss = scan.nextLine();
	try{
	 num = Integer.parseInt(ss);
	 System.out.println("Value: " + num);
	}
	catch(NumberFormatException e){
	System.out.println("Error!!!");
	}
	
	}
}