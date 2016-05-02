import java.io.*;
import java.util.*;
public class Account2 
{
	public EFSM efsm_obj;
	public Datastore d_obj;
	public AbstractFactory ab_obj;
	
	//Constructor initializing the data
		public Account2(EFSM ob,AbstractFactory ab)
		{
			efsm_obj = ob; //initializes efsm obj to the one which is passed for acc2
			d_obj = ab.getDatastore();//gets the datastore object for account2
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
		
	
		public void OPEN(int p,int y,int a)
		{
			d_obj.setTemp_bal_acc2(a);//Stores Initial Balance in temporary variable of Datastore
			d_obj.setTemp_id_acc2(y);//Stores Pin in temporary variable of Datastore
			d_obj.setTemp_pin_acc2(p);//Stores ID in temporary variable of Datastore
			efsm_obj.open();
		}
		
		public void LOGIN(int id)
		{
			if(id == d_obj.getId_acc2())
			{
				efsm_obj.login();// The login function of MDA EFSM is called 
			}
			else
			{
				efsm_obj.wrongLogin();//The wrongLogin function of MDA EFSM is called
			}
		}
		
		public void LOGOUT()
		{
			efsm_obj.logout();// The logout function of MDA EFSM is called 
		}
		
		public void PIN(int pin)
		{
			if(pin == d_obj.getPin_acc2())
			{
				efsm_obj.correctPinAboveMin();// The EFSM function correctpinabovemin is called and moved to ready state
			}
			else
			{
				efsm_obj.attempts++;//Increase the no of attempts by 1
				efsm_obj.incorrectPin(2);// Set max attempts to 3
			}
		}
		
		public void BALANCE()
		{
			efsm_obj.balance();//The balance function of MDA EFSM is invoked
		}
		
		public void DEPOSIT(int sum)
		{
			d_obj.setTemp_d_acc2(sum);// Sets deposit amount to temporary variable of datastore
			efsm_obj.deposit();//the EFSM function deposit is called
		}
		
		public void WITHDRAW(int sum)
		{
			d_obj.setTemp_w_acc2(sum);// Sets Withdrawl amount to temporary variable of datastore
			
			if(d_obj.getBalance_acc2() > 0)
			{
				efsm_obj.withdraw();// The withdraw function of MDA EFSM is called
				efsm_obj.aboveMin();// stays in ready state
			}
			else
			{
				efsm_obj.restrictWithdraw();// if balance is not available then does not allow withdraw
			}
		}
		
		public void close()
		{
			efsm_obj.close();//The close function of MDA EFSM is invoked
		}
		
		public void suspend()
		{
			efsm_obj.suspend();//The suspend function of MDA EFSM is invoked
		}
		
		public void activate()
		{
			efsm_obj.activate();//The activate function of MDA EFSM is invoked
		}
		
		
}
