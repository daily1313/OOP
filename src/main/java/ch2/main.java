package ch2;

import static java.lang.System.exit;

public class main {

    public static void main(String args[]) {
        Alice alice = new Alice();
        Cake cake = new Cake();
        Beverage beverage = new Beverage();
        Mushroom mushroom = new Mushroom();
        Door door = new Door();
        OutputView outputView = new OutputView();

        outputView.printAliceCurrentHeightAndLocation(alice);
        System.out.println();
        while(!alice.getNowLocation().equals(Location.정원)) {
            alice.eatCake(10, cake);
            outputView.printAliceCurrentHeight(alice);
            outputView.printCurrentCakeQuantity(cake);
            System.out.println();
            alice.eatMushroomFront(10, mushroom);
            outputView.printAliceCurrentHeight(alice);
            outputView.printCurrentMushRoomFrontQuantity(mushroom);
            System.out.println();
            alice.eatMushroomBack(30, mushroom);
            outputView.printAliceCurrentHeight(alice);
            outputView.printCurrentMushRoomBackQuantity(mushroom);
            System.out.println();
            alice.drinkBeverage(10, beverage);
            outputView.printAliceCurrentHeight(alice);
            outputView.printCurrentBeverageQuantity(beverage);
            System.out.println();
            alice.move(door);
            outputView.printAliceCurrentHeightAndDoorHeight(alice, door);
        }
        exit(0);
    }
}
