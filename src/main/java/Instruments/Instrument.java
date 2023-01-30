package Instruments;

import Behaviour.IPlay;

public abstract class Instrument implements IPlay {
    private String material;
    private String colour;
    private String type;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Instrument(String material, String colour) {
        this.material = material;
        this.colour = colour;
        this.type = "";
    }
}
