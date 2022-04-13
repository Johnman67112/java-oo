
public class GetSetTest {
	public static void main(String[] args) {
		Account account = new Account(1337, 24226);
		
		System.out.println(account.getNumber());
		
		Client john = new Client();
		//account.owner = john;
		john.setName("John Wick");
		
		account.setOwner(john);
		
		System.out.println(account.getOwner().getName());
		
		account.getOwner().setOccupation("Developer");
		//two lines:
		Client accountOwner = account.getOwner();
		accountOwner.setOccupation("Developer");
		
		System.out.println(accountOwner);
		System.out.println(john);
		System.out.println(account.getOwner());
	}
}
