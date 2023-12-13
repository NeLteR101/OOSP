class TextComponent extends DocumentComponent {
    private String text;

    public TextComponent(String name, String text) {
        super(name);
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("TextComponent: " + name + ", Text: " + text);
    }
}