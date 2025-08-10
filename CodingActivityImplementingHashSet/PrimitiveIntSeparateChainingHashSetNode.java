// PROGRAMMER NAME: Sean Roser

public class PrimitiveIntSeparateChainingHashSetNode
{
    // INSTANCE VARIABLES
    private int element;
    private PrimitiveIntSeparateChainingHashSetNode nextNode;
    
    // CONSTRUCTORS
    public PrimitiveIntSeparateChainingHashSetNode(int element, PrimitiveIntSeparateChainingHashSetNode nextNode)
    {
        this.nextNode = nextNode;
        this.element = element;
    }
    
    // INSTANCE METHODS
    public int getElement()
    {
        return this.element;
    }
    
    public PrimitiveIntSeparateChainingHashSetNode getNextNode()
    {
        return this.nextNode;
    }
    
    public void setNextNode(PrimitiveIntSeparateChainingHashSetNode nextNode)
    {
        this.nextNode = nextNode;
    }
}