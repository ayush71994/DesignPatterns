package ducks;

import behaviour.FlyNoWay;
import behaviour.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyingBehaviour = new FlyNoWay();
        quackingBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
