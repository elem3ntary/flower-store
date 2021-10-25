package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(10,20,Color.WHITE, FlowerType.Tulip);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(20, flower.getSepalLength());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        assertEquals(Color.WHITE, flower.getColor());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.Tulip, flower.getFlowerType());
    }
}