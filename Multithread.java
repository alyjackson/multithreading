package accessspecifier;
import java.util.*;
import java.lang.*;

public class Multithread extends Thread{
	
	public void run()
	{
		int count=0;
		while(true)
		{
		try 
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			System.out.println("sorry");
			
		}
		System.out.println("yo yo "+count++);
		}
	}

	public static void main(String[] args) {
		Multithread m1= new Multithread();
		m1.start();
		Multithread m2= new Multithread();
		m2.start();
	}

}
