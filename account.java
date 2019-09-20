package registor;

public class account 
{
	String username = "Default Username";
	String password = "Default Password";
	int id = 0 ;
	
	//Costructor
	public account()
	{}
	public account(String username,String password,int id)
	{
		this.username=username;
		this.password=password;
		this.id=id;
	}
	
	//Username
    void setUsername(String username)
	{
		this.username = username;
	}
    String getUsername()
    {
    	return username;
    }
    
    //Password
    void setPassword(String password)
    {
    	this.password = password;
    }
    String getPassword()
    {
    	return password;
    }
    
    //Id
    void setId(int id)
    {
    	this.id=id;
    }
    int getId()
    {
    	return id;
    }
    
    public String toString()
    {
    	return "ID : ("+id+") , "+"Username : ("+username+") , Password : ("+password+") .";
    }

}
