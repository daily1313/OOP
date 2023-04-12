package ch2;

public class Mushroom {

    private int quantityFront;
    private int quantityBack;

    public Mushroom() {
        this.quantityFront = 50;
        this.quantityBack = 50;
    }

    public void eatenMushroomFront(int amount) {
        this.quantityFront -= amount;
    }

    public void eatenMushroomBack(int amount) {
        this.quantityBack -= amount;
    }
}
