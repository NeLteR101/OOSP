import java.util.HashMap;
import java.util.Map;

public class DocumentManager {
    private Map<String, Document> templates;

    public DocumentManager() {
        templates = new HashMap<>();
    }

    public void addTemplate(String name, Document template) {
        templates.put(name, template);
    }

    public Document getTemplate(String name) {
        Document template = templates.get(name);
        if (template != null) {
            return template.clone();
        }
        return null;
    }
}