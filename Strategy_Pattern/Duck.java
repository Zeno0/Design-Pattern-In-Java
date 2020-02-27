package Strategy_Pattern;
import Strategy_Pattern.Interfaces.*;

public abstract class Duck {    // Duck class is at the top of every other types of ducks.
    Flybehavior fb;            // Interfaces are taken as instance variables.
    Quackbehavior qb;

    public abstract void display();

    public void performFly(){  // fly method for any type of duck.
        fb.fly();
    }

    public void performQuack(){ // quack method for any type of duck.
        qb.quack();
    }

    public void swim(){
        System.out.println("All ducks can swim!! ");
    }
}
