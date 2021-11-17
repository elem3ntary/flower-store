package order;

import delivery.DHLDeliveryStrategy;
import delivery.Delivery;
import factories.HighBudgetOrderFactory;
import factories.LowBudgetOrderFactory;
import factories.MiddleBudgetOrderFactory;
import factories.OrderFactory;
import flowerstore.Item;
import payments.PayPalPaymentStrategy;
import payments.Payment;
import users.Receiver;

import java.util.ArrayList;
import java.util.List;

public class QuickOrder extends Order{

    @Override
    public void processOrder() {
        OrderFactory orderFactory = new  MiddleBudgetOrderFactory();
        Item randomItem = orderFactory.create();
        Receiver receiver = new Receiver();
        Payment payment = new PayPalPaymentStrategy();
        Delivery delivery = new DHLDeliveryStrategy();
        this.addUser(receiver);
        this.setPayment(payment);
        this.addItem(randomItem);
        this.setDelivery(delivery);

        System.out.println("Your quick order is ready!");
        System.out.println("Total sum:" + calculateTotalPrice());
        System.out.println();

        order();
    }
}
