package de.haw.hamburg.sel.stisys;

public class FSBObserver implements Observer, DisplayElement {

    ExamResult currenResult;

    @Override
    public void update(ExamResult result) 
    {
        this.currenResult = result;
        this.display();
    }

    @Override
    public void display() 
    {
        System.out.println("Result published for FSB Observer" );
        System.out.println("_____________________________________________________________" );
        System.out.println("Student Id\tGrade\t\tCourse\\tExam Id" );
        System.out.println("----------\t------------\t--------------\t--------------" );
        System.out.println(this.currenResult.studentId + "  " +"\t\t" + this.currenResult.grade + "  " +"\t\t" + this.currenResult.courseId);
        System.out.println("______________________________________________________________\n\n" );
    }
    
}
