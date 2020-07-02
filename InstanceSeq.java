class A
{
	A()
	{
		System.out.println("Class A");
	}

	{
		System.out.println("Instance A");
	}
}
class B
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