package ch4.view;

public class View {

    public static void printChangeWitnessMessage(final String judgeName) {
        System.out.println(judgeName + ": 쓸모 없는 증언이야 다른 사람 불러");
    }

    public static void printSuccessTrialMessage(final String judgeName) {
        System.out.println(judgeName + ": 쓸모 있는 증언이야 재판을 끝낼 수 있겠군");
    }

    public static void printChangeJudgeMessage(final String beforeJudgeName, final String afterJudgeName) {
        System.out.println(beforeJudgeName + "이 힘들어서 재판을 " + afterJudgeName + "으로 넘겼습니다.");
        System.out.println("재판장이 " + beforeJudgeName + "에서 " + afterJudgeName + "으로 변경되었습니다.");
    }

    public static void printContinueTrialMessage(final String judgeName) {
        System.out.println("재판을 이어서 " + judgeName + " 재판장이 계속해서 진행합니다.");
    }

    public static void printEntryWitnessMessage(final int sequence, final String witnessName) {
        System.out.println(sequence + "번 째 증인 " + witnessName + " 증인석에 입장하였습니다.");
    }

    public static void printNewLine() {
        System.out.println();
    }
}
