package Observer_Pattern;

import Observer_Pattern.Interfaces.Currentconditionsdisplay;
import Observer_Pattern.Interfaces.WeatherData;

public class Weatherstation {
    public static void main (String args[]){
        WeatherData wd = new WeatherData();
        Currentconditionsdisplay cd = new Currentconditionsdisplay(wd);
        wd.setMeasurement(80, 75, 50.5f);
    }
} 
