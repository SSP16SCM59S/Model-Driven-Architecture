import java.io.*;
import java.util.*;

public class storeData1 extends storeData
{
	//This overrides super class to store data of account1 during opening of account
	public void storeData(Datastore obj)
	{
		//System.out.println("reached store");
		obj.setBalance(obj.getTemp_a());
		obj.setPin(obj.getTemp_p());
		obj.setId(obj.getTemp_y());
	}
}
