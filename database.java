package registor;

import java.util.ArrayList;

public class database
{
	static ArrayList <account> accountl = new ArrayList<account>();
	static int id = accountl.size();

	 static void addAccount(account acc)
	 {
		 boolean exists = false;
		 for (account item : accountl) 
		 {
			if(acc.getUsername().equalsIgnoreCase(item.getUsername()))
			{
			  exists = true;
			  System.out.println("An Account with the Username : "+acc.getUsername()+" already exists.");
			}
		 }
			if(exists==false)
			{
			  accountl.add(acc);	
			}
		id++; 
	 }
	 
	 static void removeAccount(String name)
	 {
		boolean exists = false;
		try
		{
	     for(int i=0;i<accountl.size();i++)
		 {
			if(name.equalsIgnoreCase(accountl.get(i).getUsername()))
			{
			  exists = true;
			  System.out.println("The Account with the Username : "+name+" will now be removed.");
			  accountl.remove(accountl.get(i));
			}
		 }
		}
		catch(Exception e)
		{	
		  System.out.println("----------------");
		  System.out.println(e);
		  System.out.println("----------------");
		}
		if(exists==false)
		{
		  System.out.println("Username : "+name+" has not been found.");	
		}
	 }
	 static void displayAccount(String name)
	 {
		 
	 }
	 static void displayAllAccounts()
	 {
		 System.out.println("Printing All Accounts");
		 for(account item : accountl )
			{
			 System.out.println(item);
			} 
		 System.out.println("");
	 }
	
}



