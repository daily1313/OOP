package ch4.witness;

import static ch4.view.View.printEntryWitnessMessage;

public class Chef implements Witness{

    public static Chef chef;
    private final String name;
    private final String testimony;
    private final int sequence;

    public Chef(final String name, final String testimony, final int sequence) {
        this.name = name;
        this.testimony = testimony;
        this.sequence = sequence;
    }

    public static Chef getInstance() {
        if(chef == null) {
            chef = new Chef("요리사", "쓸모 없는 증언", 2);
        }
        return chef;
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
