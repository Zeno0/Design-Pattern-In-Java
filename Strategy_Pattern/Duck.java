public abstract class Duck{
    Flybehavior fb;
    Quackbehavior qb;

    public abstract void display();

    public void performFly(){
        fb.fly();
    }

    public void performQuack(){
        qb.quack();
    }

    public void swim(){
        System.out.println("All ducks can swim!! ");
    }
}
