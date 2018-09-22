package ducks;

import behaviour.FlyingBehaviour;
import behaviour.QuackingBehaviour;

public abstract class Duck {
    FlyingBehaviour flyingBehaviour;
    QuackingBehaviour quackingBehaviour;

    public abstract void display();

    public void performFly(){
        flyingBehaviour.fly();
    }

    public void performQuack(){
        quackingBehaviour.quack();
    }

    public void swim(){
        System.out.println("I swim");
    }

    public void setFlyingBehaviour(final FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public void setQuackingBehaviour(final QuackingBehaviour quackingBehaviour) {
        this.quackingBehaviour = quackingBehaviour;
    }
}
