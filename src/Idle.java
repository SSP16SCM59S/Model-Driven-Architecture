import java.io.*;
import java.util.*;

public class Idle extends States{
	
	public Idle(EFSM e,AbstractFactory a,Datastore d)
	{
		super(e,a,d);//sets new parameters
	}
	
	public void login()
	{
		obj.newState(2);//State is changed to CheckPin
	}
	
	public void wrongLogin()
	{
		obj1.wrongIdMessage();//Displays a message if id is incorrect
	}

}
