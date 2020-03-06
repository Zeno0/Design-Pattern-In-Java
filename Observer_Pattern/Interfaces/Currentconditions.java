package Observer_Pattern.Interfaces;
public class Currentconditionsdisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherdata;

    //Constructor
    public Currentconditionsdisplay(Subject wd){
        this.wd = weatherdata;
        weatherdata.registerObserver(this);
    }



}