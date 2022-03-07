package katas.katas.DieBremerKata;

import java.util.ArrayList;

public class Directora {
    ArrayList<Animal> coro = new ArrayList<Animal>();

    public Directora(ArrayList<Animal> coro) {
        this.coro = coro;
    }
    public void allAnimalsSing() {

        for (Animal animal : coro) {
            animal.startSinging();
            animal.isSinging();

        }
    }

    public void allAnimalsStopSinging() {
        for (Animal animal : coro) {
            animal.dontSing();
            animal.isSinging();

        }
    }
}
