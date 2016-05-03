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
	
	public void open()//Abstract Method
	{
		
	}
	
	public void login()
	{//Abstract Method
		
	}
	
	public void wrongLogin()
	{
		//Abstract Method
	}
	
	public void incorrectPin(int max)
	{
		//Abstract Method
	}
	
	public void correctPinAboveMin()
	{
		//Abstract Method
	}
	
	public void correctPinBelowMin()
	{
		//Abstract Method
	}
	
	public void deposit()
	{
		//Abstract Method
	}
	
	public void withdraw()
	{
		//Abstract Method
	}
	
	public void aboveMin()
	{
		//Abstract Method
	}
	
	public void belowMin()
	{
		//Abstract Method
	}
	
	public void restrictWithdraw()
	{
		//Abstract Method
	}
	
	public void balance()
	{
		//Abstract Method
	}
	
	public void logout()
	{
		//Abstract Method
	}
	
	public void lock()
	{
		//Abstract Method
	}
	
	public void wrongLock()
	{//Abstract Method
		
	}
	
	public void unlock()
	{
		//Abstract Method
	}
	
	public void wrongUnlock()
	{
		//Abstract Method
	}
	
	public void close()
	{
		//Abstract Method
	}
	
	public void suspend()
	{
		//Abstract Method
	}
	
	public void activate()
	{
		//Abstract Method
	}
	
	
	
	
}
