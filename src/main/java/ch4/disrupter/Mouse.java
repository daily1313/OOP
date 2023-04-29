package ch4.disrupter;


import ch4.witness.Witness;
import java.util.List;

public class Mouse {

    public void killChef(final List<Witness> witnesses, final int chefIndex) {
        Witness chef = witnesses.get(chefIndex);
        chef = null;
        System.out.println("요리사는 쥐의 방해를 받아 사라졌습니다.");
    }
}
