package ch2;

public class Cake {

    private int quantity;

    public Cake() {
        this.quantity = 100;
    }

    public void eatenCake(int amount) {
        quantity -= amount;
    }

    public static void IsEnoughCake(int amount, int eatingQuantity) {
        if(eatingQuantity < 0) {
            throw new IllegalArgumentException("먹는 양은 음수가 될 수 없습니다.");
        }
        if(amount < eatingQuantity) {
            throw new IllegalArgumentException("먹을 양이 부족합니다.");
        }
    }

    public int getQuantity() {
        return quantity;
    }
}
