// PROGRAMER NAME: Sean Roser

public class PrimitiveIntKeyStringValueSeparateChainingHashMapNode
{
    // INSTANCE VARIABLES
    private int key;
    private String value;
    private PrimitiveIntKeyStringValueSeparateChainingHashMapNode nextNode;
    
    // CONSTRUCTORS
    public PrimitiveIntKeyStringValueSeparateChainingHashMapNode(int key, String value, PrimitiveIntKeyStringValueSeparateChainingHashMapNode nextNode)
    {
        this.key = key;
        this.value = value;
        this.nextNode = nextNode;
    }
    
    // INSTANCE METHODS
    public int getKey()
    {
        return this.key;
    }
    
    public String getValue()
    {
        return value;
    }
    
    public PrimitiveIntKeyStringValueSeparateChainingHashMapNode getNextNode()
    {
        return this.nextNode;
    }
    
    public void setValue(String value)
    {
        this.value = value;
    }
    
    public void setNextNode(PrimitiveIntKeyStringValueSeparateChainingHashMapNode nextNode)
    {
        this.nextNode = nextNode;
    }
}