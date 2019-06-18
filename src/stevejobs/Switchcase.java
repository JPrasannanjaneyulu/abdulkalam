package stevejobs;

import java.util.Scanner;

public class Switchcase 
{
	public static void main(String[] args) 
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day number");
		int x=sc.nextInt();
		//switch
		switch(x)
		{
		case 1:
			System.out.println("SunDay");
			break;
		case 2:
			System.out.println("MonDay");
			break;
		case 3:
			System.out.println("TuesDay");
			break;
		case 4:
			System.out.println("WednesDay");
			break;
		case 5:
			System.out.println("ThursDay");
			break;
		case 6:
			System.out.println("FriDay");
			break;
		case 7:
			System.out.println("SaturDay");
			break;
		default:
			System.out.println("wrong day");
		}
	}

}
