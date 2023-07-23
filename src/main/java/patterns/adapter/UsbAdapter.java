package patterns.adapter;

public class UsbAdapter implements Usb {

    private final MemCard card;

    public UsbAdapter(MemCard card) {
        this.card = card;
    }

    @Override
    public String getInfo() {
        return "UsbAdapter" + card.getInfo();
    }
}
