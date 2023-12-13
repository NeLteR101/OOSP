public class Main {
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();

        WordDocument wordTemplate = new WordDocument("Word Template", "Word Document");
        PDFDocument pdfTemplate = new PDFDocument("PDF Template", "PDF Document");

        documentManager.addTemplate("WordTemplate", wordTemplate);
        documentManager.addTemplate("PdfTemplate", pdfTemplate);

        Document clonedWordDocument = documentManager.getTemplate("WordTemplate");
        Document clonedPdfDocument = documentManager.getTemplate("PdfTemplate");

        System.out.println(clonedWordDocument.getName());
        System.out.println(clonedWordDocument.getContent());

        System.out.println(clonedPdfDocument.getName());
        System.out.println(clonedPdfDocument.getContent());
    }
}