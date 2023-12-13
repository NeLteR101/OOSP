import java.util.ArrayList;
import java.util.List;

class CompositeComponent extends DocumentComponent {
    private List<DocumentComponent> components = new ArrayList<>();

    public CompositeComponent(String name) {
        super(name);
    }

    public void addComponent(DocumentComponent component) {
        components.add(component);
    }

    public void removeComponent(DocumentComponent component) {
        components.remove(component);
    }

    @Override
    public void print() {
        System.out.println("CompositeComponent: " + name);
        for (DocumentComponent component : components) {
            component.print();
        }
    }
}