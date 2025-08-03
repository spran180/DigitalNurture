package FactoryDocument;

public class WordDocument implements Document {
    @Override
    public void create() {
        System.out.println("Creating Word Document");
    }
}
