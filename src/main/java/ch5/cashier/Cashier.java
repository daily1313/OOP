package ch5.cashier;

import ch5.barista.Barista;
import ch5.coffee.Coffee;
import ch5.consumer.Consumer;
import java.util.List;

public class Cashier {

    private final Barista barista;
    private final Consumer consumer;

    public Cashier(final Barista barista, final Consumer consumer) {
        this.barista = barista;
        this.consumer = consumer;
    }

    public void responseOrderOfCustomer() {
        consumer.getOrderItems().forEach(barista::makeCoffee);
    }

    public List<Coffee> serveCoffeeToCustomer() {
        return barista.serveCoffeeToCashier();
    }
}
