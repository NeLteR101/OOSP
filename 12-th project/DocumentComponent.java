

abstract class DocumentComponent {
    protected String name;

    public DocumentComponent(String name) {
        this.name = name;
    }

    public abstract void print();

    public void addComponent(DocumentComponent component) {
    }
}



