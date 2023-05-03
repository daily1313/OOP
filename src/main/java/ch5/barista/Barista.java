package ch5.barista;

import ch5.coffee.Coffee;
import ch5.coffee.CoffeeFactory;
import ch5.consumer.Consumer;
import ch5.order.OrderItem;
import java.util.ArrayList;
import java.util.List;

public class Barista {

    List<Coffee> coffees = new ArrayList<>();

    public void makeCoffee(final OrderItem orderItem) {
        Coffee coffee = CoffeeFactory.createCoffee(orderItem.getMenuItem(), orderItem.getQuantity(), orderItem.getMenuName());
        coffees.add(coffee);
    }

    public List<Coffee> serveCoffeeToCashier() {

        return coffees;
    }

    public void removeOrderItems(final Consumer consumer) {
        List<OrderItem> orderItems = consumer.getOrderItems();
        orderItems.clear();
    }
}
