package ATM;

public class Account {
	private double balance;
	
	public Account() { 
		balance = 500;
	}
	
	public void deposit (double amount)
	{
		balance = balance + amount;
	}
	
	public void withdraw (double amount)
	{
		balance = balance - amount;
	}
	
	public double getBalance() {
		return balance;
	}
}
