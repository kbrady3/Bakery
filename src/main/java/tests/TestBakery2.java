package tests;

import model.Bakery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestBakery2 {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testDisplayItem() {
        Bakery bakery = new Bakery("cake", "medium", 15.99);
        System.out.println("Inside testDisplayItem()");
        assertEquals("cake, medium, 15.99", bakery.displayItem());
    }

    @Test
    public void testMix() {
        Bakery bakery = new Bakery("cake", "medium", 15.99);
        System.out.println("Inside testMix()");
        assertNotNull(bakery.mix());
    }

    @Test
    public void testMixNull() {
        Bakery bakery = new Bakery();
        System.out.println("Inside testMixNull()");
        assertNull(bakery.mix());
    }

    @Test
    public void testBake() {
        Bakery bakery = new Bakery("cake", "medium", 15.99);
        System.out.println("Inside testBake()");
        assertNotNull(bakery.bake());
    }

    @Test
    public void testBakeNull() {
        Bakery bakery = new Bakery();
        System.out.println("Inside testBakeNull()");
        assertNull(bakery.bake());
    }
}