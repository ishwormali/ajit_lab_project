package de.haw.hamburg.sel.stisys;

import java.util.List;

public class Controller implements Runnable {

    Subject resultPublisher;
    public Controller(Subject resultPublisher)
    {
        this.resultPublisher = resultPublisher;
    }

    @Override
    public void run() {
        PublishResult res = new PublishResult();
        List<ExamResult> examResults = res.getResults();
        
        for(ExamResult result : examResults)
        {
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {}
            this.resultPublisher.notifyObserver(result);


        }
    }
    
}
