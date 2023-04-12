package ch2;

public class Beverage {

    private int quantity;

    public Beverage() {
        this.quantity = 500;
    }

    public void drunkenBeverage(int amount) {
        this.quantity -= amount;
    }
}
