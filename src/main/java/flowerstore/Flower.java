package flowerstore;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString @AllArgsConstructor
public class Flower extends Item {
    private double price;
    private double sepalLength;
    private Color color;
    private FlowerType flowerType;

    @Override
    public String getDescription() {
        return null;
    }
}
