package Strategy_Pattern;
import Strategy_Pattern.Interfaces.*;

public class MallardDuck extends Duck {   // It extends Duck class.

    public MallardDuck(){
        qb = new Quack();
        fb = new Flywithwings();
    }

    public void display(){      // Abstract method must be implemented.
        System.out.println("I'm a real mallard Duck.");
    }

}