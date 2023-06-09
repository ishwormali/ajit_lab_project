package de.haw.hamburg.sel.stisys;

public class ExamResult {
    int studentId;
    double grade;
    int courseId;
    int examId;

    public ExamResult(int studentId, double grade, int courseId, int examId)
    {
        this.studentId = studentId;
        this.grade = grade;
        this.courseId = courseId;
        this.examId = examId;
    }
}
