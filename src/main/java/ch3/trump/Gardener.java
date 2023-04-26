package ch3.trump;

import static java.lang.System.exit;

import java.util.Scanner;

public class Gardener extends Trump {

    private static Gardener gardener;
    private int degreeOfCompletion;
    private static final int DEFAULT_WORKLOAD_VALUE = 0;
    private static final int COMPLETION_WORKLOAD_VALUE = 100;

    Scanner scanner = new Scanner(System.in);

    public Gardener(final String name, Shape shape, final boolean walkable, final int degreeOfCompletion) {
        super(name, shape, walkable);
        this.degreeOfCompletion = DEFAULT_WORKLOAD_VALUE;
    }

    public static Gardener getInstance() {
        if(gardener == null) {
            gardener = new Gardener("정원사", Shape.SPADE, true, DEFAULT_WORKLOAD_VALUE);
        }
        return gardener;
    }

    @Override
    public void act() {
        askQuestionAboutHowManyPaintFlowerRed();
        while(degreeOfCompletion <= COMPLETION_WORKLOAD_VALUE) {
            int inputData = inputWorkLoad();
            paintFlowerRed(inputData);
            if(!canDeceiveTheQueen()) {
                askQuestionAboutContinuePaintFlowerRed();
            }
            if(!checkContinuePaintFlowerRed()) {
                printFailMissionMessage();
                exit(0);
            }
            printRestartGameMessage();
        }
        printSuccessMissionMessage();
    }

    private void paintFlowerRed(int workLoad) {
        System.out.println("정원사가 " + workLoad + "% 만큼의 물감을 칠했습니다.");
        this.degreeOfCompletion += workLoad;
        System.out.println("완성도 : " + this.degreeOfCompletion);
    }

    public boolean canDeceiveTheQueen() {
        return this.degreeOfCompletion >= 100;
    }

    private void askQuestionAboutContinuePaintFlowerRed() {
        System.out.println("여왕을 속일 수 없습니다. 물감을 더 칠할건가요?(Y/N)");
    }

    private boolean checkContinuePaintFlowerRed() {
        char gameOptionCode = inputGameOptionCode();
        if(gameOptionCode == 'Y') return true;
        return false;
    }

    private char inputGameOptionCode() {
        return scanner.next().charAt(0);
    }

    private void askQuestionAboutHowManyPaintFlowerRed() {
        System.out.println("물감을 얼마나 칠할건가요?(0 ~ 100)");
    }

    private void printRestartGameMessage() {
        System.out.println("이어서 물감을 칠합니다. 현재 완성도는" + this.degreeOfCompletion + "입니다.");
    }

    private void printSuccessMissionMessage() {
        System.out.println("여왕의 눈길에서 피할 수 있게 되었습니다. 축하드립니다.");
    }

    private void printFailMissionMessage() {
        System.out.println("미션 실패 그냥 엎드리세요.");
        flipOver();
    }
    private int inputWorkLoad() {
        int workload = scanner.nextInt();
        return workload;
    }

    @Override
    public boolean canWalk() {
        return this.walkable;
    }
}
