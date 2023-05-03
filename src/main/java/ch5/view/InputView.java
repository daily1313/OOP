package ch5.view;

import static ch5.Game.menu;

import ch5.menu.Menu;
import ch5.menu.MenuItem;
import ch5.order.OrderItem;
import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);
    OutputView outputView = new OutputView();

    public boolean askWhetherToPlaceOnOrder() {
        outputView.printPlaceOnOrderMessage();
        return inputGameOption();
    }

    private boolean inputGameOption() {
        String input;
        input = scanner.nextLine();
        if (input.equals("N")) {
            return false;
        }
        if (input.equals("Y")) {
            return true;
        }
        outputView.printTypingKeywordIncorrectlyMessage();
        return true;
    }

    public OrderItem askOrderItemFromConsumer() {
        outputView.printInputOrderItemMessage();
        MenuItem menuItem;
        try {
            String inputMenuItem = scanner.nextLine();
            menuItem = menu.choose(inputMenuItem);
        } catch (IllegalArgumentException e) {
            outputView.printNotFoundOrderItemMessage();
            return askOrderItemFromConsumer();
        }
        outputView.printInputQuantityMessage();
        int quantity = Integer.parseInt(scanner.nextLine());
        return new OrderItem(menuItem, quantity);
    }
}
