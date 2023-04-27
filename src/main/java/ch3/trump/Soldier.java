package ch3.trump;

import java.util.Scanner;

public class Soldier extends Trump {

    private static Soldier soldier;
    private static final int END_POINT = 100;
    private static final int START_POINT = 0;
    private int nowDistance;

    Scanner scanner = new Scanner(System.in);

    public Soldier(final String name, Shape shape, final boolean walkable, final int nowDistance) {
        super(name, shape, walkable);
        this.nowDistance = START_POINT;
    }

    public static Soldier getInstance() {
        if(soldier == null) {
            soldier = new Soldier("병사", Shape.CLOVER, true, START_POINT);
        }
        return soldier;
    }

    @Override
    public void act() {
        makeMarch();
    }

    private void makeMarch() {
        while(nowDistance < END_POINT) {
            nowDistance += 10;
            System.out.println(this.name + "은 행진하고 있습니다");
            System.out.println("남은 거리 : " + (END_POINT - nowDistance));
        }
    }

    @Override
    public boolean canWalk() {
        return this.walkable;
    }
}
