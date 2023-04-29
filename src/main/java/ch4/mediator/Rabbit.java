package ch4.mediator;


import ch4.judge.Judge;
import ch4.witness.Witness;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Rabbit {

    private List<Witness> witnesses;

    public Rabbit(final List<Witness> witnesses) {
        this.witnesses = witnesses;
    }

    public Witness orderToEnterTheWitnessStand(int sequence) {
        return witnesses.get(sequence);
    }
}
