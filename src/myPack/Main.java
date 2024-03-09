package myPack;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        DocumentsSlovakia Hi = new DocumentsSlovakia();
        Hi.getHello();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву документа: ");
        String doc = scanner.nextLine();
        if(doc.equals("Побит")||doc.equals("побит")||doc.equals("Pobyt")||doc.equals("pobyt")) {
            PobytSK pobyt = new PobytSK("Побит", 1800, 90);
            pobyt.setReady(false);
            pobyt.docList();
        } else if (doc.equals("Вступ")||doc.equals("вступ")||doc.equals("vstup")||doc.equals("Vstup")) {
            VstupSK vstup = new VstupSK("Вступ", 2000, 180);
            vstup.setReady(false);
            vstup.docList();
        }


    }
}