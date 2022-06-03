package factory;

import toy.Doll;
import toy.Toy;

public class DollFactory implements ToyFactory {

    @Override
    public Toy createToy() {
        return new Doll();
    }
}
