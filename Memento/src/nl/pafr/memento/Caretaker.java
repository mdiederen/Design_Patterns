package nl.pafr.memento;

import java.util.ArrayList;

class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {

        mementos.add(m);
    }

    public Memento getMemento(int version) {

        return mementos.get(version);
    }
}
