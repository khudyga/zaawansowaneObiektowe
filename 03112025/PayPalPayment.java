import java.util.Random;

class PayPalPayment extends Payment{
    private static Random rand = new Random();

    public PayPalPayment(double amount) {
        super(amount);
    }

    @Override
    public String getProcessorName() {
        return "PayPal Processor";
    }

    @Override
    public boolean processPayment(double amount) {
        if(validatePayment()) {
            boolean success = (1 + rand.nextInt(10)) != 1;
            if (!success){
                System.out.println("Awaria sieci.");
            }
            return success;
        }
        return false;
    }

    @Override
    public boolean validatePayment() {
        if (amount>20000){
            System.out.println("Błąd. Paypal przekracza limit 2000.");
            return false;
        }
        return true;
    }
}
