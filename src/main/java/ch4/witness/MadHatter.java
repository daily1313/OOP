package ch4.witness;

import static ch4.view.View.printEntryWitnessMessage;

public class MadHatter implements Witness{

    public static MadHatter madHatter;
    private String name;
    private String testimony;
    private int sequence;

    public MadHatter(final String name, final String testimony, final int sequence) {
        this.name = name;
        this.testimony = testimony;
        this.sequence = sequence;
    }

    public static MadHatter getInstance() {
        if(madHatter == null) {
            madHatter = new MadHatter("모자 징수", "주절주절", 1);
        }
        return madHatter;
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
