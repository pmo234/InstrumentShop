package Items;

import Behaviour.ISell;

public class DrumSticks extends Item implements ISell {


    public DrumSticks(String description, int buyingPrice, int sellingPrice) {
        super(description, buyingPrice, sellingPrice);
    }

    @Override
    public double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
