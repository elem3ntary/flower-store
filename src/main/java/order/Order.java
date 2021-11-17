package order;

import delivery.Delivery;
import flowerstore.Item;
import lombok.Setter;
import payments.Payment;
import users.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {
    private List<Item> itemList = new LinkedList<>();
    private List<User> usersList = new ArrayList<>();
    @Setter
    private Payment payment;
    @Setter
    private Delivery delivery;

    public void addItem(Item item) {
        itemList.add(item);
    }
    public void removeItem(Item item) {
        itemList.remove(item);
    }
    public double calculateTotalPrice() {
        double total = 0;
        for(Item item: itemList) {
            total += item.getPrice();
        }
        return total;
    }
    public void processOrder() {
        System.out.println("Processing order");
    }
    public void addUser(User user){
        usersList.add(user);
    }

    public void removeUser(User user) {
        usersList.remove(user);
    }

    public void notifyUsers(){
        for(User user: usersList) {
            user.update();
        }
    }

    public void order() {
        System.out.println("Processing order");
        notifyUsers();
    }

}
