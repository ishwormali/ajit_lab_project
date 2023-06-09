package de.haw.hamburg.sel.stisys;

public class ResultPublisherMainSystem {
    public static void main(String[] args) 
    {
        Observer student = new StudentObserver();
        FSBObserver fsb = new FSBObserver();
        
        Subject subject = new ResultData();
        subject.register(student);
        subject.register(fsb);
        
        Controller controller = new Controller(subject);
        new Thread(controller).start();
    }
}
