package Strategy_Pattern;
public class Ducksim {
    public static void main (String args[]){
        Duck m = new MallardDuck();
        m.display();
        m.performQuack();
        m.performFly();

        Duck r = new RubberDuck();
        r.display();
        r.performQuack();
        r.performFly();

        Duck s = new SilentDuck();
        s.display();
        s.performQuack();
        s.performFly();

    }
}
