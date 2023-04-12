package ch2;

public class Cake {

    private int quantity;

    public Cake() {
        this.quantity = 100;
    }

    public void eatenCake(int amount) {
        quantity -= amount;
    }
}
