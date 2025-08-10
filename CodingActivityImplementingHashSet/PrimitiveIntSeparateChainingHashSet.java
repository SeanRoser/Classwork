// PROGRAMMER NAME: Sean Roser

public class  PrimitiveIntSeparateChainingHashSet
{
    // INSTANCE VARIABLES
    private int numberOfBuckets;
    private int size;
    private PrimitiveIntSeparateChainingHashSetNode[] bucket;
    
    // CONSTRUCTORS
    public  PrimitiveIntSeparateChainingHashSet()
    {
        this.size = 0;
        this.numberOfBuckets = 10;
        this.bucket = new PrimitiveIntSeparateChainingHashSetNode[this.numberOfBuckets];
    }
    
    public  PrimitiveIntSeparateChainingHashSet(int numberOfBuckets)
    {
        if(numberOfBuckets < 1)
        {
            throw new IllegalArgumentException("Must create at least one bucket.");
        }
        this.size = 0;
        this.numberOfBuckets = numberOfBuckets;
        this.bucket = new PrimitiveIntSeparateChainingHashSetNode[this.numberOfBuckets];
    }
    
    // INSTANCE METHODS
    private int hashCodeIndex(int element)
    {
        int hashCode = Math.abs(element);
        return(hashCode % this.numberOfBuckets);
    }
    
    public boolean add(int element)
    {
        int index = hashCodeIndex(element);
        PrimitiveIntSeparateChainingHashSetNode currentNode = this.bucket[index];
        while(currentNode != null)
        {
            if(currentNode.getElement() == element)
            {
                return false;
            }
            currentNode = currentNode.getNextNode();
        }
        PrimitiveIntSeparateChainingHashSetNode newNode = new PrimitiveIntSeparateChainingHashSetNode(element, this.bucket[index]);
        this.bucket[index] = newNode;
        this.size++;
        return true;
    }
    
    public int getSize()
    {
        return this.size;
    }
    
    public boolean contains(int element)
    {
        int index = hashCodeIndex(element);
        PrimitiveIntSeparateChainingHashSetNode currentNode = this.bucket[index];
        while(currentNode != null)
        {
            if(currentNode.getElement() == element)
            {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }
}