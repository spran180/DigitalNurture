import FactoryDocument.*;

public class Main {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new DocumentFactory();
        Document pdf = documentFactory.createDocument("PDF");
        Document word = documentFactory.createDocument("Word");
        Document excel = documentFactory.createDocument("Excel");

        pdf.create();
        word.create();
        excel.create();
    }
}
