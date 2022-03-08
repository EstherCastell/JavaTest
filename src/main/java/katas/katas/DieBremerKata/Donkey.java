package katas.katas.DieBremerKata;

public class Donkey extends Animal{

    public Donkey(String name, String sound) {
        super(name, sound);
    }

    @Override
    public String alert() {
        if (isSinging()) {
            return "The donkey" + " " + getName() + " " + "is singing" + " " + getSound();
        } else {
            return "The donkey" + " " + getName() + " " + "don't want sing";
        }
    }
}
