public class CreditCardPayment extends Payment{
    public CreditCardPayment(double amount) {
        super(amount);
    }

    public String getProcessorName(){
        return "Credit Card processor";
    }

    public boolean validatePayment(){
        if (amount>5000){
            System.out.println("Błąd. Płatność kartą przekracza 5000");
            return false;
        }
        return true;
    }

    @Override
    public boolean processPayment(double amount) {
        return validatePayment();
    }
}
