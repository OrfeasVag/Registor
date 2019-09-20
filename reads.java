package registor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class reads
{
	static Scanner numb = new Scanner(System.in);
	static Scanner strg = new Scanner(System.in);
	static Scanner lin = new Scanner(System.in);
	
	public reads(){
		
	}
public static int readInt()
{
	boolean go=true;
	int num = -1;
	while(go)
	{
	 try
	 {
	  numb.reset();
	  System.out.print("Input : ");
	  num = numb.nextInt();
	  go=false;
	 }
	 catch(InputMismatchException ex)
	 {
		go=true;
		System.out.println("- ERROR - Bad Input Try Again.");
		numb.next();
		
	 }
	}
	
	return num;
}


public static String readLine()
{
	boolean go=true;
	String line = " ";
	while(go)
	{
	 try
	 {
		 lin.reset();
	  System.out.print("Input : ");
	  line = lin.nextLine();
	  go=false;
	 }
	 catch(InputMismatchException ex)
	 {
		go=true;
		System.out.println("- ERROR - Bad Input Try Again.");
		lin.next();
		
	 }
	}
	return line;
}

}
