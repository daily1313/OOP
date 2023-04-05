import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Thought thought1 = new Thought("Java Study");
        Thought thought2 = new Thought("capstone");
        Thought thought3 = new Thought("Computer Structure");
        Thought thought4 = new Thought("턱걸이");

        Action action1 = new Action("공부", "Java Study");
        Action action2 = new Action("공부", "capstone");
        Action action3 = new Action("공부", "Computer Structure");
        Action action4 = new Action("운동", "턱걸이");

        List<Thought> thoughts = List.of(thought1, thought2, thought3, thought4);
        List<Action> actions = List.of(action1, action2, action3, action4);

        Human human = new Human();

        for (Thought thought : thoughts) {
            human.recordThought(thought);
            System.out.println("계획목록 = " + thought.getContent());
        }

        for (Action action : actions) {
            human.validateEnergy(human.getEnergy());
            human.validateStress(human.getStress());
            human.executeAction(action);
            System.out.println("계획 목록 " + action.getType() + "중에서 " + action.getContent() + "을 실천하였습니다.");
            human.removeAction(action);
        }

        if(human.completeAllActions(actions)) {
            System.out.println("오늘 계획 완벽하게 실천하였습니다.");
            System.out.println("피로도 = " + human.getEnergy());
            System.out.println("만족도 = " + human.getSatisfaction());
            System.out.println("스트레스 = " + human.getStress());
        }
    }
}
