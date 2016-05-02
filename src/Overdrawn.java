import java.io.*;
import java.util.*;
public class Overdrawn extends States{

	public Overdrawn(EFSM e,AbstractFactory a,Datastore d)
	{
		super(e,a,d);
	}
	
	public void lock()
	{
		obj.newState(7);//state is changed to Locked
	}
	
	public void wrongLock()
	{
		obj1.wrongpinmsg();//Incorrect Pin Error
	}
	
	public void balance()
	{
		obj1.displayBalance();//Shows Balance
	}
	
	public void logout()
	{
		obj.newState(1);//state is changed to Idle
	}
	
	public void withdraw()
	{
		obj1.belowminbalmsg();//Display Balance is less than min
	}
	
	public void deposit()
	{
		obj1.makeDeposit();//Deposit is performed
		obj.newState(4);//state is changed to S1
	}
	

}
