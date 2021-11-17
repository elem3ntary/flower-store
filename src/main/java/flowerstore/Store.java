package flowerstore;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Store {
    @Builder.Default
    private List<FlowerBucket> flowerBuckets = new ArrayList<>() {
    };
    public void search(String flowerName){
        // get flower pack containing flower by name
        // if contains numbers -> search by price
        // if contains string -> seach by flower name
        // tulip $100 x10
//        Matcher matcher = Pattern.compile("(\\S+)|(\\$\\d+)|(x\\d+)").matcher(query);
        FlowerType flowerType = FlowerType.valueOf(flowerName);
        List<FlowerBucket> bucketsContainingFlower = flowerBuckets.stream()
                .filter(flowerBucket -> flowerBucket.containsFlowerType(flowerType))
                .collect(Collectors.toList());
        System.out.println("I've found some buckets for you!");
        System.out.println(bucketsContainingFlower);

    }

    public void addFlowerBucket(FlowerBucket flowerBucket) {flowerBuckets.add(flowerBucket);}

}
