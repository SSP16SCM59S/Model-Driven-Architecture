import java.io.*;
import java.util.*;

public class CheckPin extends States {
	
	public CheckPin(EFSM e,AbstractFactory a,Datastore d)
	{
		super(e,a,d);
	}
	
	public void incorrectPin(int max)
	{
		if(obj.attempts > max)
		{
			obj1.toomanyattemptsmsg();//Displays max attempts reached
			obj.newState(1);//state is changed to Idle
		}
		else
		{
			obj1.wrongpinmsg();//Displays incorrect pin error
		}
	}
	
	public void logout()
	{
		obj.newState(1);//state is changed to Idle
	}
	
	public void correctPinAboveMin()
	{
		obj1.displayMenu();//display menu to user
		obj.newState(3);//state is changed to ready
	}
	
	public void correctPinBelowMin()
	{
		obj1.displayMenu();//display menu to user
		obj.newState(6);// state is changed to overdrawn
	}

}
