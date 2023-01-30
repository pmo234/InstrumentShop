package Items;

import Behaviour.ISell;

public class SheetMusic extends Item implements ISell {


    public SheetMusic(String description, double buyingPrice, int sellingPrice) {
        super(description, buyingPrice, sellingPrice);
    }

    @Override
    public double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
