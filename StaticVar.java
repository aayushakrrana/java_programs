class A
{
	static int x=0 ;
	int b=0;
	A()
	{
		x++;
		b++;
	}
	void show()
	{
		System.out.println("X= " + x + " B= " + b);
		System.out.println("------------");
	}
}
class StaticVar
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.show();
		A a2 = new A();
		a2.show();
		A a3 = new A();
		a3.show();
		A a4 = new A();
		a4.show();
		A a5 = new A();
		a5.show();
		A a6 = new A();
		a6.show();
	}
}