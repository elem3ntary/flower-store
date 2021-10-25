package flowerstore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

}
