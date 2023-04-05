import java.util.ArrayList;
import java.util.List;

public class Action {

    private String type;
    private String content;

    public Action(final String type, final String content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

}
