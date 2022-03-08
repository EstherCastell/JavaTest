package katas.katas.DieBremerKata;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.ArrayList;

public class DirectoraTest {

    @Test
    void directoraOrderToSing() {

        ArrayList<Singers> coro = new ArrayList<Singers>();
        coro.add(new Cat("Lola", "miau"));
        coro.add(new Donkey("Pedro", "Iooo"));

        Directora directora = new Directora(coro);
        directora.allSing();
        assertEquals(2,coro.size());
        assertTrue(coro.get(0).isSinging());
    }

    @Test
    void whatAlertAreAnimalSinging() {
        ArrayList<Singers> coro = new ArrayList<Singers>();
        coro.add(new Cat("Lola", "miau"));
        coro.add(new Donkey("Pedro", "Iooo"));

        Directora directora = new Directora(coro);
        directora.allSing();

        assertThat(coro.get(1).alert(), equalTo("The donkey Pedro is singing Iooo"));

    }

    @Test
    void directoraOrderStopSinging(){
        ArrayList<Singers> coro = new ArrayList<Singers>();
        coro.add(new Cat("Lola", "miau"));
        coro.add(new Donkey("Pedro", "Iooo"));

        Directora directora = new Directora(coro);
        directora.allSing();
        directora.allStopSinging();
        assertFalse(coro.get(0).isSinging());
    }

    @Test
    void whatAlertAreAnimalDontSinging() {
        ArrayList<Singers> coro = new ArrayList<Singers>();
        coro.add(new Cat("Lola", "miau"));
        coro.add(new Donkey("Pedro", "Iooo"));

        Directora directora = new Directora(coro);
        directora.allStopSinging();
        assertThat(coro.get(1).alert(), equalTo("The donkey Pedro don't want sing"));

    }
    @Test
    void directoraAddAnimalsAndComicCharacters() {
        ArrayList<Singers> coro = new ArrayList<Singers>();
        coro.add(new Cat("Lola", "miau"));
        coro.add(new ComicCharacter("Piolyn", "lalala"));
        coro.add(new ComicCharacter("Popeye", "Tralara"));

        Directora directora = new Directora(coro);
        assertThat(coro.size(), equalTo(3));
    }
}
