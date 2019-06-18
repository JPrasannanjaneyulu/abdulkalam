package stevejobs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class Jsonex 
{
	public static void main(String[] args) throws IOException 
	{
		//Get input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter address");
		String x=sc.nextLine();
		System.out.println("Enter sensor");
		String y=sc.nextLine();
		//specify REST service WADL along with inputs
		URL u=new URL("http://maps.googleapis.com/maps/api/geocode/json?address="+x+"&sensor="+y);
		//Connect to service
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		//Get response from service
		InputStreamReader ir=new InputStreamReader(con.getInputStream());
		//Store response in buffer
		BufferedReader br=new BufferedReader(ir);
		//Display response line by line
		String z;
		while((z=br.readLine())!=null)
		{
			System.out.println(z);
		}
		//Disconnect from service
		con.disconnect();
	}

}
