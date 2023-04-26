package ch3.trump;

import java.util.Scanner;

public class Queen extends Trump {

    Scanner scanner = new Scanner(System.in);
    private static Queen queen;
    private int degreeOfSatisfaction;
    private static final int DEFAULT_SATISFACTION_VALUE = 0;
    private static final int END_SATISFACTION_VALUE = 100;

    public Queen(final String name, Shape shape, final boolean walkable, final int DEFAULT_SATISFACTION_VALUE) {
        super(name, shape, walkable);
        this.degreeOfSatisfaction = DEFAULT_SATISFACTION_VALUE;
    }

    public static Queen getInstance() {
        if(queen == null) {
            queen = new Queen("여왕", Shape.HEART, true, DEFAULT_SATISFACTION_VALUE);
        }
        return queen;
    }

    @Override
    public void act() {
        printPartyProceedMessage();
        while(degreeOfSatisfaction < END_SATISFACTION_VALUE) {
            askHowManyMinutesPartyTime();
            int minute = inputPartyTime();
            this.degreeOfSatisfaction += minute;
            printSatisfactionOfQueen();
        }
        printSuccessPartyMessage();

    }

    private void printPartyProceedMessage() {
        System.out.println("파티를 진행하겠습니다.");
    }

    private void askHowManyMinutesPartyTime() {
        System.out.println("몇 분 동안 파티를 진행하실건가요 ?");
    }

    private int inputPartyTime() {
        return scanner.nextInt();
    }

    private void printSatisfactionOfQueen() {
        System.out.println("여왕의 만족도는 " + this.degreeOfSatisfaction + "입니다.");
        if (END_SATISFACTION_VALUE - degreeOfSatisfaction > 0) {
            System.out.println("만족도가 " + (END_SATISFACTION_VALUE - degreeOfSatisfaction) + "만큼 부족합니다.");
            return;
        }
        System.out.println("만족도가 " + (degreeOfSatisfaction - END_SATISFACTION_VALUE) + "만큼 초과했습니다." );
    }

    private void printSuccessPartyMessage() {
        System.out.println("성공적으로 파티를 마쳤습니다.");
    }

    @Override
    public boolean canWalk() {
        return this.walkable;
    }
}
