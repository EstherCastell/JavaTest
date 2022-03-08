package katas.katas.ShoppingKataTest;
import katas.katas.ShoppingKata.FoodProduct;
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

        FreeProduct freeProduct = new FreeProduct("perejil", 0.0);
        assertThat(freeProduct.getPrice(), equalTo(0.0) );
    }
    @Test
    void allproductHaveName(){
        FreeProduct freeProduct = new FreeProduct("perejil", 0.0);
        FoodProduct foodProduct = new FoodProduct("fresa", 0.0);

        assertThat(freeProduct.getName(), is(freeProduct.getName()));
        //assertThat(cat.getSound(), is(cat.getSound()));
    }

}
