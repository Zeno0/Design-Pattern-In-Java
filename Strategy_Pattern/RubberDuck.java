package Strategy_Pattern;
import Strategy_Pattern.Interfaces.*;

public class RubberDuck extends Duck {   // It extends Duck class.

    public RubberDuck(){
        qb = new Squeak();
        fb = new Flynoway();
    }

    public void display(){           // Abstract method must be implemented.
        System.out.println("I'm a rubber duck");
    }

}