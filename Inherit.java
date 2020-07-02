class A
{
	A(int a)
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	B()
	{
		super(1);
	}
}
class Inherit
{
	 public static void main(String[] args) {
		B a = new B();
	}
}