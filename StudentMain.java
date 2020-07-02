class Student1
{
	int h,e,m;
	Student1()
	{
		h=0;e=0;m=0;
	}
	Student1(int h1,int e1,int m1)
	{
		h=h1;
		e=e1;
		m=m1;

	}
	Student1(Student1 s)
	{
		h=s.h;
		e=s.e;
		m=s.m;
	}

	void total()
	{
		System.out.println("Total Marks: "+ h + " + " + e + " + " + m + " = " + (h+e+m));
	}
}

class StudentMain
{
	public static void main(String args[]){
	Student1 s1 = new Student1();
	s1.total();
	Student1 s2 = new Student1(11, 12, 13);
	s2.total();
	Student1 s3 = new Student1(10, 14, 15);
	s3.total();
	Student1 s4 = new Student1(s2);
	s4.total();
}
}