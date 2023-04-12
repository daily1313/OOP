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

    public static void IsEnoughMushroomFront(int quantityFront, int eatingQuantity) {
        if(quantityFront < eatingQuantity) {
            throw new IllegalArgumentException("다 먹어서 떨어졌습니다.");
        }
    }

    public static void IsEnoughMushroomBack(int quantityBack, int eatingQuantity) {
        if(quantityBack < eatingQuantity) {
            throw new IllegalArgumentException("다 먹어서 떨어졌습니다.");
        }
    }

    public int getQuantityFront() {
        return quantityFront;
    }

    public int getQuantityBack() {
        return quantityBack;
    }
}
