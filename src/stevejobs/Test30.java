package stevejobs;

public class Test30 
{
	public static void main(String[] args) 
	{
		String x="madam";
		String y="";
		for(int i=x.length()-1;i>=0;i--)
		{
			char z=x.charAt(i);
			y=y+z;
		}
		if(x.equals(y))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	}

}
