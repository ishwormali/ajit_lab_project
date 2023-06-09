package de.haw.hamburg.sel.stisys;

import java.util.ArrayList;
import java.util.List;

// Publish result publisher
public class PublishResult  {
    public void getStudentDetails()
    {

    }

    public void getCourseName()
    {

    }

    public List<ExamResult> getResults()
    {
        List<ExamResult> results = new ArrayList<ExamResult>();
        results.add(new ExamResult(1, 3.5, 1, 1));
        results.add(new ExamResult(1, 3.0, 2, 2));
        results.add(new ExamResult(1, 4.0, 3, 3));
        results.add(new ExamResult(2, 3.0, 1, 1));
        results.add(new ExamResult(2, 3.5, 2, 2));
        results.add(new ExamResult(3, 3.0, 1, 1));
        results.add(new ExamResult(4, 2.5, 1, 1));
        results.add(new ExamResult(5, 2.0, 1, 1));
        results.add(new ExamResult(6, 4.0, 1, 1));
        return results;
    }
}
