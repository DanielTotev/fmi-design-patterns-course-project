package factory;

import toy.Bicycle;
import toy.Toy;

public class BicycleFactory implements ToyFactory{
    @Override
    public Toy createToy() {
        return new Bicycle();
    }
}
