package flowerstore;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString @AllArgsConstructor
public class Flower {
    private double price;
    private double sepalLength;
    private Color color;
    private FlowerType flowerType;
}
