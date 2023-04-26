package ch3.trump;



import java.util.Scanner;

public class King extends Trump {

    private static King king;
    private int degreeOfSatisfaction;
    private static final int DEFAULT_SATISFACTION_VALUE = 0;
    private static final int END_SATISFACTION_VALUE = 100;

    Scanner scanner = new Scanner(System.in);

    public King(final String name, Shape shape, final boolean walkable, final int DEFAULT_SATISFACTION_VALUE) {
        super(name, shape, walkable);
        this.degreeOfSatisfaction = DEFAULT_SATISFACTION_VALUE;

    }

    public static King getInstance() {
        if(king == null) {
            king = new King("왕", Shape.HEART, true, DEFAULT_SATISFACTION_VALUE);
        }
        return king;
    }

    @Override
    public void act() {
        printPartyProceedMessage();
        askHowManyMinutesPartyTime();
        while(degreeOfSatisfaction < END_SATISFACTION_VALUE) {
            int minute = scanner.nextInt();
            this.degreeOfSatisfaction += minute;
            printSatisfactionOfKing();
            askAddHowManyMinutesPartyTime();
        }
        printSuccessPartyMessage();
    }

    private void printPartyProceedMessage() {
        System.out.println("파티를 진행하겠습니다.");
    }

    private void askHowManyMinutesPartyTime() {
        System.out.println("몇 분 동안 파티를 진행하실건가요 ?");
    }

    private void printSatisfactionOfKing() {
        System.out.println("왕의 만족도는 " + this.degreeOfSatisfaction + "입니다.");
        if (END_SATISFACTION_VALUE - degreeOfSatisfaction > 0) {
            System.out.println("만족도가 " + (END_SATISFACTION_VALUE - degreeOfSatisfaction) + "만큼 부족합니다.");
            return;
        }
        System.out.println("만족도가 " + (degreeOfSatisfaction - END_SATISFACTION_VALUE) + "만큼 초과했습니다." );
    }

    private void askAddHowManyMinutesPartyTime() {
        System.out.println("몇 분 동안 파티를 더 진행하실건가요 ?");
    }

    private void printSuccessPartyMessage() {
        System.out.println("성공적으로 파티를 마쳤습니다.");
    }

    @Override
    public boolean canWalk() {
        return this.walkable;
    }
}
