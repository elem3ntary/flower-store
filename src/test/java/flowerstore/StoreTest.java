package flowerstore;

import jdk.jshell.spi.ExecutionControl;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import jdk.jshell.spi.ExecutionControl;
class StoreTest {
    private Store store;
    @BeforeEach
    void setUp() {
        store = new Store();
    }

//    @Test
//    @SneakyThrows
//    void search() {
//        assertThrows(Error.class, () -> store.search("tulip"));
//    }
}