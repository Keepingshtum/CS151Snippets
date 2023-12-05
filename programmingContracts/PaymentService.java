package programmingContracts;

public interface PaymentService {
    boolean processPayment(double amount);
    double getBalance();
    void setCredentials(String credentials);
}
