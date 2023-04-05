import java.util.ArrayList;
import java.util.List;

public class Human {

    public List<Thought> thoughts;
    public List<Action> actions;
    private int energy;
    private int stress;
    private int satisfaction;


    public Human() {
        this.thoughts = new ArrayList<>();
        this.actions = new ArrayList<>();
        this.energy = 100;
        this.stress = 0;
        this.satisfaction = 0;
    }

    public void recordThought(Thought thought) {
        thoughts.add(thought);
    }

    public void executeAction(Action action) {
        actions.add(action);
        this.stress += 1;
        this.energy -= 1;
        this.satisfaction += 10;
    }

    public void removeAction(Action action) {
        actions.remove(action);
    }

    public static boolean completeAllActions(List<Action> actions) {
        return actions.isEmpty();
    }

    public int getEnergy() {
        return this.energy;
    }

    public int getStress() {
        return this.stress;
    }

    public int getSatisfaction() {
        return this.satisfaction;
    }

    public static void validateEnergy(final int energy) {
        if(energy < 90) throw new IllegalStateException();
    }
    public static void validateStress(final int stress) {
        if(stress > 50) throw new IllegalStateException();
    }
}
