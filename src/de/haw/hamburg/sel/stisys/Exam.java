package de.haw.hamburg.sel.stisys;

import java.util.Date;

public class Exam {
    int examId;
    Date examDate;
    String examName;

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamName() {
        return this.examName;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public Date getExamDate() {
        return this.examDate;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public int getExamId() {
        return this.examId;
    }

    public void showExamps() {

    }
}
