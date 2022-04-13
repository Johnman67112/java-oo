
public class AccountNoClientTest {
	public static void main(String[] args) {
		Account mariaAccount = new Account();
		System.out.println(mariaAccount.balance);
		
		mariaAccount.owner = new Client();
		System.out.println(mariaAccount.owner);
		
		mariaAccount.owner.name = "Maria";
		System.out.println(mariaAccount.owner.name);
	}
}
