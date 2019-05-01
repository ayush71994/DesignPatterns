package Observer;


import Subject.DataToSendToObservers;
import Subject.Subject;

public class CurrentConditionsDisplay implements Observer {

    //Keeping this so we can remove later if needed
    Subject weatherData;

    String temperature;
    String pressure;
    String humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Subject s, Object o) {
        DataToSendToObservers data = (DataToSendToObservers) o;
        this.temperature = data.getTemperature();
        this.humidity = data.getHumidity();
        this.pressure = data.getPressure();
        // Incase of pull we would use weatherData.getTemperature etc
        display();
    }

    private void display() {
        System.out.println(String.format("Temperature: %s Humidity: %s Pressure: %s",temperature,humidity,pressure));
    }
}
