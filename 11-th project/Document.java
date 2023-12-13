import java.util.HashMap;
import java.util.Map;

public abstract class Document implements Cloneable {
    protected String name;
    protected String content;

    public Document() {
        this.name = "1";
        this.content = "";
    }

    public Document(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public abstract Document clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}