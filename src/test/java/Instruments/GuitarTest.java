package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class GuitarTest {
    Guitar guitar;
    @Before
    public void before(){
        guitar = new Guitar("Wood","Black",6, 50,90);

    }
    @Test
    public void hasANumberOfStrings(){
        assertEquals(6,guitar.getNumberOfStrings());
    }
    @Test
    public void hasAStringType(){
        assertEquals("String",guitar.getType());
    }
    @Test
    public void hasMaterial(){
        assertEquals("Wood",guitar.getMaterial());
    }
    @Test
    public void hasAColour(){
        assertEquals("Black",guitar.getColour());
    }
    @Test
    public void canPlay(){
        assertEquals("Wonderwall by Oasis",guitar.play());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(40, guitar.calculateMarkup(),0.1);
    }



}