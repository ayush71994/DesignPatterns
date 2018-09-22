package behaviour;

public class FlyNoWay implements FlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("I dont fly");
    }
}
