import java.io.*;
import java.util.*;

public class Ready extends States{

	
	public Ready(EFSM e,AbstractFactory a,Datastore d)
	{
		super(e,a,d);
	}
	
	public void logout()
	{
		obj.newState(1);//state is changed to Idle
	}
	
	public void suspend()
	{
		obj.newState(8);//state is changed to suspended
	}
	
	public void withdraw()
	{
		obj1.makewithdrawl();
		obj.newState(4);//state is changed to s1
	}
	
	public void lock()
	{
		obj.newState(7);//state is changed to locked
	}
	
	public void deposit()
	{
		obj1.makeDeposit();//Deposit is performed
	}
	
	public void wrongLock()
	{
		obj1.wrongpinmsg();//Incorrect Pin
	}
	
	public void balance()
	{
		obj1.displayBalance();//Balance is Displayed
	}
	
	public void restrictWithdraw()
	{
		obj1.belowminbalmsg();//balance below min
	}
}
