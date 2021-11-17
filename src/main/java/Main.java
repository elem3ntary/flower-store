import flowerstore.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlowerBucket flowerBucket1 = new FlowerBucket(); // buket 1
        FlowerBucket flowerBucket2 = new FlowerBucket(); // buket 2


        Flower tulipFlower = new Flower(10, 20, Color.WHITE, FlowerType.Tulip);
        FlowerPack tulipFlowerPack = new FlowerPack(tulipFlower, 10);

        Flower roseFlower = new Flower(20, 30, Color.WHITE, FlowerType.Rose);
        FlowerPack roseFlowerPack = new FlowerPack(roseFlower, 10);


        flowerBucket1.addFlowerPack(tulipFlowerPack);
        flowerBucket2.addFlowerPack(roseFlowerPack);

        Store store = new Store();
        store.addFlowerBucket(flowerBucket2);
        store.addFlowerBucket(flowerBucket1);

        store.search("Tulip");
    }


}
