class BankAccount{
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double deposit(double amount){
        balance = balance + amount;
        return getBalance();
    }

    public double deposit(double amount, String description){
        balance = balance + amount;
        System.out.println("Wpłacono: " + amount + " złotych. \n Opis: " + description);
        return getBalance();
    }

    public double deposit(double amount, String description, boolean isCash){
        balance = balance + amount;
        String type = isCash ? "gotowka" : "przelew";
        System.out.println("Wpłacono: " + amount + " złotych. \n Opis: " + description + "\n Typ transakcji: " + type);

        return getBalance();
    }
}

public class Main {
    public static void main(String[] args) {


    }
}