
public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  BankAccount account = new BankAccount();
	      
	      account.deposit(1000);
	      account.withdraw(500);
	      account.withdraw(400);
	      
	      double balance = account.getBalance();
	      
	      System.out.println(balance);
	      System.out.println("Expected: 100"); 
	}

}
