package ch4.judge;

import ch4.mediator.Rabbit;
import ch4.witness.Witness;
import java.util.List;

public interface Judge {

    Witness callWitness(final Rabbit rabbit, final int sequence);

    String orderTestimony(final Witness witness);

    void validateUsefulTestimony(final String testimony, final String judgeName);

    String getName();
}
