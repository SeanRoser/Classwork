// PROGRAMMER: Sean Roser

import java.util.Map;
import java.util.LinkedHashMap;
import java.io.File;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReportCard
{
    // INSTANCE VARIABLES
    private String studentName;
    private int studentNumber;
    private Map<String, String> gradeMap;
    
    // CONSTRUCTORS
    public ReportCard(String studentName, int studentNumber)
    {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        gradeMap = new LinkedHashMap<String, String>();
    }
    
    public ReportCard(String filename) throws IOException
    {
        Scanner fileInput = new Scanner(new File(filename));
        gradeMap = new LinkedHashMap<String, String>();
        
        this.studentName = fileInput.nextLine();
        this.studentNumber = fileInput.nextInt();
        fileInput.nextLine();
        
        while(fileInput.hasNext())
        {
            gradeMap.put(fileInput.nextLine(), fileInput.nextLine());
        }
        
        fileInput.close();
    }
    
    // INSTANCE METHODS
    public String getStudentName()
    {
        return studentName;
    }
    
    public int getStudentNumber()
    {
        return studentNumber;
    }
    
    public int enterGrade(String course, String letterGrade)
    {
        gradeMap.put(course, letterGrade);
        return gradeMap.size();
    }
    
    public int dropCourse(String course)
    {
        if(!gradeMap.containsKey(course))
        {
            throw new IllegalArgumentException("Invalid Course: can not drop a class that is not in the course map");
        }
        else
        {
            gradeMap.remove(course);
            return gradeMap.size();
        }
    }
    
    public String letterGrade(String course)
    {
        if(!gradeMap.containsKey(course))
        {
            throw new IllegalArgumentException("Invalid Course: can not get the letter grade for a course that is not in the map");
        }
        else
        {
            return gradeMap.get(course);
        }
    }
    
    public int save(String filename)throws IOException
    {
        PrintWriter fileWriter = new PrintWriter(filename);
        
        fileWriter.println(studentName);
        
        fileWriter.println(studentNumber);
        
        gradeMap.forEach( (course, letterGrade) ->
        {
            fileWriter.println(course);
            fileWriter.println(letterGrade);
        }
        );
        
        fileWriter.close();
        
        return gradeMap.size();
    }
}