package pl.pawtel.interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone adamsPhone;
        adamsPhone = new DeskPhone(1234456);
        adamsPhone.powerOn();
        adamsPhone.callPhone(1233456);
        adamsPhone.answer();
    }
}
