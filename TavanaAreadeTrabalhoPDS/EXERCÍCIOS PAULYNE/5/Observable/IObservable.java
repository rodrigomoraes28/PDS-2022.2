package Observable;

import Observer.IObserver;

public interface IObservable {

    public void notifyObservers();
    public void addObserver(IObserver observer);
    public void removeObserver(int position);

}
