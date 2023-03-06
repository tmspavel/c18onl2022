package usbAdapterExample;

public class Computer {

    public static void main(String[] args) {
        USB cardReader = new CardReader(new MemoryCard());
        cardReader.connectByUSB();
    }
}
