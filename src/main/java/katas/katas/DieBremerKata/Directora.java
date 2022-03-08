package katas.katas.DieBremerKata;

import java.util.ArrayList;

public class Directora  {
    ArrayList<Singers> coro = new ArrayList<Singers>();

    public Directora(ArrayList<Singers> coro) {
        this.coro = coro;
    }
    public void allSing() {
//por cada animal en coro
        for (Singers singers : coro) {
            singers.startSinging();
            singers.isSinging();

        }
    }

    public void allStopSinging() {
        for (Singers singers : coro) {
            singers.dontSing();
            singers.isSinging();

        }
    }
}
