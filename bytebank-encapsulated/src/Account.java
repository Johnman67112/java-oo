

public class Account {
	private double balance;
	private int agency = 42;
	private int number;
	private Client owner;
	
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
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getAgency() {
		return this.agency;
	}
	
	public void setAgency(int agency) {
		this.agency = agency;
	}
	
	public void setOwner(Client owner) {
		this.owner = owner;
	}
	
	public Client getOwner() {
		return this.owner;
	}
	
}
