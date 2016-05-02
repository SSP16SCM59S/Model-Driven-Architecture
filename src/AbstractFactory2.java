import java.io.*;
import java.util.*;

//This class implements methods of account2
public class AbstractFactory2 extends AbstractFactory
{

	belowminbalmsg getbelowminbalmsg() {
		// TODO Auto-generated method stub
		belowminbalmsg obj = new belowminbalmsg();// returns object to implement a message for balance below minimum for account2
		return obj;
	}

	close getclose() {
		// TODO Auto-generated method stub
		close obj = new close();// returns an object to implement the close function for account 2
		return obj;
	}

	Datastore getDatastore() {
		// TODO Auto-generated method stub
		Datastore2 obj = new Datastore2();// returns object to implement variables for account2		
		return obj;
	}

	displayBalance getdisplayBalance() {
		// TODO Auto-generated method stub
		displayBalance2 obj = new displayBalance2();// returns object to show balance for account2
		return obj;
	}

	displayMenu getdisplayMenu() {
		// TODO Auto-generated method stub
		displayMenu2 obj = new displayMenu2();// returns object to display menu for account 2
		return obj;
	}

	makeDeposit getmakeDeposit() {
		// TODO Auto-generated method stub
		makeDeposit obj = new makeDeposit();// returns object to implement deposit function for account 2
		return obj;
	}

	makewithdrawl getmakewithdrawl() {
		// TODO Auto-generated method stub
		makewithdrawl obj = new makewithdrawl(); // returns object to implement withdrawal function for account 2
		return obj;
	}

	penalty getpenalty() {
		// TODO Auto-generated method stub
		return null;// penalty is not implemented in account 2
	}

	storeData getstoreData() {
		// TODO Auto-generated method stub
		storeData2 obj = new storeData2();// returns object to store data of account 2
		return obj;
	}

	toomanyattemptsmsg gettoomanyattemptsmsg() {
		// TODO Auto-generated method stub
		toomanyattemptsmsg obj = new toomanyattemptsmsg();// returns object to display a message if max attempts have been reached
		return obj;
	}

	wrongIdMessage getwrongIdMessage() {
		// TODO Auto-generated method stub
		wrongIdMessage obj = new wrongIdMessage();// returns an object to display a message if invalid id is entered
		return obj;
	}

	wrongpinmsg getwrongpinmsg() {
		// TODO Auto-generated method stub
		wrongpinmsg obj = new wrongpinmsg();// returns an object to display a message if invalid pin is entered
		return obj;
	}

}
