package ch2;

import static ch2.Beverage.IsEnoughBeverage;
import static ch2.Cake.IsEnoughCake;
import static ch2.Mushroom.IsEnoughMushroomBack;
import static ch2.Mushroom.IsEnoughMushroomFront;

public class Alice implements Human{

    private int height;
    private Location location;

    public Alice() {
        this.height = 130;
        this.location = Location.동굴;
    }

    @Override
    public void drinkBeverage(int amount, Beverage beverage) {
        IsEnoughBeverage(beverage.getQuantity(), amount);
        isInSufficient(height);
        this.height -= amount;
        beverage.drunkenBeverage(amount);
        System.out.println("엘리스가 음료수(" + amount + ")를 마시고 키가 작아졌습니다.");
    }

    @Override
    public void eatCake(int amount, Cake cake) {
        IsEnoughCake(cake.getQuantity(), amount);
        isInSufficient(height);
        this.height += amount;
        cake.eatenCake(amount);
        System.out.println("엘리스가 케이크(" + amount + ")를 먹고 키가 커졌습니다.");
    }

    @Override
    public void fan(int minute) {
        this.height += minute;
    }

    @Override
    public void eatMushroomFront(int amount, Mushroom mushroom) {
        IsEnoughMushroomFront(mushroom.getQuantityFront(), amount);
        isInSufficient(height);
        this.height -= amount;
        mushroom.eatenMushroomFront(amount);
        System.out.println("엘리스가 mushroom 앞쪽(" + amount + ")을 먹고 키가 작아졌습니다.");
    }

    @Override
    public void eatMushroomBack(int amount, Mushroom mushroom) {
        IsEnoughMushroomBack(mushroom.getQuantityBack(), amount);
        isInSufficient(height);
        this.height += amount;
        mushroom.eatenMushroomBack(amount);
        System.out.println("엘리스가 mushroom 뒷쪽(" + amount + ")을 먹고 키가 커졌습니다.");
    }

    public void move(Door door) {
        if(door.availableOpenDoor(height)) {
            moveLocationFromCaveToGarden();
            System.out.println("동굴에서 정원으로 통과하였습니다.");
            return;
        }
        System.out.println("동굴에서 정원으로 통과하지 못했습니다.");
        System.out.println("엘리스의 키 높이 " + this.height + "문의 높이" + door.getSize());
    }

    public int getHeight() {
        return height;
    }

    public void moveLocationFromCaveToGarden() {
        this.location = Location.정원;
    }

    public Location getNowLocation() {
        return location;
    }

    private void isInSufficient(int height) {
        if(height < 0) {
            throw new IllegalArgumentException("더 작아질 키가 없습니다.");
        }
    }
}
