abstract class Area
{
	abstract void print(int a);
	void pr(String s)
	{
		System.out.println("Shape: "+s);
	}

}

class Circle extends Area{
	void print(int a)
	{

		System.out.println("Area: "+ (3.17*a*a));
	}
	void met()
	{
		System.out.println("Test");
	}

}
class Square extends Area
{
	 void print(int a)
	{
		System.out.println("Area: "+(a*a));
	}
}
class AbsCls
{
	public static void main(String[] args) {
		Area c = new Circle();
		c.print(3);
		c.pr("Circle");
		Area s = new Square();
		s.print(4);
		s.pr("Square");
		//c.met();
	}
}


