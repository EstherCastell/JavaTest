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
    void allproductHaveNameAndPrice(){
        FreeProduct freeProduct = new FreeProduct("platano", 0.0);
        FoodProduct foodProduct = new FoodProduct("fresa", 0.5);

        assertThat(freeProduct, hasProperty("name"));
        assertThat(foodProduct, hasProperty("name"));
        assertThat(freeProduct, hasProperty("price"));
        assertThat(foodProduct, hasProperty("price"));
    }
    /*@Test
    void foodProductsCanHaveADiscount(){
        FoodProduct foodProduct = new FoodProduct("sandia", 5.0);
        FoodProduct.applyDiscount();
        assertThat(foodProduct.discount(), equalTo("discount"));
    }*/

}
