package katas.katas.DieBremerKata;

public class Cat extends Animal {


    public Cat(String name, String sound) {
        super(name, sound);
    }

    @Override

    protected String alert() {
        if (startsSinging()) {
            return "The cat" + " " + getName() + " " + "is singing" + " " + getSound();
        } else {
            return "The cat" + " " + getName() + " " + "don't want sing";
        }
    }
}
