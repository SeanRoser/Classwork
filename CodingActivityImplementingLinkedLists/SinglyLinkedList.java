// PROGRAMMER NAME: Sean Roser

import java.util.NoSuchElementException;
import java.io.PrintWriter;
import java.io.IOException;

public class SinglyLinkedList<E>
{
    // INSTANCE VARIABLES
    private int size;
    private SinglyLinkedListNode<E> head;
    private SinglyLinkedListNode<E> tail;
    
    // CONSTRUCTORS
    public SinglyLinkedList()
    {
        size = 0;
        head = null;
        tail = null;
    }
    
    // INSTANCE METHODS
    public void addFirst(E element)
    {
        SinglyLinkedListNode<E> newNode = new SinglyLinkedListNode(element, this.head);
        
        this.head = newNode;
        this.size++;
        if(this.tail == null)
        {
            this.tail = newNode;
        }
    }
    
    public void addLast(E element)
    {
        SinglyLinkedListNode<E> newNode = new SinglyLinkedListNode(element, this.head);
        
        if(this.tail == null)
        {
            this.head = newNode;
        }
        else
        {
            this.tail.setNextNode(newNode);
        }
        this.tail = newNode;
        this.size++;
    }
    
    public E removeFirst()
    {
        if(this.size == 0)
        {
            throw new NoSuchElementException("Can not remove first element from an empty list");
        }
        else
        {
            E firstElement = this.head.getElement();
            
            if(this.size == 1)
            {
                this.head = null;
                this.tail = null;
            }
            else
            {
                this.head = this.head.getNextNode();
            }
            this.size--;
            
            return firstElement;
        }
    }
    
    public E removeLast()
    {
        if(this.size == 0)
        {
            throw new NoSuchElementException("Can not remove first element from an empty list");
        }
        else if(this.size == 1)
        {
            return(removeFirst());
        }
        else
        {
            SinglyLinkedListNode<E> currentNode = this.head;
            E lastElement = this.tail.getElement();
            
            for(int node = 1; node < (this.size - 1); node++)
            {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(null);
            this.tail = currentNode;
            this.size--;
            
            return lastElement;
        }
    }
    
    public E getFirst()
    {
        if(size < 1)
        {
            throw new NoSuchElementException("Linked List is empty");
        }
        else
        {
            return head.getElement();
        }
    }
    
    public E getLast()
    {
        if(size < 1)
        {
            throw new NoSuchElementException("Linked List is empty");
        }
        else
        {
            return tail.getElement();
        }
    }
    
    public int getSize()
    {
        return size;
    }
    
    public int occurrences(E element)
    {
        int numOccurrences = 0;
        SinglyLinkedListNode<E> currentNode = this.head;
        
        for(int node = 1; node <= this.size; node++)
        {
            if(currentNode.getElement() == element)
            {
                numOccurrences++;
            }
            currentNode = currentNode.getNextNode();
        }
        currentNode = null;
        
        return numOccurrences;
    }
    
    public void saveToFile(String filename) throws IOException
    {
        PrintWriter fileWriter = new PrintWriter(filename);
        SinglyLinkedListNode<E> currentNode = this.head;
        
        for(int node = 1; node <= this.size; node++)
        {
            fileWriter.println(currentNode.getElement());
            currentNode = currentNode.getNextNode();
        }
        currentNode = null;
        
        fileWriter.close();
    }
}