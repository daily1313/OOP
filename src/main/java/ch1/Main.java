package ch1;

import ch1.Action;
import ch1.Human;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Thought thought1 = new Thought("Java Study");
        Thought thought2 = new Thought("capstone");
        Thought thought3 = new Thought("Computer Structure");
        Thought thought4 = new Thought("턱걸이");

        Action action1 = new Action("공부", thought1.getThink());
        Action action2 = new Action("공부", thought2.getThink());
        Action action3 = new Action("공부", thought3.getThink());
        Action action4 = new Action("운동", thought4.getThink());

        List<Thought> thoughts = List.of(thought1, thought2, thought3, thought4);
        List<Action> actions = List.of(action1, action2, action3, action4);

        Human human = new Human("승범");

        System.out.println(human.getName() + "의 생각과 행동");
        for (Thought thought : thoughts) {
            human.validateStress(human.getStress());
            human.recordThought(thought.getThink());
        }

        for (Action action : actions) {
            human.validateEnergy(human.getEnergy());
            human.executeAction(action.getType(), action.getContent());
        }

        human.completeMission();

        if(human.isCompleteAllActions()) {
            System.out.println("오늘 계획 완벽하게 실천하였습니다.");
            System.out.println("피로도 = " + human.getEnergy());
            System.out.println("만족도 = " + human.getSatisfaction());
            System.out.println("스트레스 = " + human.getStress());
        }
    }
}
