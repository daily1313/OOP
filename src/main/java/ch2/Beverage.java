package ch2;

public class Beverage {

    private int quantity;

    public Beverage() {
        this.quantity = 500;
    }

    public void drunkenBeverage(int amount) {
        this.quantity -= amount;
    }

    public static void IsEnoughBeverage(int amount, int eatingQuantity) {
        if(amount < eatingQuantity) {
            throw new IllegalArgumentException("다 먹어서 떨어졌습니다.");
        }
    }

    public int getQuantity() {
        return quantity;
    }
}
