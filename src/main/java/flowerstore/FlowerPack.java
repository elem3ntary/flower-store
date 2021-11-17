package flowerstore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter @AllArgsConstructor @ToString
public class FlowerPack {
    private Flower flower;
    private int amount;

    public double price() {
        return flower.getPrice() * amount;
    }
    public FlowerType getFlowerType() {
        return flower.getFlowerType();
    }
}
