import java.io.*;
import java.util.*;

//DataStore for account1
public class Datastore1 extends Datastore
{
	
	//Adds deposit to balance
	public void addBalance()
	{
		this.setBalance(this.getBalance() + this.getTemp_d());
	}

	//Removes withdrawal amount from balance 
	public void subBalance()
	{
		this.setBalance(this.getBalance() - this.getTemp_w());
	}

	//adds fine to withdrawal amount
	public void fine()
	{
		this.setBalance(this.getBalance() - 20);
	}
	

}
