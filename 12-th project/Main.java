import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DocumentComponent document = new CompositeComponent("Document");

        DocumentComponent header = new CompositeComponent("Header");
        header.addComponent(new TextComponent("Title", "No name"));
        header.addComponent(new TextComponent("Author", "Mikhail Churnusov"));

        DocumentComponent body = new CompositeComponent("Body");
        body.addComponent(new TextComponent("1", "abv."));
        body.addComponent(new GraphicComponent("2", "dsda"));
        body.addComponent(new TextComponent("3", "Tfsaf."));
        body.addComponent(new GraphicComponent("4", "fdsfsdf"));

        document.addComponent(header);
        document.addComponent(body);

        document.print();
    }
}