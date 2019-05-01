package Subject;

import java.util.ArrayList;
import java.util.List;

import Observer.Observer;

public class WeatherData implements Subject {
    private List<Observer> observers;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    private String temperature;
    private String pressure;
    private String humidity;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
            observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        // push notification
        observers.forEach(observer -> observer.update(this, new DataToSendToObservers(getTemperature(), getPressure(), getHumidity())));

        //pull notification
//      observers.forEach(observer -> observer.update(this, null));

    }
}
