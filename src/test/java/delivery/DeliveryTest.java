package delivery;

import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DeliveryTest {
    private DHLDeliveryStrategy dhlDelivery;
    private PostDeliveryStrategy postDelivery;

    @BeforeEach
    void setUp() {
        dhlDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();
    }

    @Test
    void testALlDeliveries() {
        assertDoesNotThrow(() -> dhlDelivery.deliver(new ArrayList<Item>()));
        assertDoesNotThrow(() -> postDelivery.deliver(new ArrayList<Item>()));
    }
}
