package Instruments;

import Behaviour.ISell;

public class Guitar extends Instrument implements ISell {
    private int numberOfStrings;
    private double buyingPrice;
    private double sellingPrice;

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public Guitar(String material, String colour, int numberOfStrings, double buyingPrice, double sellingPrice) {
        super(material, colour);
        this.numberOfStrings = numberOfStrings;
        this.buyingPrice = buyingPrice;
        this.sellingPrice= sellingPrice;
        this.setType("String");
    }

    @Override
    public String play() {
        return "Wonderwall by Oasis";
    }

    @Override
    public double calculateMarkup() {
        return this.sellingPrice-this.buyingPrice;
    }
}
