package katas.katas.DieBremerKata;

import java.util.ArrayList;

public class Directora {
    ArrayList<Animal> coro = new ArrayList<Animal>();

    public Directora(ArrayList<Animal> coro) {
        this.coro = coro;
    }
    public void allAnimalsSing() {
        //coro.add(new Cat("Lola", "miau"));
        //coro.add(new Donkey("Pedro", "Ioo0"));
        for (Animal animal : coro) {
            animal.sing();
        }

        //return allAnimalsSing();

    }

}
