
public class WithdrawNegativeTest {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(100);
		System.out.println(account.withdraw(200));
		
		
		account.withdraw(101);
		System.out.println(account.getBalance());
		
		//Forbidden
		//account.balance -= 101;
		//System.out.println(account.balance);
	}
}
