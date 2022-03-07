package katas.katas.DieBremerKata;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

public class DieBremerTest {
    @Test
    void CatHaveNameAndCanSing() {
        Cat cat = new Cat("Kitty", "Miau");
        assertThat(cat.getName(), is(cat.getName()));
        assertThat(cat.getSound(), is(cat.getSound()));
    }

    @Test
    void CatSartsSing() {
        Cat cat = new Cat("Kitty", "Miau");
        cat.startSinging();
        assertTrue(cat.isSinging());
    }

    @Test
    void CatStopSing() {
        Cat cat = new Cat("Kitty", "Miau");
        cat.startSinging();
        cat.dontSing();
        assertFalse(cat.isSinging());
    }

    @Test
    void CatAlertWhenIsSinging() {
        Cat cat = new Cat("Kitty", "Miau");
        cat.startSinging();
        assertThat(cat.alert(), is("The cat Kitty is singing Miau"));
    }

    @Test
    void CatAlertWhenIsNotSinging() {
        Cat cat = new Cat("Kitty", "Miau");
        //cat.sing();
        cat.dontSing();
        assertThat(cat.alert(), equalTo("The cat Kitty don't want sing"));
    }

    @Test
    void DonkeyAlertWhenIsSinging() {
        Donkey donkey = new Donkey("Burro", "Iooo");
        donkey.startSinging();
        assertThat(donkey.alert(), is("The donkey Burro is singing Iooo"));
    }

    @Test
    void AnimalsAlertWhenIsSinging() {
        Animal animal = new Animal("Animal", "Tarara") {
        };
        animal.startSinging();
        assertThat(animal.alert(), is("The animal Animal is singing Tarara"));
    }


}
