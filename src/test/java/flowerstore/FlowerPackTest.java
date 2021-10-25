package flowerstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack ;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Flower flower = new Flower(10,20,Color.WHITE, FlowerType.Tulip);
        flowerPack = new FlowerPack(flower, 5);
    }

    @Test
    void price() {
        assertEquals(5 * 10, flowerPack.price());
    }

    @Test
    void getFlower() {
        assertEquals(FlowerType.Tulip, flowerPack.getFlower().getFlowerType());
    }

    @Test
    void getAmount() {
        assertEquals(5, flowerPack.getAmount());
    }
}