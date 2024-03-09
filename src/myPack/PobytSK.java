package myPack;

public class PobytSK extends DocumentsSlovakia {

    public PobytSK (String document , double price, int time) {
        System.out.println("Новий документ");
        setValues(document, price, time);
        System.out.println(getValues());
    }

    @Override
    public String getValues() {
        super.getValues();
        String pobyt = "Назва документа: " + getDocument() + ". Ціна за роботу: " + getPrice() + " євро. Строк роботи: " + getTime() + " днів.";
        return super.getValues();
    }

    @Override
    public void docList() {
        super.docList();
        System.out.println("Список документів для виготовлення побиту : \n1.Паспортні дані \n2...");
    }

}

