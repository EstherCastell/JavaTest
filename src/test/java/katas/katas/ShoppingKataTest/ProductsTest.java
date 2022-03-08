package katas.katas.ShoppingKataTest;
import katas.katas.ShoppingKata.FreeProduct;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductsTest {
    @Test
    void freeProductsIsAlwaysZero() {

        FreeProduct freeProduct = new FreeProduct("perejil");
        assertThat(freeProduct.getPrice(), equalTo(0.0) );

    }
}
