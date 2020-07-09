class Area
{
	int a,b,ar;
	Area(int a1,int b1)
	{
		a=a1;
		b=b1;
	}

	int getArea()
	{
		ar=a*b;
		return ar;
	}	
}
class Volume extends Area
{	
	int h,vol;
	Volume(int l1,int b1,int h1)
	{
		super(l1,b1);
		h=h1;
	}
	int getVolume()
	{
		vol=getArea()*h;
		return vol;
	}
	/*void printVolume()
	{
		System.out.println("Volume: " + vol);
	}*/
}
class box extends Volume
{
	int s;
	box(int l2,int b2,int h2,int s1)
	{
		super(l2,b2,h2);
		s=s1*s1*s1;
	}
	
	int NoOfBox()
	{
		return (getVolume()/s);
	}

}

class AreaVol
{
	public static void main(String[] args) {

		/*Volume v1 = new Volume(2,2,3);
		System.out.println("Area: " + v1.getArea());

		v1.getVolume();
		v1.printVolume();*/

		box b = new box(4,2,6,2);
		b.getVolume(); 
		System.out.println("Volume: " + b.getVolume());
		
		System.out.println("No Of Boxes: " + b.NoOfBox());
	}
}