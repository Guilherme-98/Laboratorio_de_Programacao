import java.util.Scanner;
import java.math.BigDecimal;
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal v1 = new BigDecimal(50.00);
		BigDecimal v2 = new BigDecimal(7.53);
		 Account account1 = new Account("Jane Green", v1);
	      Account account2 = new Account("John Blue", v2); 

	      // display initial balance of each object
	      System.out.printf("%s balance: $%.2f%n",
	         account1.getName(), account1.getBalance()); 
	      System.out.printf("%s balance: $%.2f%n%n",
	         account2.getName(), account2.getBalance()); 

	      // create a Scanner to obtain input from the command window
	      Scanner input = new Scanner(System.in);

	      System.out.print("Enter deposit amount for account1: "); // prompt
	      BigDecimal depositAmount = input.nextBigDecimal(); // obtain user input
	      System.out.printf("%nadding %.2f to account1 balance%n%n", 
	         depositAmount);
	      account1.deposit(depositAmount); // add to account1's balance

	      // display balances
	      System.out.printf("%s balance: $%.2f%n",
	         account1.getName(), account1.getBalance()); 
	      System.out.printf("%s balance: $%.2f%n%n",
	         account2.getName(), account2.getBalance()); 

	      System.out.print("Enter deposit amount for account2: "); // prompt
	      depositAmount = input.nextBigDecimal(); // obtain user input
	      System.out.printf("%nadding %.2f to account2 balance%n%n", 
	         depositAmount);
	      account2.deposit(depositAmount); // add to account2 balance

	      // display balances
	      System.out.printf("%s balance: $%.2f%n", 
	         account1.getName(), account1.getBalance()); 
	      System.out.printf("%s balance: $%.2f%n%n",
	         account2.getName(), account2.getBalance());
	      
	      input.close();
	}

}