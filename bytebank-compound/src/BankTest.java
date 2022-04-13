
public class BankTest {
	public static void main(String[] args) {
		Client john = new Client();
		john.name = "John Wick";
		john.cpf = "111.111.111-11";
		john.occupation = "developer";
		
		Account johnAccount = new Account();
		johnAccount.deposit(100);
		
		johnAccount.owner = john;
		
		System.out.println(johnAccount.owner.name);
		System.out.println(johnAccount.owner);
		System.out.println(john);
	}
}
