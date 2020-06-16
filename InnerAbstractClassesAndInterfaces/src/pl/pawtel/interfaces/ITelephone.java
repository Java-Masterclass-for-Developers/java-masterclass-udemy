package pl.pawtel.interfaces;

public interface ITelephone {
    void powerOn();

    void dial(int phonenumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}
