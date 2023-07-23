package patterns.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Usb usb = new UsbImpl();
        computer.readData(usb);
        Usb card = new UsbAdapter(new MemCard());
        computer.readData(card);
    }
}
