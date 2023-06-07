package de.haw.hamburg.sel.stisys;

public class ResultPublisherSystem {
    public static void main(String[] args){

        Observer student = new Student();
        Subject subject = new ResultData();
        subject.register(student);
        
        Controller controller = new Controller(subject);
        new Thread(controller).start();

    }
}
