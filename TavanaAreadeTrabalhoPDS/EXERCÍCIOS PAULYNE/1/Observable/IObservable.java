package Observable;

import Observer.IObserver;

public interface IObservable {

    public void addObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers();

}
