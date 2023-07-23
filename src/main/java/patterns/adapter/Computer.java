package patterns.adapter;

public class Computer {

    void readData(Usb usb) {
        System.out.println("Connecting to: ");
        System.out.println(usb.getInfo());
    }
}
