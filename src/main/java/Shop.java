import Behaviour.ISell;
import Instruments.Guitar;
import Instruments.Instrument;
import Items.DrumSticks;
import Items.Item;
import Items.SheetMusic;

import java.util.ArrayList;

public class Shop {
    private static Shop instance = null;
    ArrayList<ISell> instruments;
    ArrayList<ISell> items;


    private int floatCash;

    public Shop(int floatCash) {
        this.instruments = new ArrayList<ISell>();
        this.items  = new ArrayList<ISell>();
        this.floatCash = floatCash;


    }

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop(100);
        }
        return instance;
    }

    public ArrayList<ISell> getInstruments() {
        return instruments;
    }
    public int getFloatCash() {
        return floatCash;
    }

    public void setInstruments(ArrayList<ISell> instruments) {
        this.instruments = instruments;
    }

    public ArrayList<ISell> getDrumSticks() {
        return items;
    }

    public void setDrumSticks(ArrayList<ISell> items) {
        this.items = items;
    }

    public void addInstrument(ISell instrument) {
            System.out.println(instrument);
        if (instrument instanceof Instrument){
            this.instruments.add(instrument);
        }
    }
    public int numberOfInstrumentsForSale() {
        return instruments.size();
    }

    public void addItem(ISell item) {
        if(item instanceof Item){
            this.items.add(item);
        }
    }

    public void removeInstrument(Instrument instrument) {
        this.instruments.remove(instrument);
    }
}
