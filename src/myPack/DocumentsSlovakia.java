package myPack;

import java.util.Scanner;

public class DocumentsSlovakia {

    private boolean isReady;
    private String document;
    private double price;
    private int time;

    public DocumentsSlovakia() {
    }

    public DocumentsSlovakia (String document , double price, int time) {

    }
    public String getDocument() {
        return document;
    }

    public double getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    public void getHello() {
        System.out.println("Вітаємо, скристуйтесь нашими послугами, при виготовленні документів!!!");
    }

    public void setReady (boolean isReady) {
        this.isReady = isReady;
        if (isReady)
            System.out.println("Документ готовий");
        else
            System.out.println("Документ не готовий");
    }

    public void setValues (String document , double price, int time) {
        this.document = document;
        this.price = price;
        this.time = time;

    }

    public String getValues() {
        String info = "Назва документа: " + document + ". Ціна за роботу: " + price + " євро. Строк роботи: " + time + " днів.";
        return info;
    }

    public void docList() {
        System.out.println();
    }
}

