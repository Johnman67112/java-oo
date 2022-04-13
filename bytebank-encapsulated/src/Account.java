

public class Account {
	private double balance;
	private int agency;
	private int number;
	private Client owner;
	private static int total;
	
	public Account(int agency, int number) {
		Account.total++;
		System.out.println("Account total: " + Account.total);
		this.agency = agency;
		this.number = number;
		System.out.println("i am building an account " + this.number);
	}
	
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
		if(number <= 0) {
			System.out.println("invalid number");
			return;
		}
		this.number = number;
	}
	
	public int getAgency() {
		return this.agency;
	}
	
	public void setAgency(int agency) {
		if(agency <= 0) {
			System.out.println("invalid value");
			return;
		}
		this.agency = agency;
	}
	
	public void setOwner(Client owner) {
		this.owner = owner;
	}
	
	public Client getOwner() {
		return this.owner;
	}
	
	public static int getTotal() {
		return Account.total;
	}
	
}
