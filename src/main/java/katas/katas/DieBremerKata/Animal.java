package katas.katas.DieBremerKata;
// siempre en private
public abstract class Animal {
    private String name;
    private String sound;
    private Boolean startsSinging = false;

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

    protected Boolean startsSinging() {
        return startsSinging;

    }
    protected void sing() {
        this.startsSinging = true;
    }

    protected void dontSing() {
        this.startsSinging = false;
    }

    protected String alert() {
        if (startsSinging) {
            return "The animal" + " " + name + " " + "is singing" + " " + sound;
        } else {
            return "The animal" + " " + name + " " + "don't want sing";
        }
        }
    }

