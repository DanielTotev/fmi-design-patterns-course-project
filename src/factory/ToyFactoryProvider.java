package factory;

import exception.InvalidToyTypeException;
import toy.ToyType;

public final class ToyFactoryProvider {
    private ToyFactoryProvider() { }

    public static ToyFactory getToyFactory(ToyType toyType) {
        switch (toyType) {
            case BICYCLE:
                return new BicycleFactory();
            case DOLL:
                return new DollFactory();
            default:
                throw new InvalidToyTypeException();
        }
    }
}
