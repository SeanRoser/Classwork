// PROGRAMMER NAME: Sean Roser

public class PrimitiveIntKeyStringValueSeparateChainingHashMap
{
    // INSTANCE VARIABLES
    private int numberOfBuckets;
    private int size;
    private PrimitiveIntKeyStringValueSeparateChainingHashMapNode[] bucket;
    
    // CONSTRUCTORS
    public PrimitiveIntKeyStringValueSeparateChainingHashMap()
    {
        this.numberOfBuckets = 0;
        this.size = 0;
        this.bucket = new PrimitiveIntKeyStringValueSeparateChainingHashMapNode[numberOfBuckets];
    }
    
    public PrimitiveIntKeyStringValueSeparateChainingHashMap(int numberOfBuckets)
    {
       this.numberOfBuckets = 10;
       this.size = 0;
       this.bucket = new PrimitiveIntKeyStringValueSeparateChainingHashMapNode[numberOfBuckets];
    }
    
    // INSTANCE METHODS
    private int hashCodeIndex(int key)
    {
        int hashCode = Math.abs(key);
        return (hashCode % this.numberOfBuckets);
    }
    
    public String put(int key, String value)
    {
        int index = hashCodeIndex(key);
        PrimitiveIntKeyStringValueSeparateChainingHashMapNode currentNode = this.bucket[index];
        while(currentNode != null)
        {
            if(currentNode.getKey() == key)
            {
                String oldValue = currentNode.getValue();
                currentNode.setValue(value);
                return(oldValue);
            }
            currentNode = currentNode.getNextNode();
        }
        PrimitiveIntKeyStringValueSeparateChainingHashMapNode newNode = new PrimitiveIntKeyStringValueSeparateChainingHashMapNode(key, value, this.bucket[index]);
        this.bucket[index] = newNode;
        this.size++;
        return null;
    }
    
    public int getSize()
    {
        return this.size;
    }
    
    public String get(int key)
    {
        int index = hashCodeIndex(key);
        return bucket[index].getValue();
    }
    
    public double loadFactor()
    {
        return ((double)this.size / (double)this.numberOfBuckets);
    }
}