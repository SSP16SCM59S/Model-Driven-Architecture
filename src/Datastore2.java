import java.io.*;
import java.util.*;

public class Datastore2 extends Datastore 
{

	//Adds deposit to balance
		public void addBalance()
		{
			this.setBalance_acc2(this.getBalance_acc2() + this.getTemp_d_acc2());
		}

		//Removes withdrawal amount from balance 
		public void subBalance()
		{
			this.setBalance_acc2(this.getBalance_acc2() - this.getTemp_w_acc2());
		}
}
