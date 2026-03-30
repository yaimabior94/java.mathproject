import java.util.ArrayList;

// Base Class
class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Processing generic payment of $" + amount);
    }
}

// Child Class 1: Credit Card
class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(double amount, String cardNumber, String cardHolder) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment() {
        System.out.println("Paid $" + amount + " using Credit Card");
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Card Number: " + cardNumber);
    }
}

// Child Class 2: PayPal
class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Paid $" + amount + " using PayPal");
        System.out.println("Email: " + email);
    }
}

// Child Class 3: Crypto
class CryptoPayment extends Payment {
    private String walletAddress;

    public CryptoPayment(double amount, String walletAddress) {
        super(amount);
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment() {
        System.out.println("Paid $" + amount + " using Cryptocurrency");
        System.out.println("Wallet Address: " + walletAddress);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        ArrayList<Payment> payments = new ArrayList<>();

        Payment p1 = new CreditCardPayment(100.0, "1234-5678-9012-3456", "Yai Mabior");
        Payment p2 = new PayPalPayment(50.0, "yai@example.com");
        Payment p3 = new CryptoPayment(200.0, "0xABC123XYZ");

        payments.add(p1);
        payments.add(p2);
        payments.add(p3);

        // Process all payments
        for (Payment payment : payments) {
            payment.processPayment();
            System.out.println("---------------------");
        }
    }
}