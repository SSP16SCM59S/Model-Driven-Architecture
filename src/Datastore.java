import java.io.*;
import java.util.*;

public class Datastore {
//variables for account 1
public String temp_p,temp_y,pin,id;
public float temp_a,balance,temp_d,temp_w;

//variables for account 2
public int pin_acc2,id_acc2,temp_pin_acc2,temp_id_acc2,balance_acc2,temp_bal_acc2,temp_d_acc2,temp_w_acc2;


//Account 1 Methods

//Retrieves Pin from temporary variable
public String getTemp_p() 
{
	return temp_p;
}

//Stores Pin in temporary variable
public void setTemp_p(String temp_p)
{
	this.temp_p = temp_p;
}

//Retrieves id from temporary variable
public String getTemp_y() 
{
	return temp_y;
}

//Stores id in temporary variable
public void setTemp_y(String temp_y) 
{
	this.temp_y = temp_y;
}

//Retrieves Pin 
public String getPin() 
{
	return pin;
}

//Stores Pin
public void setPin(String pin) 
{
	this.pin = pin;
}

//Retrieves ID
public String getId()
{
	return id;
}

//Stores ID
public void setId(String id)
{
	this.id = id;
}

//Retrieves Balance from temporary variable
public float getTemp_a()
{
	return temp_a;
}

//Stores Balance to temporary variable
public void setTemp_a(float temp_a) 
{
	this.temp_a = temp_a;
}

//Retrieves Balance
public float getBalance() 
{
	return balance;
}

//Stores Balance 
public void setBalance(float balance) 
{
	this.balance = balance;
}

//Retrieves Deposit amount from temporary variable
public float getTemp_d() 
{
	return temp_d;
}

//Stores Deposit amount to temporary variable
public void setTemp_d(float temp_d) 
{
	this.temp_d = temp_d;
}

//Retrieves Withdrawal amount from temporary variable
public float getTemp_w() 
{
	return temp_w;
}

//Stores withdrawal amount to temporary variable
public void setTemp_w(float temp_w)
{
	this.temp_w = temp_w;
}


//Account 2 

//Retrieves Pin 
public int getPin_acc2() 
{
	return pin_acc2;
}

//Stores Pin
public void setPin_acc2(int pin_acc2)
{
	this.pin_acc2 = pin_acc2;
}

//Retrieves ID 
public int getId_acc2()
{
	return id_acc2;
}

//Stores ID
public void setId_acc2(int id_acc2) 
{
	this.id_acc2 = id_acc2;
}

//Retrieves Pin from temporary variable
public int getTemp_pin_acc2() 
{
	return temp_pin_acc2;
}

//Stores Pin to temporary variable
public void setTemp_pin_acc2(int temp_pin_acc2) 
{
	this.temp_pin_acc2 = temp_pin_acc2;
}

//Retrieves ID from temporary variable
public int getTemp_id_acc2() 
{
	return temp_id_acc2;
}

//Stores ID to temporary variable
public void setTemp_id_acc2(int temp_id_acc2)
{
	this.temp_id_acc2 = temp_id_acc2;
}

//Retrieves Balance
public int getBalance_acc2() 
{
	return balance_acc2;
}

//Stores Balance 
public void setBalance_acc2(int balance_acc2) 
{
	this.balance_acc2 = balance_acc2;
}

//Retrieves Balance from temporary variable
public int getTemp_bal_acc2() 
{
	return temp_bal_acc2;
}

//Stores Balance to temporary variable
public void setTemp_bal_acc2(int temp_bal_acc2) 
{
	this.temp_bal_acc2 = temp_bal_acc2;
}

//Retrieves Deposit amount from temporary variable
public int getTemp_d_acc2() 
{
	return temp_d_acc2;
}

//Stores Deposit amount to temporary variable
public void setTemp_d_acc2(int temp_d_acc2) 
{
	this.temp_d_acc2 = temp_d_acc2;
}

//Retrieves Withdrawal amount from temporary variable
public int getTemp_w_acc2()
{
	return temp_w_acc2;
}

//Stores Withdrawal amount to temporary variable
public void setTemp_w_acc2(int temp_w_acc2) 
{
	this.temp_w_acc2 = temp_w_acc2;
}

//Adds deposit to balance
public void addBalance()
{
	
}

//Removes withdrawal amount from balance 
public void subBalance()
{
	
}

//adds fine to withdrawal amount
public void fine()
{
	
}

}
