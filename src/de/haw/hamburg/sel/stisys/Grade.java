package de.haw.hamburg.sel.stisys;

public class Grade {
    String studentInfo;
    double grade;

    int examId;

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public int getExamId() {
        return this.examId;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setStudentInfo(String studentInfo) {
        this.studentInfo = studentInfo;
    }

    public String getStudentInfo() {
        return this.studentInfo;
    }

    public void showGrade() {

    }
}
