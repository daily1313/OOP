package ch5.order;

import ch5.menu.Menu;
import ch5.menu.MenuItem;

public class OrderItem {

    private MenuItem menuItem;
    private Menu menu;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public String getMenuName() {
        return menuItem.getName();
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return (menuItem.getPrice() * this.quantity);
    }
}
