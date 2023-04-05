package ch1;

import ch1.Action;
import java.util.ArrayList;
import java.util.List;

public class Human {

    public List<Thought> thoughts;
    public List<Action> actions;
    private String name;
    private int energy;
    private int stress;
    private int satisfaction;

    public Human(final String name) {
        this.name = name;
        this.thoughts = new ArrayList<>();
        this.actions = new ArrayList<>();
        this.energy = 100;
        this.stress = 0;
        this.satisfaction = 0;
    }

    public void recordThought(final String think) {
        Thought thought = new Thought(think);
        thought.recordThinking(thought.getThink());
        thought.processThought();
        thoughts.add(thought);
        this.stress += 1;
    }

    public void executeAction(final String actType, final String actContent) {
        Action action = new Action(actType, actContent);
        action.recordAction(action.getType(), action.getContent());
        action.actAction();
        actions.add(action);
        this.energy -= 1;
        this.satisfaction += 10;
    }

    public String getName() { return name; }

    public int getEnergy() {
        return this.energy;
    }

    public int getStress() {
        return this.stress;
    }

    public int getSatisfaction() {
        return this.satisfaction;
    }

    public void completeMission() {
        this.actions.clear();
    }

    public boolean isCompleteAllActions() {
        return this.actions.isEmpty();
    }

    public static void validateEnergy(final int energy) {
        if(energy < 90) throw new IllegalStateException("피로도가 부족합니다.");
    }
    public static void validateStress(final int stress) {
        if(stress > 50) throw new IllegalStateException("스트레스가 과도합니다.");
    }
}
