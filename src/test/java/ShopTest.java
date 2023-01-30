import Instruments.Guitar;
import Items.DrumSticks;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Guitar guitar1;
    Guitar guitar2;
    DrumSticks drumSticks;
    SheetMusic sheetMusic;
    @Before
    public void before() {
        guitar1 = new Guitar("Wood", "Black", 6, 50, 90);
        guitar2 = new Guitar("Wood", "Yellow", 6, 150, 240);
        drumSticks = new DrumSticks("Drumsticks", 5, 10);
        sheetMusic = new SheetMusic("Sheet Music", 0.5, 2);


    }
    @Test
    public void getAllInstrumentsForSale(){
        Shop shop = Shop.getInstance();
        shop.addInstrument(guitar1);
        assertEquals(1, shop.numberOfInstrumentsForSale());
    }
    @Test
    public void cantAddAnItemToInstrumentsSale(){
        Shop shop = Shop.getInstance();
        shop.addInstrument(drumSticks);
        shop.addInstrument(sheetMusic);
        assertEquals(1, shop.numberOfInstrumentsForSale());
    }
    @Test
    public void removeInstrumentFromShop(){
        Shop shop = Shop.getInstance();
        shop.addInstrument(guitar2);
        shop.removeInstrument(guitar2);
        assertEquals(1, shop.numberOfInstrumentsForSale());
    }
    @Test
    public void getItemsForSale(){
        Shop shop = Shop.getInstance();
        shop.addItem(drumSticks);
        shop.addItem(sheetMusic);
        assertEquals(1, shop.numberOfInstrumentsForSale());
    }
    @Test
    public void getFloatCash(){
        Shop shop = Shop.getInstance();
        assertEquals(100, shop.getFloatCash());
    }
}
