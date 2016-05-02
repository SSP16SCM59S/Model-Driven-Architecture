import java.io.*;
import java.util.*;

public class States //This Class Acts as a super class to all state classes which are subclasses
{
	public EFSM obj;
	public outputProcessor obj1;
	
	public States(EFSM e,AbstractFactory a,Datastore d)
	{
		
		obj = e;
		obj1 = new outputProcessor(a,d);//This points to the object of output processor
	}
	
	public States()//Empty Constructor
	{
		
	}
	
	public void open()
	{
		
	}
	
	public void login()
	{
		
	}
	
	public void wrongLogin()
	{
		
	}
	
	public void incorrectPin(int max)
	{
		
	}
	
	public void correctPinAboveMin()
	{
		
	}
	
	public void correctPinBelowMin()
	{
		
	}
	
	public void deposit()
	{
		
	}
	
	public void withdraw()
	{
		
	}
	
	public void aboveMin()
	{
		
	}
	
	public void belowMin()
	{
		
	}
	
	public void restrictWithdraw()
	{
		
	}
	
	public void balance()
	{
		
	}
	
	public void logout()
	{
		
	}
	
	public void lock()
	{
		
	}
	
	public void wrongLock()
	{
		
	}
	
	public void unlock()
	{
		
	}
	
	public void wrongUnlock()
	{
		
	}
	
	public void close()
	{
		
	}
	
	public void suspend()
	{
		
	}
	
	public void activate()
	{
		
	}
	
	
	
	
}
