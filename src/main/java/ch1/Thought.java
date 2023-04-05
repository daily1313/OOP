package ch1;

import java.util.ArrayList;
import java.util.List;

public class Thought {

    public String think;

    public Thought(final String think) {
        this.think = think;
    }

    public void recordThinking(final String think) {
        this.think = think;
    }

    public String getThink() {
        return think;
    }

    public void processThought() {
        System.out.println("오늘 계획 " + this.think + "를 세웠습니다. ");
    }


}
