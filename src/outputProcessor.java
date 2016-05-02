import java.io.*;
import java.util.*;
public class outputProcessor
{
	
	AbstractFactory a;
	Datastore d;
	
	//objects for actions
	belowminbalmsg b_obj;
	close c_obj;
	displayBalance db_obj;
	displayMenu dm_obj;
	makeDeposit md_obj;
	makewithdrawl mw_obj;
	penalty p_obj;
	storeData s_obj;
	toomanyattemptsmsg t_obj;
	wrongIdMessage wim_obj;
	wrongpinmsg wpm_obj;

	public outputProcessor(AbstractFactory a1,Datastore d1)
	{
		this(a1);// Calls the constructor
		d = d1;// Assigns Datastore object
	}
	
	public outputProcessor(AbstractFactory a1) 
	{
		// TODO Auto-generated constructor stub
		// Retrieves objects of actions for appropriate account 
		
		b_obj = a1.getbelowminbalmsg();
		c_obj = a1.getclose();
		db_obj = a1.getdisplayBalance();
		dm_obj = a1.getdisplayMenu();
		dm_obj = a1.getdisplayMenu();
		md_obj = a1.getmakeDeposit();
		mw_obj = a1.getmakewithdrawl();
		p_obj = a1.getpenalty();
		s_obj = a1.getstoreData();
		t_obj = a1.gettoomanyattemptsmsg();
		wim_obj = a1.getwrongIdMessage();
		wpm_obj = a1.getwrongpinmsg();
	}

	//Stored Data of User with respect to account
	public void storeData()
	{
		s_obj.storeData(d);
	}
	
	//Prints an error message if incorrect id is entered
	public void wrongIdMessage()
	{
		wim_obj.wrongIdMessage();
	}
	
	//Prints an error message if max attempts is reached
	public void toomanyattemptsmsg()
	{
		t_obj.toomanyattemptsmsg();
	}
	
	//Prints an error message if balance is below minimum
	public void belowminbalmsg()
	{
		b_obj.belowminbalmsg();
	}

	//Prints an error message if incorrect pin is entered
	public void wrongpinmsg()
	{
		wpm_obj.wrongpinmsg();
	}
	
	//closes the account if account is of type 2
	public void close()
	{
		c_obj.close();
	}
	
	//Displays menu with respect to account type
	public void displayMenu()
	{
		dm_obj.displayMenu();
	}
	
	//allows users to make a deposit to their account
	public void makeDeposit()
	{
		md_obj.makeDeposit(d);
	}
	
	//Displays the current balance of the account
	public void displayBalance()
	{
		db_obj.displayBalance(d);
	}
	
	//allows users to make withdrawls from account
	public void makewithdrawl()
	{
		mw_obj.makewithdrawl(d);
	}
	
	//adds a penalty if account type is 1 and balance is below min
	public void penalty()
	{
		p_obj.penalty(d);
	}
}
