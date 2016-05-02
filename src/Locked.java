import java.io.*;
import java.util.*;
public class Locked extends States{

	public Locked(EFSM e,AbstractFactory a,Datastore d)
	{
		super(e,a,d);
	}
	
	public void unlock()
	{
		obj.newState(5);//state is changed to S2
	}
	
	public void wrongUnlock()
	{
		obj1.wrongpinmsg();//Incorrect Pin Error
	}
	
	
}
