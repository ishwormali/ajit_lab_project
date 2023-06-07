package de.haw.hamburg.sel.stisys;

import java.util.ArrayList;
import java.util.List;

public class ResultData implements Subject {
    
    List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(ExamResult result) {
        for(Observer observer : observers){
            observer.update(result);
        }
    }
    
}
