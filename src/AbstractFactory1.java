import java.io.*;
import java.util.*;

//This class implements methods of account1 
public class AbstractFactory1 extends AbstractFactory
{

	belowminbalmsg getbelowminbalmsg() 
	{
		// TODO Auto-generated method stub
		belowminbalmsg obj = new belowminbalmsg();// returns object to implement a message for balance below minimum for account1
		return obj;
	}

	close getclose() 
	{
		// TODO Auto-generated method stub
		return null;// Close is not implemented in account 1
	}

	Datastore getDatastore() 
	{
		// TODO Auto-generated method stub
		Datastore1 obj = new Datastore1();// returns object to implement variables for account1		
		return obj;
	}

	displayBalance getdisplayBalance() 
	{
		// TODO Auto-generated method stub
		displayBalance1 obj = new displayBalance1();// returns object to show balance for account1
		return obj;
	}

	displayMenu getdisplayMenu()
	{
		// TODO Auto-generated method stub
		displayMenu1 obj = new displayMenu1();// returns object to display menu for account 1
		return obj;
	}

	makeDeposit getmakeDeposit() 
	{
		// TODO Auto-generated method stub
		makeDeposit obj = new makeDeposit();// returns object to implement deposit function for account 1
		return obj;
	}

	makewithdrawl getmakewithdrawl() 
	{
		// TODO Auto-generated method stub
		makewithdrawl obj = new makewithdrawl(); // returns object to implement withdrawal function for account 1
		return obj;
	}

	penalty getpenalty()
	{
		// TODO Auto-generated method stub
		penalty obj = new penalty();// returns object to implement the penalty function of account 1
		return obj;
	}

	storeData getstoreData() 
	{
		// TODO Auto-generated method stub
		storeData1 obj = new storeData1();// returns object to store data of account 1
		return obj;
	}

	toomanyattemptsmsg gettoomanyattemptsmsg() 
	{
		// TODO Auto-generated method stub
		toomanyattemptsmsg obj = new toomanyattemptsmsg();// returns object to display a message if max attempts have been reached
		return obj;
	}

	wrongIdMessage getwrongIdMessage() 
	{
		// TODO Auto-generated method stub
		wrongIdMessage obj = new wrongIdMessage();// returns an object to display a message if invalid id is entered
		return obj;
	}

	wrongpinmsg getwrongpinmsg() 
	{
		// TODO Auto-generated method stub
		wrongpinmsg obj = new wrongpinmsg();// returns an object to display a message if invalid pin is entered
		return obj;
	}

}
