import java.io.*;
import java.util.*;

public abstract class AbstractFactory
{
	//Abstract functions which enable the Sub classes to implement the functions
	
	abstract belowminbalmsg getbelowminbalmsg();
	abstract close getclose();
	abstract Datastore getDatastore();
	abstract displayBalance getdisplayBalance();
	abstract displayMenu getdisplayMenu();
	abstract makeDeposit getmakeDeposit();
	abstract makewithdrawl getmakewithdrawl();
	abstract penalty getpenalty();
	abstract storeData getstoreData();
	abstract toomanyattemptsmsg gettoomanyattemptsmsg();
	abstract wrongIdMessage getwrongIdMessage();
	abstract wrongpinmsg getwrongpinmsg();
}
