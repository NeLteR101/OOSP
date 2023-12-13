public class WordDocument extends Document {

    public WordDocument() {
        super();
    }

    public WordDocument(String name, String content) {
        super(name, content);
    }

    @Override
    public Document clone() {
        WordDocument clone = new WordDocument();
        clone.setName(this.name);
        clone.setContent(this.content);
        return clone;
    }
}