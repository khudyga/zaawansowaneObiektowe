public abstract class Payment implements PaymentProcessor{
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void printReceipt(){
        System.out.println("Paragon");
        System.out.println("Kwota: " + amount);
        System.out.println("Procesor płatności: " + getProcessorName());
        System.out.println("-----------------------------------------------");
    }

    public abstract boolean validatePayment();
}
