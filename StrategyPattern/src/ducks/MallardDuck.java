package ducks;

import behaviour.FlyWithWings;
import behaviour.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackingBehaviour = new Quack();
        flyingBehaviour = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am a Mallard duck");
    }

}