package ch2;

import static java.lang.System.exit;

public class main {

    public static void main(String args[]) {
        Alice alice = new Alice();
        Cake cake = new Cake();
        Beverage beverage = new Beverage();
        Mushroom mushroom = new Mushroom();
        Door door = new Door();

        System.out.println("엘리스의 현재 키와 위치 ");
        System.out.println("키 : "+ alice.getHeight() + " 위치 : "+alice.getNowLocation());

        while(!alice.getNowLocation().equals(Location.정원)) {
            alice.eatCake(10, cake);
            alice.eatMushroomFront(10, mushroom);
            alice.eatMushroomBack(30, mushroom);
            alice.drinkBeverage(10, beverage);
            alice.move(door);
        }
        exit(0);
    }
}
