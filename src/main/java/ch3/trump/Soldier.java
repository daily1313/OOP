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
        printMakeAMarchMessage();
        while (nowDistance <= END_POINT) {
            move();
            getNowDistance();
        }
        printSuccessMission();
    }

    private void move() {
        this.nowDistance += 10;
    }

    private void getNowDistance() {
        System.out.println("병사의 현재 거리 : " + nowDistance);
    }

    private void printMakeAMarchMessage() {
        System.out.println("행진을 시작합니다.");
    }

    private void printSuccessMission() {
        System.out.println("도착지점에 도달하였습니다.");
    }

    @Override
    public boolean canWalk() {
        return this.walkable;
    }
}
