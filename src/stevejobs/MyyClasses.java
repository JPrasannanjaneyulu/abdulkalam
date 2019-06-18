package stevejobs;

public class MyyClasses 
{
	//data members
	int x;
	float y;
	char z;
	String w;
	//constructor methods
	public MyyClasses()
	{
		x=10;
		y=(float) 2.9;
		z='q';
		w="abdul kalam";
	}
	//constructor with arguments
	public MyyClasses(int a,String b)
	{
		x=a;
		y=(float)2.9;
		z='q';
		w=b;
	}
	//General methods
	public void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
	}
}
