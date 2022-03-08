package katas.katas.DieBremerKata;

public class ComicCharacter implements Singers{

    private String name;
    private String sound;
    private Boolean isSinging = false;


    public ComicCharacter(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public Boolean isSinging() {
        return isSinging;}
    public void startSinging() {
        this.isSinging = true;
    }

    public void dontSing() {
        this.isSinging = false;
    }

    public String alert() {
        if (isSinging) {
            return "The character" + " " + name + " " + "is singing" + " " + sound;
        } else {
            return "The character" + " " + name + " " + "don't want sing";
        }
    }
}
