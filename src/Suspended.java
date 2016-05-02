import java.io.*;
import java.util.*;
public class Suspended extends States {
	
	public Suspended(EFSM e,AbstractFactory a,Datastore d)
	{
		super(e,a,d);
	}
	
	public void close()
	{
		obj.newState(9);//state is changed to Idle
		obj1.close();
	}
	
	public void balance()
	{
		obj1.displayBalance();// Balance is Displayed
	}
	
	public void activate()
	{
		obj.newState(3);//state is changed to Ready
	}
}
