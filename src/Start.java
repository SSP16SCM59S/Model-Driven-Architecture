import java.io.*;
import java.util.*;

public class Start extends States// this is the state at which user begins operation
{
	public Start(EFSM e,AbstractFactory a,Datastore d)
	{
		super(e,a,d);//sets new parameters
	}
	
	public void open()
	{
		//System.out.println("reached start state");
		obj1.storeData();//stored data
		obj.newState(1);//State is changed to Idle
	}
}
