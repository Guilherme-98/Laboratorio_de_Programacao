import java.math.BigDecimal;

public class Account {
	private String name; 
   private BigDecimal balance; 
   private BigDecimal aux = new BigDecimal("0.0");

   
   public Account(String name, BigDecimal balance) {
      this.name = name;
      if (balance.compareTo(aux) == 1) { 
         this.balance = balance;
      }
   }

   // method that deposits (adds) only a valid amount to the balance
   public void deposit(BigDecimal depositAmount) {      
      if (depositAmount.compareTo(aux) == 1) { // if the depositAmount is valid
         balance = balance.add(depositAmount); // add it to the balance 
      }else {
    	  System.out.println("Invalid balance.");
      }
   }

   // method returns the account balance
   public BigDecimal getBalance() {
      return this.balance; 
   }
   

   // method that sets the name
   public void setName(String name) {
      this.name = name; 
   } 

   // method that returns the name
   public String getName() {
      return this.name; 
   } 
}
