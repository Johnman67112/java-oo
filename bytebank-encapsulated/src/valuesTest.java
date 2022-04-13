
public class valuesTest {
	public static void main(String[] args) {
		Account account = new Account(1337, 24226);
		System.out.println(account.getAgency());
		
		
		Account account2 = new Account(1337, 16549);
		System.out.println(account2.getAgency());
		
		Account account3 = new Account(2112, 14660);
		System.out.println(account3.getAgency());
		
		System.out.println(Account.getTotal());
	}
}
