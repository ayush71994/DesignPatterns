package behaviour;

public class MuteQuack implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
