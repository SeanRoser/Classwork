//PROGRAMMER: Sean Roser

import java.util.NoSuchElementException;
import java.io.PrintWriter;
import java.io.IOException;

public class DynamicStack<E>
{
    //INSTANCE VARIABLES
    private SinglyLinkedList<E> stack;
    
    //CONSTRUCTORS
    public DynamicStack()
    {
        this.stack = new SinglyLinkedList<E>();
    }
    
    public DynamicStack(E[] array)
    {
        this.stack = new SinglyLinkedList<E>();
        
        for(E element: array)
        {
            stack.addFirst(element);
        }
    }
    
    //INSTANCE METHODS
    public void push(E element)
    {
        stack.addFirst(element);
    }
    
    public boolean empty()
    {
        if(stack.getSize() < 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public E peek()
    {
        if(stack.getSize() < 1)
        {
            throw new RuntimeException("Caused By Dynamic Stack Peek Method");
        }
        else
        {
            return stack.getFirst();
        }
    }
    
    public E pop()
    {
        if(stack.getSize() < 1)
        {
            throw new RuntimeException("Caused By Dynamic Stack Pop Method");
        }
        else
        {
            return stack.removeFirst();
        }
    }
    
    public void saveToFile(String filename) throws IOException
    {
        PrintWriter fileWriter = new PrintWriter(filename);
        SinglyLinkedList<E> reverseStack = new SinglyLinkedList<E>();
        
        while(stack.getSize() > 0)
        {
            reverseStack.addFirst(stack.removeFirst());
        }
        
        while(reverseStack.getSize() > 0)
        {
            fileWriter.println(reverseStack.getFirst());
            stack.addFirst(reverseStack.removeFirst());
        }
        
        fileWriter.close();
    }
}



