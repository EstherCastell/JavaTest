package katas.katas.DieBremerKata;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.springframework.test.util.AssertionErrors.assertTrue;

import java.util.ArrayList;

public class DirectoraTest {

    @Test
    void directoraOrderToSing() {

        ArrayList<Animal> coro = new ArrayList<Animal>();
        coro.add(new Cat("Lola", "miau"));
        coro.add(new Donkey("Pedro", "Iooo"));

        Directora directora = new Directora(coro);
        directora.allAnimalsSing();
        assertEquals(2,coro.size());
        //assertTrue(coro.get(0).isSinging());
    }

    @Test
    void whatAlertAreAnimalSinging() {
        ArrayList<Animal> coro = new ArrayList<Animal>();
        coro.add(new Cat("Lola", "miau"));
        coro.add(new Donkey("Pedro", "Iooo"));

        Directora directora = new Directora(coro);
        directora.allAnimalsSing();

        assertThat(coro.get(1).alert(), equalTo("The donkey Pedro is singing Iooo"));

    }

    @Test
    void directoraOrderStopSinging(){
        ArrayList<Animal> coro = new ArrayList<Animal>();
        coro.add(new Cat("Lola", "miau"));
        coro.add(new Donkey("Pedro", "Iooo"));

        Directora directora = new Directora(coro);
        directora.allAnimalsSing();
        directora.allAnimalsStopSinging();
        assertFalse(coro.get(0).isSinging());


    }
}
