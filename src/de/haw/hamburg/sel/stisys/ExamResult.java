package de.haw.hamburg.sel.stisys;

public class ExamResult {
    int studentId;
    double grade;
    int courseId;

    public ExamResult(int studentId, double grade, int courseId)
    {
        this.studentId = studentId;
        this.grade = grade;
        this.courseId = courseId;
    }
}
