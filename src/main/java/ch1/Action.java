package ch1;

import java.util.ArrayList;
import java.util.List;

public class Action {

    private String type;
    private String content;

    public Action(final String type, final String content) {
        this.type = type;
        this.content = content;
    }

    public void recordAction(final String type, final String content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }


    public void actAction() {
        System.out.println("계획 목록 " + this.type + "중 에서 " + this.content + "를 실천하였습니다.");
    }

}
