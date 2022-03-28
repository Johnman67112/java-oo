package bytebank;

public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 200;
		firstAccount.balance += 100;
		
		Account secondAccount = new Account();
		secondAccount.balance = 50;
		
		System.out.println("first account has: " + firstAccount.balance);
		System.out.println("first account is in "
				+ "agency " + firstAccount.agency);
		System.out.println(firstAccount.number);
		System.out.println(firstAccount.owner);
		
		System.out.println("second account has: " + secondAccount.balance);
		System.out.println("second account is in "
				+ "agency " + secondAccount.agency);
		System.out.println(secondAccount.number);
		System.out.println(secondAccount.owner);
		
		if (firstAccount == secondAccount) {
			System.out.println("they are the same account");
		} else {
			System.out.println("they are different accounts");
		}
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}
}
