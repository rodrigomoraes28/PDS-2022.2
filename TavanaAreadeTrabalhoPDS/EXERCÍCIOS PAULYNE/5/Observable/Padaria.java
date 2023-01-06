package Observable;

import Observer.IObserver;

import java.util.ArrayList;

public class Padaria implements IObservable{

    ArrayList<IObserver> observers = new ArrayList<>();
    String fornada;


    public void novaFormada(String fornada){
        this.fornada = fornada;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (IObserver o: observers){
            o.update(fornada);
        }
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(int position) {
        observers.remove(position);
    }
}
