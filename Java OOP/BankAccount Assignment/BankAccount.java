import java.util.Scanner;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    
    public BankAccount(){
        accounts++;
    }



    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static void setAccounts(int accounts) {
        BankAccount.accounts = accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static void setTotalMoney(double totalMoney) {
        BankAccount.totalMoney = totalMoney;
    }   
    




    public double deposit (double money){
        System.out.println("enter account type checking or saving ");
        String accountType = System.console().readLine();
        if (accountType.equalsIgnoreCase("checking")){
            checkingBalance += money;
            totalMoney += money;
            return checkingBalance;
        }
        else if (accountType.equalsIgnoreCase("saving")){
            savingsBalance += money;
            totalMoney += money;
            return savingsBalance;
        }
        else{
            System.out.println("Invalid input");
            return -1;
        }
        
    }

        public double withdraw  (double money){
        System.out.println("enter account type checking or saving ");
        String accountType = System.console().readLine();
        if (accountType.equalsIgnoreCase("checking") &&( money <= checkingBalance) ){
            checkingBalance -= money;
            totalMoney -= money;
            return checkingBalance;
        }
        else if (accountType.equalsIgnoreCase("saving") && (money <= savingsBalance)){
            savingsBalance -= money;
            totalMoney -= money;
            return savingsBalance;
        }
        else{
            System.out.println("Invalid input");
            return -1;
        }
        
    }

    public void getBalance(){
        System.out.printf("Checking Balance: $%.2f\n", checkingBalance);
        System.out.printf("Savings Balance : $%.2f\n", savingsBalance);
        System.out.printf("Total Money     : $%.2f\n",totalMoney);
        }
        else if (accountType.equalsIgnoreCase("saving") && (money <= savingsBalance)){
            savingsBalance -= money;
            totalMoney -= money;
            return savingsBalance;
        }
        else{
            System.out.println("Invalid input");
            return -1;
        }
        
    }
