package katas.katas.DieBremerKata;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

import java.util.ArrayList;

public class DirectoraTest {

    @Test
    void directoraOrderToSing() {

        ArrayList<Animal> coro = new ArrayList<>();

        Directora directora = new Directora(coro);

        directora.allAnimalsSing();

        coro.add(new Cat("Lola", "miau"));
        coro.add(new Donkey("Pedro", "Ioo0"));

        assertEquals(1,coro.size());
    }


}
