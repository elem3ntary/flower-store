package decorator;

import flowerstore.Item;

public class KibbonDecorator extends ItemDecorator{
    public KibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 40 + super.getPrice();
    }
}
