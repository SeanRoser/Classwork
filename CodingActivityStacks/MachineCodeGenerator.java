// PROGRAMMER: Sean Roser

import java.util.Stack;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.io.PrintWriter;

public class  MachineCodeGenerator
{
    // INSTANCE VARIABLES
    private Stack<String> machineCommandStack;
    
    // CONSTRUCTORS
    public MachineCodeGenerator()
    {
        machineCommandStack = new Stack<String>();
    }
    
    public MachineCodeGenerator(String filename) throws IOException
    {
        machineCommandStack = new Stack<String>();
        
        Scanner fileInput = new Scanner(new File(filename));
        
        while(fileInput.hasNext())
        {
            machineCommandStack.push(fileInput.nextLine());
        }
        
        fileInput.close();
    }
    
    // INSTANCE METHODS
    public void addCommand(String command)
    {
        if(command != "G00" && command != "G02" && command != "G03" && command != "G40" && command != "G41" && command != "G42" && command != "M03" && command != "M04" && command != "M06" && command != "M08" && command != "M09" && command != "M00")
        {
            throw new IllegalArgumentException("Invalid Command");
        }
        else
        {
            machineCommandStack.push(command);
        }
    }
    
    public String undo()
    {
        if(machineCommandStack.empty())
        {
            throw new RuntimeException("Can Not Undo Because No Valid Command in the Machine Code Generator");
        }
        else
        {
            return machineCommandStack.pop();
        }
    }
    
    public String getLastValid()
    {
        if(machineCommandStack.empty())
        {
            throw new RuntimeException("Can Not Undo Because No Valid Command in the Machine Code Generator");
        }
        else
        {
            return machineCommandStack.peek();
        }
    }
    
    public int saveCommands(String filename) throws IOException
    {
        int numCommandsSaved = 0; 
        
        Stack<String> reversedStack = new Stack<String>();
        
        PrintWriter fileWriter = new PrintWriter(filename);
        
        while(!machineCommandStack.empty())
        {
            reversedStack.push(machineCommandStack.pop());
        }
        
        while(!reversedStack.empty())
        {
            fileWriter.println(reversedStack.peek());
            machineCommandStack.push(reversedStack.pop());
            numCommandsSaved++;
        }
        
        fileWriter.close();
        
        return numCommandsSaved;
    }
    
    public int resetMachineCodeGenerator()
    {
        int numCommandsRemoved = 0;
        
        while(!machineCommandStack.empty())
        {
            machineCommandStack.pop();
            numCommandsRemoved++;
        }
        
        return numCommandsRemoved;
    }
}