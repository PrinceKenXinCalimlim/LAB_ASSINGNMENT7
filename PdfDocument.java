public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;
    private String name;

    public PdfDocument(String fileName, String author, int pageCount, String name) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
        this.name = name;
        System.out.println("Creating a PDF Document prototype.");
    }

    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
    }

    public String getType() {
        return "PDF";
    }

    public Document clone() {
        return new PdfDocument(fileName, author, pageCount, name);
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
