import java.io.*;
import java.util.*;

public class EFSM 
{
	public int attempts; // Max attempts when asking pin
	public States st[];// Array to maintain all states for Account 1 & 2
	public States state; //To maintain current state
	
	public EFSM()
	{
		attempts = 0;
	}
	
	public States newState(int n)
	{
		state = st[n];//Gets the current State
		return state;//Returns the state 
	}
	
	public void open()
	{	System.out.println("reached efsm open");
		state.open();//Opens the account with this state
	}
	
	public void login()
	{
		state.login();//logins to the account with this state
	}

	public void wrongLogin()
	{
		state.wrongLogin();// Displays Incorrect ID error message during login
	}
	
	public void incorrectPin(int max)
	{
		state.incorrectPin(max); // Displays Incorrect Pin error message during login 
	}
	
	public void correctPinAboveMin()
	{
		state.correctPinAboveMin();//Moves to Ready State
	}
	
	public void correctPinBelowMin()
	{
		state.correctPinBelowMin();// Moves to overdrawn state
	}
	
	public void deposit()
	{
		state.deposit();//Deposits the sum
	}
	
	public void withdraw()
	{
		state.withdraw();//withdraws amount if bal above min
	}
	
	public void aboveMin()
	{
		state.aboveMin();//checks if bal is above min and moves to ready state
	}
	
	public void belowMin()
	{
		state.belowMin();//checks if bal is below min and moves to overdrawn state
	}
	
	public void restrictWithdraw()
	{
		state.restrictWithdraw();//prevents user from withdrawing
	}
	
	public void balance()
	{
		state.balance();//displays balance
	}
	
	public void logout()
	{
		state.logout();//logs out and moves to idle
	}
	
	public void lock()
	{
		state.lock();//moves to lock state
	}
	
	public void wrongLock()
	{
		state.wrongLock();// checks pin if incorrect stays in same state displays error message
	}
	
	public void unlock()
	{
		state.unlock();//moves to unlock state after pin matches
	}
	
	public void wrongUnlock()
	{
		state.wrongUnlock();//stays in the same state displays error message
	}
	
	public void close()
	{
		state.close();//moves to closed state
	}
	
	public void suspend()
	{
		state.suspend();// moves to suspend state
	}
	
	public void activate()
	{
		state.activate();//moves to ready state
	}

}
