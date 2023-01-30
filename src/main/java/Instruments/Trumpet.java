package Instruments;

public class Trumpet extends Instrument {
    private int numberOfValves;

    public Trumpet(String material, String colour, int numberOfValves) {
        super(material, colour);
        this.setType("Brass");
        this.numberOfValves = numberOfValves;
    }

    @Override
    public String play() {
        return "toot toot";
    }
}
