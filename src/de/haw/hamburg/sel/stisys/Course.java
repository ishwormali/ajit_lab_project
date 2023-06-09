package de.haw.hamburg.sel.stisys;

public class Course {
    
    String courseName;
    int employeeId;
    int courseId;

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public int getEmployeeId()
    {
        return this.employeeId;
    }
    
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCourseName()
    {
        return this.courseName;
    }


    public void setcourseId(int courseId)
    {
        this.courseId = courseId;
    }

    public int getcourseId()
    {
        return this.courseId;
    }

    public void showCourses()
    {

    }
}
