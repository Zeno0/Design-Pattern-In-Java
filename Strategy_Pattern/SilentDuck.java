package Strategy_Pattern;
import Strategy_Pattern.Interfaces.*;

public class SilentDuck extends Duck{   // It extends Duck class.
    public SilentDuck(){
        qb = new Mutequack();
        fb = new Flywithwings();
    }
    public void display(){             // Abstract method must be implemented.
        System.out.println("I'm Silent Duck");
    }

}