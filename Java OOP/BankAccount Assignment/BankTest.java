import java.io.PrintStream;
import java.util.Scanner;
public class BankTest {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

  
        BankAccount account1 = new BankAccount();
       

   
        System.out.println("Deposit test:");
        System.out.println(account1.deposit(300));
      



       
        System.out.println("withdraw test:");
        System.out.println(account1.withdraw(100));
      
        scanner.close();
      
        System.out.println(BankAccount.getTotalMoney());
        

    }
}
