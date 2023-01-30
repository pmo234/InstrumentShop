package Instruments;

public class Piano extends Instrument{
    public Piano(String material, String colour) {
        super(material, colour);
        this.setType("Piano");
    }

    @Override
    public String play() {
        return "tinkle tinkle";
    }
}
