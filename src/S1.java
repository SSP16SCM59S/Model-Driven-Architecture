import java.io.*;
import java.util.*;
public class S1 extends States{
	
	public S1(EFSM e,AbstractFactory a,Datastore d)
	{
		super(e,a,d);
	}
	
	public void aboveMin()
	{
		obj.newState(3);//state is changed to Ready
	}
	
	public void belowMin()
	{
		obj1.penalty();
		obj.newState(6);//state is changed to Overdrawn
	}
}
