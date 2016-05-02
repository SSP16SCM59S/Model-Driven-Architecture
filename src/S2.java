import java.io.*;
import java.util.*;
public class S2 extends States{
	public S2(EFSM e,AbstractFactory a,Datastore d)
	{
		super(e,a,d);
	}
	
	public void aboveMin()
	{
		obj.newState(3);//state is changed to Ready
	}
	
	public void belowMin()
	{
		obj.newState(6);//state is changed to Overdrawn
	}
}
