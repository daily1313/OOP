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
        if(eatingQuantity < 0) {
            throw new IllegalArgumentException("먹는 양은 음수가 될 수 없습니다.");
        }
        if(amount < eatingQuantity) {
            throw new IllegalArgumentException("다 먹어서 떨어졌습니다.");
        }
    }

    public int getQuantity() {
        return quantity;
    }
}
