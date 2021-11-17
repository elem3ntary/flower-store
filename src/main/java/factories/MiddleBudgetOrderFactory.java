package factories;

import flowerstore.*;

public class MiddleBudgetOrderFactory implements OrderFactory{

    @Override
    public Item create() {

        Flower roseFlower = new Flower(10, 20, Color.WHITE, FlowerType.Rose);
        FlowerPack roseFlowerPack = new FlowerPack(roseFlower, 3);

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowerPack(roseFlowerPack);

        return bucket;
    }
}
