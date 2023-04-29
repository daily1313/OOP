package ch4.witness;

import static ch4.view.View.printEntryWitnessMessage;

public class Alice implements Witness{

    public static Alice alice;
    private String name;
    private String testimony;
    private int sequence;

    public Alice(final String name, final String testimony, final int sequence) {
        this.name = name;
        this.testimony = testimony;
        this.sequence = sequence;
    }

    public static Alice getInstance() {
        if(alice == null) {
            alice = new Alice("엘리스", "쓸모 있는 증언", 3);
        }
        return alice;
    }

    public String getName() {
        return name;
    }

    @Override
    public void enterTheWitnessStand() {
        printEntryWitnessMessage(this.sequence, this.name);
    }

    @Override
    public String giveEvidence() {
        return testimony;
    }
}
