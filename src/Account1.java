import java.io.*;
import java.util.*;

public class Account1 
{
	public EFSM efsm_obj;
	public Datastore d_obj;
	public AbstractFactory ab_obj;

	//Constructor initializing the data
	public Account1(EFSM ob,AbstractFactory ab)
	{
		efsm_obj = ob; //initializes efsm obj to the one which is passed for acc1
		d_obj = ab.getDatastore();//gets the datastore object for account1
		ab_obj = ab;
		efsm_obj.state = new States(efsm_obj,ab_obj,d_obj);// calls the constructor initializing the objects for each state
					
		efsm_obj.st = new States[10];//Initializing the states
		efsm_obj.st[0] = new Start(efsm_obj,ab_obj,d_obj);
		efsm_obj.st[1] = new Idle(efsm_obj,ab_obj,d_obj);
		efsm_obj.st[2] = new CheckPin(efsm_obj,ab_obj,d_obj);
		efsm_obj.st[3] = new Ready(efsm_obj,ab_obj,d_obj);
		efsm_obj.st[4] = new S1(efsm_obj,ab_obj,d_obj);
		efsm_obj.st[5] = new S2(efsm_obj,ab_obj,d_obj);
		efsm_obj.st[6] = new Overdrawn(efsm_obj,ab_obj,d_obj);
		efsm_obj.st[7] = new Locked(efsm_obj,ab_obj,d_obj);
		efsm_obj.st[8] = new Suspended(efsm_obj,ab_obj,d_obj);
		efsm_obj.st[9] = new Closed(efsm_obj,ab_obj,d_obj);	
		
		efsm_obj.state = efsm_obj.st[0];
	}
	
	public void open(String p,String y,float a)
	{
		d_obj.setTemp_a(a);//Stores Initial Balance in temporary variable of Datastore
		d_obj.setTemp_p(p);//Stores Pin in temporary variable of Datastore
		d_obj.setTemp_y(y);//Stores ID in temporary variable of Datastore
		efsm_obj.open();
	}
	
	public void login(String id)
	{
		if(id.equals(d_obj.getId()))
		{
			efsm_obj.login();// The login function of MDA EFSM is called 
		}
		else
		{
			efsm_obj.wrongLogin();//The wrongLogin function of MDA EFSM is called
		}
	}
	
	public void logout()
	{
		efsm_obj.logout();// The logout function of MDA EFSM is called 
	}
	
	public void balance()
	{
		efsm_obj.balance();//The balance function of MDA EFSM is invoked
	}
	
	public void pin(String pin)
	{
		if(pin.equals(d_obj.getPin()) && d_obj.getBalance() >= 500)
		{
			efsm_obj.correctPinAboveMin();// The EFSM function correctpinabovemin is called and moved to ready state
		}
		else if(pin.equals(d_obj.getPin()) && d_obj.getBalance() < 500)
		{
			efsm_obj.correctPinBelowMin();// The EFSM function correctpinbelowmin is called and moved to Overdrawn state
		}
		else
		{
			efsm_obj.attempts++;//Increase the no of attempts by 1
			efsm_obj.incorrectPin(3);// Set max attempts to 3
		}
	}
	
	public void deposit(float d)
	{
		d_obj.setTemp_d(d);// Sets deposit amount to temporary variable of datastore
		efsm_obj.deposit();//the EFSM function deposit is called
		
		if(d_obj.getBalance() < 500)
		{
			efsm_obj.belowMin();//Moves to Overdrawn State
		}
		else
		{
			efsm_obj.aboveMin();//Stays in ready state
		}
	}
	
	public void withdraw(float w)
	{
		d_obj.setTemp_w(w);// Sets Withdrawl amount to temporary variable of datastore
		efsm_obj.withdraw();//the EFSM function withdraw is called
		
		if(d_obj.getBalance() < 500)
		{
			efsm_obj.belowMin();//Moves to Overdrawn State
		}
		else
		{
			efsm_obj.aboveMin();//Stays in same state
		}
	}
	
	public void lock(String pin)
	{
		if(pin.equals(d_obj.getPin()))
		{
			efsm_obj.lock();//Moves to locked state
		}
		else
		{
			efsm_obj.wrongLock();//Stays in the same state
		}
	}
	
	public void unlock(String pin)
	{
		if(pin.equals(d_obj.getPin()) && d_obj.getBalance() < 500)
		{
			efsm_obj.unlock();//Unlock function of EFSM is called
			efsm_obj.belowMin();// moves to overdrawn state
		}
		else if(pin.equals(d_obj.getPin()) && d_obj.getBalance() >= 500)
		{
			efsm_obj.unlock();//Unlock function of EFSM is called
			efsm_obj.aboveMin();//moves to Ready state
		}
		else
		{
			efsm_obj.wrongUnlock();//Incorrect pin and MDA EFSM function wrong unlock is called
		}
	}

}
