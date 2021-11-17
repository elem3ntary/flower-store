package factories;

import flowerstore.*;
import order.QuickOrder;

import java.util.ArrayList;
import java.util.List;

public class LowBudgetOrderFactory implements OrderFactory {

    @Override
    public Item create() {
        Flower tulipFlower = new Flower(1, 10, Color.WHITE, FlowerType.Tulip);
        FlowerPack tulipFlowerPack = new FlowerPack(tulipFlower, 3);


        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowerPack(tulipFlowerPack);

        return bucket;
    }
}
