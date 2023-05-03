package ch5.consumer;

import ch5.cashier.Cashier;
import ch5.coffee.Coffee;
import ch5.order.OrderItem;
import java.util.ArrayList;
import java.util.List;

public class Consumer {

    private final List<OrderItem> orderItems;
    private int money;

    public Consumer() {
        this.orderItems = new ArrayList<>();
        this.money = 10000000;
    }

    public void order(Cashier cashier) {
        payMoney();
        cashier.responseOrderOfCustomer();
    }

    private void payMoney() {
        int totalPrice = orderItems.stream()
                .mapToInt(OrderItem::getPrice)
                .sum();
        this.money -= totalPrice;
    }

    public void putItemInCart(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public List<Coffee> getCoffee(Cashier cashier) {
        return cashier.serveCoffeeToCustomer();
    }

    public int getMoney() {
        return money;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
