import java.util.ArrayList;

public class PaymentApp {
    public static void main(String[] args) {
        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(new CreditCardPayment(4500));
        payments.add(new CreditCardPayment(5500));
        payments.add(new PayPalPayment(1500));
        payments.add(new CreditCardPayment(2500));

        for(Payment payment : payments){
            System.out.println("Przetwarzanie płatności: " + payment.getProcessorName() + "\nKwota: " + payment.amount);
            if(payment.processPayment(payment.amount)){
                payment.printReceipt();} else {
                System.out.println("Płatność nieudana");
                System.out.println("---------------------------------");
            }
        }
    }
}
