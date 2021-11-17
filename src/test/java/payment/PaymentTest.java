package payment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payments.CreditCardPaymentStrategy;
import payments.PayPalPaymentStrategy;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {
    private CreditCardPaymentStrategy creditCardPaymentStrategy;
    private PayPalPaymentStrategy payPalPaymentStrategy;

    @BeforeEach
    void setUp(){
        creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        payPalPaymentStrategy = new PayPalPaymentStrategy();
    }

    @Test
    void testPayments(){
        assertDoesNotThrow(() -> creditCardPaymentStrategy.pay(100));
        assertDoesNotThrow(() -> payPalPaymentStrategy.pay(100));
    }
}
