package programmingContracts;

// Class implementing the contract
class CreditCardPaymentService implements PaymentService {
    private double balance;
    private String credentials;

    @Override
    public boolean processPayment(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Payment processed: " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance to process payment.");
            return false;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setCredentials(String credentials) {
        this.credentials = credentials;
        // Assume some logic to initialize the balance based on credentials
        balance = 1000.0; // This is just an example value
    }
}

// Main class to demonstrate the use of the contract
public class Payment {
    public static void main(String[] args) {
        PaymentService paymentService = new CreditCardPaymentService();
        paymentService.setCredentials("user:password");

        System.out.println("Initial Balance: " + paymentService.getBalance());
        paymentService.processPayment(500);
        System.out.println("Balance after transaction: " + paymentService.getBalance());
    }
}
