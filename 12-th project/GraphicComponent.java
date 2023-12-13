class GraphicComponent extends DocumentComponent {
    private String imagePath;

    public GraphicComponent(String name, String imagePath) {
        super(name);
        this.imagePath = imagePath;
    }

    @Override
    public void print() {
        System.out.println("GraphicComponent: " + name + ", ImagePath: " + imagePath);
    }
}