package FactoryDocument;

public class ExcelDocument implements Document{
    @Override
    public void create() {
        System.out.println("Creating Excel Document");
    }
}
