class A
{
	void print()
	{
		System.out.println("Class A simp");
	}
	void print1()
	{
		System.out.println("Class A1");
	}
	final void fprint()
	{
		System.out.println("Final Class A");
	}
}
class B extends A
{
	void print1()
	{
		System.out.println("Class B");

	}
	void fprint()
	{
		System.out.println("Class B (final)");
	}
}
class Final_ex
{
	public static void main(String[] args) {
		B b =new B();
		b.print();
		b.print1();
		b.fprint();
	}
}