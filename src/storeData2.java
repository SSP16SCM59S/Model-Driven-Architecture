import java.io.*;
import java.util.*;

public class storeData2 extends storeData
{
	//This overrides super class to store data of account2 during opening of account
	public void storeData(Datastore obj)
	{
		obj.setBalance_acc2(obj.getTemp_bal_acc2());
		obj.setPin_acc2(obj.getTemp_pin_acc2());
		obj.setId_acc2(obj.getTemp_id_acc2());
	}
	
}
