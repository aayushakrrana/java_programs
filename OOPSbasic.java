class Student
{
	int m,e,h;

	void setData(int m1,int e1,int h1)
	{
		m=m1;
		e=e1;
		h=h1;
	}
	void total()
	{
		int t=m+e+h;
		System.out.println("Total':"+ t);
	}
}
class OOPSbasic
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.setData(5,6,9);
		s.total();
	}
}