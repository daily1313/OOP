package ch5.kiosk;


import static ch5.view.OutputView.printAllOrderItems;
import static ch5.view.OutputView.printTotalPriceAndCountMessage;

import ch5.order.OrderItem;
import java.util.List;

public class Kiosk {

    private final List<OrderItem> orderItems;

    public Kiosk(final List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public void printReceipt() {
        printTotalPriceAndCountMessage(orderItems);
    }
}
