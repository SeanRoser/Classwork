// PROGRAMMER: Sean Roser

import java.util.NoSuchElementException;
import java.io.PrintWriter;
import java.io.IOException;

public class DynamicQueue<E>
{
    // INSTANCE VARIABLES
    private SinglyLinkedList<E> queue;
    
    // CONSTRUCTORS
    public DynamicQueue()
    {
        queue = new SinglyLinkedList<E>();
    }
    
    public DynamicQueue(E[] array)
    {
        queue = new SinglyLinkedList<E>();
        
        for(E element: array)
        {
            queue.addLast(element);
        }
    }
    
    // INSTANCE METHODS
    public void offer(E element)
    {
        queue.addLast(element);
    }
    
    public E poll()
    {
        if(queue.getSize() < 1)
        {
            throw new RuntimeException("Caused By Dynamic Queue Poll Method");
        }
        else
        {
            return queue.removeFirst();
        }
    }
    
    public E peek()
    {
        if(queue.getSize() < 1)
        {
            throw new RuntimeException("Caused By Dynamic Queue Peek Method");
        }
        else
        {
            return queue.getFirst();
        }
    }
    
    public int getSize()
    {
        return queue.getSize();
    }
    
    public void SaveToFile(String filename) throws IOException
    {
        PrintWriter fileWriter = new PrintWriter(filename);
        SinglyLinkedList<E> copyQueue = new SinglyLinkedList<E>();
        
        while(queue.getSize() > 0)
        {
            copyQueue.addLast(queue.getFirst());
            fileWriter.println(queue.removeFirst());
        }
        
        while(copyQueue.getSize() > 0)
        {
            queue.addLast(copyQueue.removeFirst());
        }
        
        fileWriter.close();
    }
}