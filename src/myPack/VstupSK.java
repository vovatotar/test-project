package myPack;

public class VstupSK extends DocumentsSlovakia {

    public VstupSK (String document , double price, int time) {
        System.out.println("Новий документ");
        setValues(document, price, time);
        System.out.println(getValues());
    }
    @Override
    public String getValues() {
        super.getValues();
        String vstup = "Назва документа: " + getDocument() + ". Ціна за роботу: " + getPrice() + " євро. Строк роботи: " + getTime() + " днів.";
        return super.getValues();
    }
    @Override
    public void docList() {
        super.docList();
        System.out.println("Список документів для виготовлення на вступ : \n1.Паспортні дані \n2...\n3...");
    }

}
