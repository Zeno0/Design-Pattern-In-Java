package Observer_Pattern.Interfaces;
public class Currentconditionsdisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherdata;

    //Constructor
    public Currentconditionsdisplay(Subject wd){
        this.weatherdata = wd;
        wd.registerObserver(this);
    }

    public void update(float temp, float hum, float per){
        this.temperature = temp;
        this.humidity = hum;
        display();
    }

    public void display(){
        System.out.println("Current Conditions: "+ temperature+" degrees and "+humidity+"% humidity");
    }



}