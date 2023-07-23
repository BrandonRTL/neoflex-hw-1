package patterns.adapter;

public class UsbImpl implements Usb {


    @Override
    public String getInfo() {
        return "Usb";
    }
}
