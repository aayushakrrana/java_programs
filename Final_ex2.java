final class A
{
	final int x=10;
	A()
	{
		System.out.println(++x);
		int b=x+5;
		System.out.println(b);
	} 
}
class B extends A
{
	B()
	{
		System.out.println("Class B");
	}
}
class Final_ex2
{
	public static void main(String[] args) {
		B b= new B();
	}
}