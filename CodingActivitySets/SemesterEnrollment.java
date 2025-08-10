// PROGRAMMER: Sean Roser

import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SemesterEnrollment
{
    // INSTANCE VARIABLES
    private String studentName;
    private int studentNumber;
    private Set<String> courseSet;
    
    // CONSTRUCTORS
    public SemesterEnrollment(String studentName, int studentNumber)
    {
        if(studentName.equals(""))
        {
            throw new IllegalArgumentException("Invalid Student Name: can not create an enrollment for a student with an empty name");
        }
        else if(studentNumber <= 0)
        {
            throw new IllegalArgumentException("Invalid Student Number: can not create an enrollment for a student that does not have a number that is positive");
        }
        else
        {
            courseSet = new TreeSet<String>();
            this.studentName = studentName;
            this.studentNumber = studentNumber;
        }
    }
    
    public SemesterEnrollment(String filename)throws IOException
    {
        Scanner fileInput = new Scanner(new File(filename));
        courseSet = new TreeSet<String>();
        
        this.studentName = fileInput.nextLine();
        
        this.studentNumber = fileInput.nextInt();
        fileInput.nextLine();
        
        while(fileInput.hasNext())
        {
            courseSet.add(fileInput.nextLine());
        }
        
        fileInput.close();
    }
    
    // INSTANCE METHODS
    public void setStudentName(String studentName)
    {
        if(studentName.equals(""))
        {
            throw new IllegalArgumentException("Invalid Student Name: can not update using an empty student name");
        }
        else
        {
            this.studentName = studentName;
        }
    }
    
    public String getStudentName()
    {
        return studentName;
    }
    
    public void setStudentNumber(int studentNumber)
    {
        if(studentNumber <= 0)
        {
            throw new IllegalArgumentException("Invalid Student Number: can not update using a student number that is not positive");
        }
        else
        {
            this.studentNumber = studentNumber;
        }
    }
    
    public int getStudentNumber()
    {
        return studentNumber;
    }
    
    public void register(String course)
    {
        if(course.equals(""))
        {
            throw new IllegalArgumentException("Invalid Course: can not search for an empty course");
        }
        else
        {
            courseSet.add(course);
        }
    }
    
    public void drop(String course)
    {
        if(course.equals(""))
        {
            throw new IllegalArgumentException("Invalid Course: can not search for an empty course");
        }
        else
        {
            courseSet.remove(course);
        }
    }
    
    public boolean search(String course)
    {
        if(course.equals(""))
        {
            throw new IllegalArgumentException("Invalid Course: can not search for an empty course");
        }
        else
        {
            return courseSet.contains(course);
        }
    }
    
    public void save(String filename)throws IOException
    {
        PrintWriter fileWriter = new PrintWriter(filename);
        
        fileWriter.println(studentName);
        
        fileWriter.println(studentNumber);
        
        for(String element: courseSet)
        {
            fileWriter.println(element);
        }
        
        fileWriter.close();
    }
}



