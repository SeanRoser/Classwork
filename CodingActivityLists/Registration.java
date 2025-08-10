// PROGRAMMER: Sean Roser

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class Registration
{
    // INSTANCE VARIABLES
    private String student;
    private String semester;
    private LinkedList<String> courseList = new LinkedList<String>();
    
    // CONSTRUCTORS
    public Registration(String student, String semester)
    {
        this.student = student;
        this.semester = semester;
    }
    
    // INSTANCE METHODS
    public String getStudent()
    {
        return student;
    }
    
    public void setStudent(String student)
    {
        this.student = student;
    }
    
    public String getSemester()
    {
        return semester;
    }
    
    public void setSemester(String semester)
    {
        this.semester = semester;
    }
    
    public void addCourse(String course)
    {
        ArrayList<String> correctCourseNames = new ArrayList<String>();
        correctCourseNames.add("CS131");
        correctCourseNames.add("CS150");
        correctCourseNames.add("CS170");
        correctCourseNames.add("CS216");
        correctCourseNames.add("CS231");
        correctCourseNames.add("CS257");
        correctCourseNames.add("CS272");
        
        if(!correctCourseNames.contains(course))
        {
            throw new IllegalArgumentException("Not a legal course name");
        }
        else if(courseList.contains(course))
        {
            throw new IllegalArgumentException("Course already within list");
        }
        else
        {
            courseList.addLast(course);
        }
    }
    
    public void undo()
    {
        if(courseList.size() < 1)
        {
            throw new NoSuchElementException("Unable to remove a course from an empty list");
        }
        else
        {
            courseList.removeLast();
        }
    }
    
    public boolean searchList(String course)
    {
        if(courseList.size() < 1)
        {
            throw new NoSuchElementException("Unable to search an empty list");
        }
        else
        {
            return courseList.contains(course);
        }
    }
    
    public int numberOfCourses()
    {
        return courseList.size();
    }
}