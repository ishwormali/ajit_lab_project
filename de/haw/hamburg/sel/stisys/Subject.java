package de.haw.hamburg.sel.stisys;

public interface Subject {
    public void register(Observer o);

    public void unregister(Observer o);

    public void notifyObserver(ExamResult result);

}