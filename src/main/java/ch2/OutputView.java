package ch2;

public class OutputView {

    public void printAliceCurrentHeightAndLocation(Alice alice) {
        System.out.println("엘리스의 현재 키와 위치 ");
        System.out.println("키 : " + alice.getHeight() + ", 위치 : " + alice.getNowLocation());
    }

    public void printAliceCurrentHeightAndDoorHeight(Alice alice, Door door) {
        System.out.println("엘리스의 높이 : " + alice.getHeight());
        System.out.println("문의 높이 : " + door.getSize());
    }

    public void printAliceCurrentHeight(Alice alice) {
        System.out.println("엘리스의 현재 키 : " + alice.getHeight());
    }

    public void printCurrentCakeQuantity(Cake cake) {
        System.out.println("케이크의 남은 양 : " + cake.getQuantity());
    }

    public void printCurrentBeverageQuantity(Beverage beverage) {
        System.out.println("음료수의 남은 양 : " + beverage.getQuantity());
    }

    public void printCurrentMushRoomFrontQuantity(Mushroom mushroom) {
        System.out.println("버섯 앞쪽 남은 양 : " + mushroom.getQuantityFront());
    }

    public void printCurrentMushRoomBackQuantity(Mushroom mushroom) {
        System.out.println("버섯 뒷쪽 남은 양 : " + mushroom.getQuantityBack());
    }
}
