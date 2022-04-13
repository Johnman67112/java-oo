package bytebank;

public class Account {
	double balance;
	int agency = 42;
	int number;
	String owner;
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public boolean withdraw(double value) {
		if(this.balance >= value) {
			this.balance -= value;
			return true;
		}
		return false;
	}
	
	public boolean transfer(double value, Account destiny) {
		if(this.balance >= value) {
			this.withdraw(value);
			destiny.deposit(value);
			return true;
		}
		return false;
	}
}
