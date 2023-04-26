package ch3.trump;

import java.util.Scanner;

public class Servant extends Trump {

    private static Servant servant;

    private int degreeOfCompletion;
    private static final int DEFAULT_WORKLOAD_VALUE = 0;
    private static final int COMPLETION_WORKLOAD_VALUE = 100;

    Scanner scanner = new Scanner(System.in);

    public Servant(final String name, Shape shape, final boolean walkable, final int degreeOfCompletion) {
        super(name, shape, walkable);
        this.degreeOfCompletion = DEFAULT_WORKLOAD_VALUE;
    }

    public static Servant getInstance() {
        if(servant == null) {
            servant = new Servant("신하", Shape.DIAMOND, true, DEFAULT_WORKLOAD_VALUE);
        }
        return servant;
    }

    @Override
    public void act() {
        printSupportKingMessage();
        while(degreeOfCompletion < COMPLETION_WORKLOAD_VALUE) {
            int inputData = inputSupportOfKingTime();
            degreeOfCompletion += inputData;
            printSatisfactionOfServant();
        }
        printSuccessMissionMessage();
    }

    private void printSupportKingMessage() {
        System.out.println("왕을 부축하셔야 됩니다.");
        System.out.println("몇 분 동안 부축하시겠습니까?");
    }

    private int inputSupportOfKingTime() {
        return scanner.nextInt();
    }

    private void printSatisfactionOfServant() {
        System.out.println("신하의 성과는 " + this.degreeOfCompletion + "입니다.");
        if (COMPLETION_WORKLOAD_VALUE - degreeOfCompletion > 0) {
            System.out.println("성취도가 " + (COMPLETION_WORKLOAD_VALUE - degreeOfCompletion) + "만큼 부족합니다.");
            return;
        }
        System.out.println("성취도가 " + (degreeOfCompletion - COMPLETION_WORKLOAD_VALUE) + "만큼 초과했습니다." );
    }

    private void printSuccessMissionMessage() {
        System.out.println("미션을 성공하였습니다.");
    }

    @Override
    public boolean canWalk() {
        return this.walkable;
    }
}
