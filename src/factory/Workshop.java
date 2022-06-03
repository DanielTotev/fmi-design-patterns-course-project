package factory;

import toy.Toy;
import toy.ToyType;

public class Workshop {

    public Toy getToy(ToyType toyType) {
        ToyFactory toyFactory = ToyFactoryProvider.getToyFactory(toyType);
        return toyFactory.createToy();
    }
}
