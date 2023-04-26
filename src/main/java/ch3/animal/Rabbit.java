package ch3.animal;

public class Rabbit extends Animal{

    private static final int START_POINT = 0;
    private static final int END_POINT = 10;
    private static Rabbit rabbit;

    public Rabbit(final String name, final int distance) {
        super(name, distance);
    }

    public static Rabbit getInstance() {
        if(rabbit == null) {
            rabbit = new Rabbit("토끼", START_POINT);
        }
        return rabbit;
    }

    @Override
    public void act() {
        while(distance < END_POINT) {
            move();
            printNowDistance();
            if(distance == END_POINT / 2) {
                cry();
            }
        }
        printArriveEndPointMessage();
    }

    private void printArriveEndPointMessage() {
        System.out.println("종점에 도착하였습니다.");
    }

    private void move() {
        distance++;
    }

    private void printNowDistance() {
        System.out.println("현재 지점 : " + distance);
    }

    @Override
    public void cry() {
        System.out.println("토끼가 힘들어서 울고 있습니다.(흑흑) 남은 거리 : " + (END_POINT - distance));
    }
}
