package decorators;


import decorator.BasketDecorator;
import decorator.KibbonDecorator;
import decorator.PaperDecorator;
import flowerstore.FlowerBucket;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DecoratorTest {
    private Item buket;

    @BeforeEach
    void setUp(){
        buket = new FlowerBucket();
    }

    @Test
    void basketDecorator() {
       Item modBuket = new BasketDecorator(buket);
       assertEquals(4, modBuket.getPrice());
    }

    @Test
    void kibbonDecorator() {
        Item modBuket = new KibbonDecorator(buket);
        assertEquals(40, modBuket.getPrice());
    }

    @Test
    void paperDecorator() {
        Item modBuket = new PaperDecorator(buket);
        assertEquals(13, modBuket.getPrice());
    }
}
