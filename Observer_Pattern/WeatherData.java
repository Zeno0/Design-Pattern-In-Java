package Observer_Pattern.Interfaces;
import java.util.ArrayList;
//WeatherData contains data of pressure, temperature and humidity
public class WeatherData implements Subject{
    // Instance variables..
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    // Constructor
    public WeatherData(){
        observers = new ArrayList();
    }
    // implemented method of Subject class
    public void registerObserver(Observer o){
        observers.add(o);  // Observer added in ArrayList
    }
    // implemented method of Subject class
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);  // get the index of existing observer
        if(i>=0){
            observers.remove(i);  // remove it from ArrayList
        }
    }
    // implemented method of Subject class
     public void notifyObserver(){
         // use for loop to notify all the Observers 
        for(int i=0; i<observers.size();i++){
            Observer ob = (Observer) observers.get(i);   // get Observer
            ob.update(temperature, humidity, pressure);  // update Observer
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }

    public void setMeasurement(float temp, float humi, float pres){
        this.temperature = temp;
        this.humidity = humi;
        this.pressure = pres;

        measurementChanged();
    }
    
    public float getTemperature(){
        return temperature;
    }

    
    public float getHumidity(){
        return humidity;
    }


    
    public float getPressure(){
        return pressure;
    }

}