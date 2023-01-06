package Observable;

import Observer.IObserver;

import java.util.ArrayList;

public class Grades implements IObservable{

    ArrayList<IObserver> observers = new ArrayList<>();
    int grade;

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer:observers)
            observer.update(this.grade);
    }

    public void updateGrade(int updatedGrade){
        this.grade = updatedGrade;
        notifyObservers();
    }
}
