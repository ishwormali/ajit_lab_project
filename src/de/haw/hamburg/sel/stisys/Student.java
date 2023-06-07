package de.haw.hamburg.sel.stisys;

public class Student implements Observer, DisplayElement {

    ExamResult currenResult;

    @Override
    public void update(ExamResult result) {
        this.currenResult = result;
        this.display();
    }
    @Override
    public void display() {
        System.out.println("Result published" );
        System.out.println("_____________________" );
        System.out.println("Student Id\tGrade" );
        System.out.println("----------\t-----" );
        System.out.println(this.currenResult.studentId + "  " +"\t\t" + this.currenResult.grade );
        System.out.println("_____________________\n\n" );
    }

    
}
