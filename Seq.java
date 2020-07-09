class A
{
	A()
	{
		System.out.println("Class A");
	}

	{
		System.out.println("Instance A");       //instance will run irst then constructor
	}
}
class B extends A
{
	B()
	{
		System.out.println("Class B");

	}
	{
		System.out.println("Instance B");
	}
}

class Seq
{
	public static void main(String[] args) {
		B b =new B();
	}
}