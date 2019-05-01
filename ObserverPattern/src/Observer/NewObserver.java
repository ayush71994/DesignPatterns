package Observer;

import Subject.Subject;

public class NewObserver implements Observer {


    private final Subject weatherData;

    public NewObserver(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Subject s, Object o) {
        System.out.println("New Observer bitches");
    }
}
