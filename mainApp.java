package registor;
public class mainApp 
{
	public static void main(String []arg)
	{
		System.out.println("- Registor -");
		int choice = 0;
		String n,p;
		boolean go = true;
		while(go)
		{
			System.out.println("Available Choices : 1 - Add Account || 2 - Remove Account || 3 - Display All Accounts || Etc - Exit");
			choice =  reads.readInt();
			switch(choice)
			{
			default :
				System.out.println("- EXIT - Now Closing.");
				go=false;
			break;
			case 1 :
				System.out.println("- Add Account -");
				System.out.println("Username");
				n = reads.readLine();
				System.out.println("Password");
				p = reads.readLine();
				account acc = new account(n,p, database.id);
				database.addAccount(acc);
			break;
			case 2:
				System.out.println("- Remove Account -");
				System.out.println("Username");
				n = reads.readLine();
				database.removeAccount(n);
			break;
			case 3: 
				database.displayAllAccounts();
			break;
			}
		}
	}
}