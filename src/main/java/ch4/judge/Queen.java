package ch4.judge;

import static ch4.view.View.printChangeWitnessMessage;
import static ch4.view.View.printSuccessTrialMessage;

import ch4.mediator.Rabbit;
import ch4.witness.Witness;
import java.util.ArrayList;
import java.util.List;

public class Queen implements Judge {

    public static Queen queen;
    private String name;
    private List<String> testimonies;

    public Queen() {
        this.name = "여왕";
        this.testimonies = new ArrayList<>();
    }

    public static Queen getInstance() {
        if(queen == null) {
            queen = new Queen();
        }
        return queen;
    }

    @Override
    public Witness callWitness(Rabbit rabbit, int sequence) {
        return rabbit.orderToEnterTheWitnessStand(sequence);
    }

    @Override
    public String orderTestimony(Witness witness) {
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

    public String getName() {
        return name;
    }
}
