package ch2;

public class Elice implements Human{

    private int height;
    private Location location;
    private boolean isOpen;

    public Elice() {
        this.height = 130;
        this.location = Location.동굴;
        this.isOpen = false;
    }

    @Override
    public void drinkBeverage(int amount, Beverage beverage) {
        this.height -= amount;
        beverage.drunkenBeverage(amount);
    }

    @Override
    public void eatCake(int amount, Cake cake) {
        this.height += amount;
        cake.eatenCake(amount);
    }

    @Override
    public void fan(int minute) {
        this.height += minute;
    }

    @Override
    public void eatMushroomFront(int amount, Mushroom mushroom) {
        this.height -= amount;
        mushroom.eatenMushroomFront(amount);
    }

    @Override
    public void eatMushroomBack(int amount, Mushroom mushroom) {
        this.height += amount;
        mushroom.eatenMushroomBack(amount);

    }

    public void moveLocation(boolean isOpen) {
        if(availableOpenDoor(height)) {
            this.location = Location.정원;
        }
    }

    public boolean availableOpenDoor(int size) {
        return height < size;
    }
}
