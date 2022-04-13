package bytebank;

public class MethodTest {
	public static void main(String[] args) {
		Account johnAccount = new Account();
		johnAccount.balance = 100;
		johnAccount.deposit(50);
		System.out.println(johnAccount.balance);
		
		boolean successWithdraw = johnAccount.withdraw(20);
		System.out.println(johnAccount.balance);
		System.out.println(successWithdraw);
		
		Account mariaAccount = new Account();
		mariaAccount.deposit(1000);
		System.out.println(mariaAccount.balance);
		
		boolean transfer = mariaAccount.transfer(300, johnAccount);
		
		if(transfer) {
			System.out.println("Successfull transfer!");
		} else {
			System.out.println("Failed Transfer!");
		}
		
		System.out.println(mariaAccount.balance);
		System.out.println(johnAccount.balance);
	}
}
