package Observer_Pattern.Interfaces;
public interface Subject {
    public void registerObserver(Observer o);  // registers the observer by taking it as an argument
    public void removeObserver(Observer o);    // removes the observer by taking it as an argumrnt 
    public void notifyObserver();              // it notifies the observer.
}
