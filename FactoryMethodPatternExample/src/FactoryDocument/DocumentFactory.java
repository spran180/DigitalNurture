package FactoryDocument;

public class DocumentFactory {
    public Document createDocument(String type) {
        switch (type) {
            case "Excel":
                return new ExcelDocument();
            case "Word":
                return new WordDocument();
            case "PDF":
                return new PdfDocument();
        }

        return null;
    }
}
