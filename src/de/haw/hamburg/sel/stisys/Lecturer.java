package de.haw.hamburg.sel.stisys;

public class Lecturer extends SystemUser {

    int lecturerId;
    String department;
    String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setLecturerId(int lecturerId) {
        this.lecturerId = lecturerId;
    }

    public int getLecturerId() {
        return this.lecturerId;
    }

    public void setLabGroupSize() {

    }

    public void exportListOfParticipants() {

    }

    public void reportPVL() {

    }

    public void publishResult() {

    }

    public void viewCourses() {

    }

    public void viewParticipants() {

    }

    public void reportAttendance() {

    }
}
