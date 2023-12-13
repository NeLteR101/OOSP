public class PDFDocument extends Document {

    public PDFDocument() {
        super();
    }

    public PDFDocument(String name, String content) {
        super(name, content);
    }

    @Override
    public Document clone() {
        PDFDocument clone = new PDFDocument();
        clone.setName(this.name);
        clone.setContent(this.content);
        return clone;
    }
}