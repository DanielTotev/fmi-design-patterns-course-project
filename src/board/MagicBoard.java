package board;

import dwarf.Observer;
import toy.ToyType;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable{
    private final List<Observer> observers = new ArrayList<>();

    private ToyType toyType;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyForChange(ToyType toyType) {
        this.toyType = toyType;
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public ToyType getToyType() {
        return toyType;
    }
}
