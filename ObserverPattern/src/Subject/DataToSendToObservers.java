package Subject;

public class DataToSendToObservers {

    public String getTemperature() {
        return temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    String temperature;
    String pressure;
    String humidity;

    public DataToSendToObservers(String temperature,
        String pressure,
        String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
