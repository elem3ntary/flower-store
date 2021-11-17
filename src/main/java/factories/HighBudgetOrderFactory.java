package factories;

import flowerstore.*;

public class HighBudgetOrderFactory implements OrderFactory{

    @Override
    public Item create() {
        Flower tulipFlower = new Flower(5, 30, Color.WHITE, FlowerType.Tulip);
        FlowerPack tulipFlowerPack = new FlowerPack(tulipFlower, 11);

        Flower roseFlower = new Flower(1, 10, Color.WHITE, FlowerType.Rose);
        FlowerPack roseFlowerPack = new FlowerPack(roseFlower, 25);

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowerPack(roseFlowerPack);
        bucket.addFlowerPack(tulipFlowerPack);

        return bucket;
    }
}
