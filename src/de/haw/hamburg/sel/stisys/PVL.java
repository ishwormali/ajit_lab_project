package de.haw.hamburg.sel.stisys;

public class PVL {
    String studentInfo;
    int labCourseId;
    int courseId;

    public void setCourseId(int courseId)
    {
        this.courseId = courseId;
    }

    public int getCourseId()
    {
        return this.courseId;
    }

    public void setLabCourseId(int labCourseId)
    {
        this.labCourseId = labCourseId;
    }

    public int getLabCourseId()
    {
        return this.labCourseId;
    }

    public void setStudentInfo(String studentInfo)
    {
        this.studentInfo = studentInfo;
    }

    public String getStudentInfo()
    {
        return this.studentInfo;
    }

    public boolean hasPVL()
    {
        return true;
    }
}
