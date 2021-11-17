package flowerstore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        Flower flower = new Flower(10, 20, Color.WHITE, FlowerType.Tulip);
        FlowerPack flowerPack = new FlowerPack(flower, 10);

        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack);
    }

    @Test
    void price() {
        assertEquals(100, flowerBucket.getPrice());
    }
}