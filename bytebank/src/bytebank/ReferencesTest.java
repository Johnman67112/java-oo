package bytebank;

public class ReferencesTest {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 300;
		System.out.println("balance of first account: " + firstAccount.balance);
		
		Account secondAccount = firstAccount;
		System.out.println("balance of first account: " + secondAccount.balance);
		
		secondAccount.balance += 100;
		System.out.println("balance of first account: " + firstAccount.balance);
		System.out.println("balance of first account: " + secondAccount.balance);
		
		if(firstAccount == secondAccount) {
			System.out.println("they are the same account");
		}
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}
}
