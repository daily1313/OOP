package ch5;


import static ch5.view.OutputView.printAllOrderItems;
import static ch5.view.OutputView.printBalanceOfConsumer;
import static ch5.view.OutputView.printTakeTheCoffeeMessage;
import static ch5.view.OutputView.printTotalPriceAndCountMessage;

import ch5.barista.Barista;
import ch5.cashier.Cashier;
import ch5.coffee.Coffee;
import ch5.consumer.Consumer;
import ch5.kiosk.Kiosk;
import ch5.menu.Menu;
import ch5.menu.MenuItem;
import ch5.order.OrderItem;
import ch5.view.InputView;
import java.util.Arrays;
import java.util.List;

public class Game {

    private static final Consumer consumer = new Consumer();
    private static final Barista barista = new Barista();
    private static final Cashier cashier = new Cashier(barista, consumer);
    private static final InputView inputView = new InputView();
    public static final Menu menu = new Menu(Arrays.asList(MenuItem.values()));

    public static void main(String[] args) {
        play();
    }

    private static void play() {
        while(inputView.askWhetherToPlaceOnOrder()) {
            addOrderItems();
        }
        orderByConsumer();
        printReceiptAndBalanceOfConsumer();
        printAllOrderItems(consumer.getCoffee(cashier));
        barista.removeOrderItems(consumer);
        tellConsumerToTakeTheCoffee(consumer);
    }

    private static void printReceiptAndBalanceOfConsumer() {
        showReceipt(consumer);
        printBalanceOfConsumer(consumer.getMoney());
    }

    private static void orderByConsumer() {
        consumer.order(cashier);
    }

    private static void addOrderItems() {
        OrderItem orderItem = inputView.askOrderItemFromConsumer();
        consumer.putItemInCart(orderItem);
    }

    private static void tellConsumerToTakeTheCoffee(Consumer consumer) {
        if(consumer.getOrderItems().isEmpty()) {
            printTakeTheCoffeeMessage();
        }
    }

    private static void showReceipt(Consumer consumer) {
        Kiosk kiosk = new Kiosk(consumer.getOrderItems());
        kiosk.printReceipt();
    }

}
