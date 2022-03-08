package katas.katas.DieBremerKata;
// siempre en private
public abstract class Animal implements Singers {
    private String name;
    private String sound;
    private Boolean isSinging = false;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

//geters y setters todos en public
    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }
//funciones en protected

    public Boolean isSinging() {
        return isSinging;

    }
    public void startSinging() {
        this.isSinging = true;
    }

    public void dontSing() {
        this.isSinging = false;
    }

    public String alert() {
        if (isSinging) {
            return "The animal" + " " + name + " " + "is singing" + " " + sound;
        } else {
            return "The animal" + " " + name + " " + "don't want sing";
        }
        }
    }

