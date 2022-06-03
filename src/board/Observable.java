package board;

import dwarf.Observer;
import toy.ToyType;

public interface Observable {
    void register(Observer observer);

    void notifyForChange(ToyType toyType);
}
