package flowerstore;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FlowerBucket {
    @Builder.Default
    private List<FlowerPack> flowerPackList = new ArrayList<>() {
    };


    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPackList.add(flowerPack);
    }

    public double price() {
        double totalPrice = 0;
        for (FlowerPack flowerPack : flowerPackList
        ) {
            totalPrice += flowerPack.price();
        }
        return totalPrice;
    }

    public boolean containsFlowerType(FlowerType flowerType) {
        for(FlowerPack flowerPack: flowerPackList) {
            if (flowerPack.getFlowerType() == flowerType) {
                return true;
            }
        }
        return false;
    }

}
