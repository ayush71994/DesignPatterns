import Observer.CurrentConditionsDisplay;
import Observer.NewObserver;
import Subject.WeatherData;

public class WeatherDataSimulator {

    public static void main(String[] args){

        //Subject
        WeatherData weatherData = new WeatherData();

        //Intialise and register observers
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        NewObserver newObserver = new NewObserver(weatherData);

        //Change measurements
        weatherData.setHumidity("123");
        weatherData.setTemperature("13");
        weatherData.setPressure("lots");
        weatherData.measurementsChanged();;

        //Change measurements
        weatherData.setPressure("little less");
        weatherData.measurementsChanged();
    }
}
