import behaviour.FlyRocketPowered;
import ducks.Duck;
import ducks.MallardDuck;
import ducks.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args){
        //Mallard duck
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        //Model duck
        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyingBehaviour(new FlyRocketPowered()); // Dynamically changing behaviour at runtime
        model.performFly();
    }
}
