package FactoryDocument;

public class PdfDocument implements Document {
    @Override
    public void create() {
        System.out.println("Creating PDF Document");
    }
}
