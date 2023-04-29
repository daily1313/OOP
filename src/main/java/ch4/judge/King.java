package ch4.judge;

import static ch4.view.View.printChangeWitnessMessage;
import static ch4.view.View.printSuccessTrialMessage;

import ch4.mediator.Rabbit;
import ch4.witness.Witness;
import java.util.ArrayList;
import java.util.List;

public class King implements Judge {

    public static King king;
    private String name;
    private List<String> testimonies;

    public King() {
        this.name = "왕";
        this.testimonies = new ArrayList<>();
    }

    public static King getInstance() {
        if(king == null) {
            king = new King();
        }
        return king;
    }

    @Override
    public Witness callWitness(final Rabbit rabbit, final int sequence) {
        return rabbit.orderToEnterTheWitnessStand(sequence);
    }

    @Override
    public String orderTestimony(final Witness witness) {
        return witness.giveEvidence();
    }

    @Override
    public void validateUsefulTestimony(final String testimony, final String judgeName) {
        if(testimony.contains("쓸모 없는")) {
            printChangeWitnessMessage(this.name);
            return;
        }
        printSuccessTrialMessage(this.name);
    }

    public static Judge changeJudgeFromKingToQueen() {
        return Queen.getInstance();
    }

    @Override
    public String getName() {
        return name;
    }
}
