package de.haw.hamburg.sel.stisys;

import java.util.ArrayList;
import java.util.List;

/**
 * Student
 */
public class Student {

    int studentId;
    String address;
    String department;
    int semester;

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setStudentId(int employeeId) {
        this.studentId = employeeId;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void deRegisterExams() {

    }

    public void registerExams(List<Exam> exams) {

    }

    public void enrolCourses(List<Course> courses) {

    }

    public void enrolLabs(List<Lab> labs) {

    }

    public List<Course> viewCourses() {
        return new ArrayList<Course>();
    }

    public List<ExamResult> viewResults() {
        return new ArrayList<ExamResult>();
    }

    public void viewStudentInformation() {

    }
}