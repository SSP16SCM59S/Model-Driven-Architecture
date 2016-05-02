import java.io.*;
import java.util.*;

public class Driver 
{
	static Scanner sc;
	static int ac=0;
	static Driver dr_obj;
	int ch =0;
public static void main(String args[])	
{	
	
	Account1 ac1_obj = null;
	Account2 ac2_obj = null;
	dr_obj = new Driver();
	
	 dr_obj.asktype();
	
	 	if(ac != 1 && ac != 2)
	 	{
	 		System.out.println("Enter Either 1 or 2");
	 		dr_obj.asktype();
	 	}
	 	
	 	if(ac == 1)
	 	{
	 		AbstractFactory a_obj = new AbstractFactory1();//Creates an abstract factory object of account1
	 		EFSM efsm_obj = new EFSM();//Creates an mda efsm object
	 		ac1_obj = new Account1(efsm_obj,a_obj);//calls constructor of account1
	 	}
	 	
	 	else if(ac == 2)
	 	{
	 		AbstractFactory a_obj = new AbstractFactory2();//Creates an abstract factory object of account1
	 		EFSM efsm_obj = new EFSM();//Creates an mda efsm object
	 		ac2_obj = new Account2(efsm_obj,a_obj);//calls constructor of account1
	 	}
	 	
	 	for(;;)
	 	{
	 		if(ac == 1)
	 		{
	 			dr_obj.askinput1();
	 			dr_obj.Account1methods(ac1_obj);
	 		}
	 		else if(ac == 2)
	 		{
	 			dr_obj.askinput2();
	 			dr_obj.Account2methods(ac2_obj);
	 		}
	 	}
	
}

	public void asktype()
	{
		System.out.println("1.Account-1 \n2.Account-2");
		 sc = new Scanner(System.in);
		
		 	try
			{
				ac = sc.nextInt();	//User input for type of account
			}
			catch(Exception e)
			{
				System.out.println("Please enter a valid number");// catch exception if user enters anything other than integer
				dr_obj.asktype();
			}
	}
	
	public void askinput1()
	{
		System.out.println("0-Open\n1-Login\n2-Pin\n3-Deposit\n4-Withdraw\n5-Balance\n6-Lock\n7-Unlock\n8-Logout\n9-Quit");
		Scanner sc1 = new Scanner(System.in);
		try
		{
			 ch = sc1.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Please Enter a Valid Integer");
			dr_obj.askinput1();
		}
		
		if(ch < 0 || ch > 9)
		{
			System.out.println("Please Enter a Valid Input from the list");
			dr_obj.askinput1();
		}
	}
	
	public void askinput2()
	{
		System.out.println("0-OPEN\n1-LOGIN\n2-PIN\n3-DEPOSIT\n4-WITHDRAW\n5-BALANCE\n6-SUSPEND\n7-ACTIVATE\n8-LOGOUT\n9-CLOSE\n10-Quit");
		Scanner sc1 = new Scanner(System.in);
		try
		{
			 ch = sc1.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Please Enter a Valid Integer");
			dr_obj.askinput2();
		}
		
		if(ch < 0 || ch > 10)
		{
			System.out.println("Please Enter a Valid Input from the list");
			dr_obj.askinput2();
		}
	}
	
	public void Account1methods(Account1 ob)
	{	Scanner sc2 = new Scanner(System.in);
		
		switch(ch)
		{
		case 0: System.out.println("------Open(String y,String p,float a)------");
		System.out.println("Enter value of y");
		String id = sc2.next();
		System.out.println("Enter value of p");
		String pin = sc2.next();
		System.out.println("Enter value of a");

		float bal = sc2.nextFloat();
		
		
		ob.open(pin, id, bal);//Calls open function of account1
		break;
		
		case 1: System.out.println("------Login(String id)------");
		System.out.println("Enter Your ID");
		String uid = sc2.next();
		ob.login(uid);//calls login function of Account1
		break;
		
		case 2:System.out.println("------Pin(String pin)------");
		System.out.println("Enter your pin");
		String upin = sc2.next();
		ob.pin(upin);//Calls pin function of Account1
		break;
		
		case 3:System.out.println("------Deposit(float amount)------");
		System.out.println("Enter the amount to be deposited");
		float sum = sc2.nextFloat();
		ob.deposit(sum);//Calls Deposit function of Account1
		break;
		
		case 4:System.out.println("------Withdraw(float amount)------");
		System.out.println("Enter the amount to be withdrawn");
		float sum1 = sc2.nextFloat();
		ob.withdraw(sum1);//Calls Witdrawl function of Account1
		break;
		
		case 5:System.out.println("------Balance------");
		ob.balance();//Displays balance of Account1
		break;
		
		case 6:System.out.println("------Lock(String pin)------");
		System.out.println("Enter your pin");
		String lpin = sc2.next();
		ob.lock(lpin);//calls lock function of Account1
		break;
		
		case 7:System.out.println("------Unlock(String pin)------");
		System.out.println("Enter your pin");
		String u_pin = sc2.next();
		ob.unlock(u_pin);//Calls unlock function of Account1
		break;
		
		case 8:System.out.println("Logging out");
		ob.logout();//Calls logout function of Account1
		break;
		
		case 9:System.exit(0);
		}
		
	}
	
	public void Account2methods(Account2 ob)
	{
Scanner sc2 = new Scanner(System.in);
		
		switch(ch)
		{
		case 0:System.out.println("------Open(int y,int p,int a)------");
		System.out.println("Enter value of y");
		int id = sc2.nextInt();
		System.out.println("Enter value of p");
		int pin = sc2.nextInt();
		System.out.println("Enter value of a");
		int bal = sc2.nextInt();
		ob.OPEN(pin, id, bal);//calls open function of Account2
		break;
		
		case 1: System.out.println("------Login(int id)------");
		System.out.println("Enter Your ID");
		int uid = sc2.nextInt();
		ob.LOGIN(uid);//calls login function of Account2
		break;
		
		case 2:System.out.println("------Pin(int pin)------");
		System.out.println("Enter your pin");
		int upin = sc2.nextInt();
		ob.PIN(upin);//Calls pin function of Account2
		break;
		
		case 3:System.out.println("------Deposit(int amount)------");
		System.out.println("Enter the amount to be deposited");
		int sum = sc2.nextInt();
		ob.DEPOSIT(sum);//Calls Deposit function of Account2
		break;
		
		case 4:System.out.println("------Withdraw(int amount)------");
		System.out.println("Enter the amount to be withdrawn");
		int sum1 = sc2.nextInt();
		ob.WITHDRAW(sum1);//Calls Withdrawal function of Account2
		break;
		
		case 5:System.out.println("------Balance------");
		ob.BALANCE();//Displays balance of Account2
		break;
		
		case 6:System.out.println("------Suspend------");
		ob.suspend();//Calls Suspend function of Account2
		break;
		
		case 7:System.out.println("------Activate------");
		ob.activate();//Calls Activate function of Account2
		break;
		
		case 8:System.out.println("Logging out");
		ob.LOGOUT();//Calls logout function of Account2
		break;
		
		case 9:System.out.println("------Close------");
		ob.close();//Calls logout function of Account2
		break;
		
		case 10:System.exit(0);
		}

	}
}
