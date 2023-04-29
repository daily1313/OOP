package ch4;


import static ch4.judge.King.changeJudgeFromKingToQueen;
import static ch4.view.View.printChangeJudgeMessage;
import static ch4.view.View.printChangeWitnessMessage;
import static ch4.view.View.printContinueTrialMessage;
import static ch4.view.View.printNewLine;
import static ch4.view.View.printSuccessTrialMessage;

import ch4.court.Court;
import ch4.disrupter.Mouse;
import ch4.judge.Judge;
import ch4.judge.King;
import ch4.judge.Queen;
import ch4.mediator.Rabbit;
import ch4.witness.Alice;
import ch4.witness.Chef;
import ch4.witness.MadHatter;
import ch4.witness.Witness;
import java.util.List;

public class Game {

    public static Judge judge;
    public static final Court court = new Court();
    public static Alice alice = Alice.getInstance();
    public static Chef chef = Chef.getInstance();
    public static Mouse mouse = new Mouse();
    public static MadHatter madHatter = MadHatter.getInstance();
    public static List<Witness> witnesses = List.of(madHatter, chef, alice);
    public static Rabbit rabbit = new Rabbit(List.of(madHatter, chef, alice));

    public static void main(String[] args) {
        court.startTrial();
        judge = King.getInstance();
        for(int order = 0; order < 3; order++) {
            judge.callWitness(rabbit, order);
            Witness witness = getWitness(order);
            judge = checkWitnessAboutChef(order, witness, judge);
            checkJudgeAboutQueen(judge);
            String testimony = judge.orderTestimony(witness);
            checkUsefulTestimony(testimony, judge);
            printNewLine();
        }
        court.endTrial();
    }

    private static Witness getWitness(int order) {
        Witness witness = rabbit.orderToEnterTheWitnessStand(order);
        witness.enterTheWitnessStand();
        return witness;
    }

    private static void checkJudgeAboutQueen(Judge judge) {
        if (!King.class.equals(judge.getClass())) {
            printContinueTrialMessage(judge.getName());
        }
    }

    public static Judge checkWitnessAboutChef(int order, Witness witness, Judge judge) {
        if(witness.equals(chef)) {
            mouse.killChef(witnesses, order);
            String nowJudgeName = judge.getName();
            judge = changeJudgeFromKingToQueen();
            printChangeJudgeMessage(nowJudgeName, judge.getName());
        }
        return judge;
    }

    private static void checkUsefulTestimony(String testimony, Judge judge) {
        judge.validateUsefulTestimony(testimony, judge.getName());
    }
}
