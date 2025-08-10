// PROGRAMMER: Sean Roser

public class PrimitiveDoubleBinarySearchTree
{
    // INSTANCE VARIABLES
    private int size;
    private PrimitiveDoubleBinarySearchTreeNode root;
    
    // CONSTRUCTORS
    public PrimitiveDoubleBinarySearchTree()
    {
        size = 0;
        root = null;
    }
    
    public PrimitiveDoubleBinarySearchTree(double rootElement)
    {
        size = 1;
        
        root = new PrimitiveDoubleBinarySearchTreeNode(rootElement);
    }
    
    public PrimitiveDoubleBinarySearchTree(double[] array)
    {
        size = 0;
        
        root = null;
        
        for(double element: array)
        {
            this.insert(element);
        }
    }
    
    // INSTANCE METHODS
    public boolean insert(double element)
    {
        PrimitiveDoubleBinarySearchTreeNode newNode = new PrimitiveDoubleBinarySearchTreeNode(element);
        
        if(this.size == 0)
        {
            this.root = newNode;
        }
        else
        {
            PrimitiveDoubleBinarySearchTreeNode parent = getParent(element);
            if(parent == null)
            {
                return false;
            }
            else if(parent.getElement() > element)
            {
                parent.setLeftChild(newNode);
            }
            else
            {
                parent.setRightChild(newNode);
            }
        }
        
        this.size++;
        return true;
    }
    
    public int getSize()
    {
        return this.size;
    }
    
    public boolean Search(double searchElement)
    {
        PrimitiveDoubleBinarySearchTreeNode current = root;
        
        while(current != null)
        {
            if(searchElement == current.getElement())
            {
                return true;
            }
            else if(searchElement < current.getElement())
            {
                current = current.getLeftChild();
            }
            else
            {
                current = current.getRightChild();
            }
        }
        
        return false;
    }
    
    public PrimitiveDoubleBinarySearchTreeNode getParent(double element)
    {
        PrimitiveDoubleBinarySearchTreeNode parent = root;
        PrimitiveDoubleBinarySearchTreeNode current = root;
        
        while(current != null)
        {
            if(element == current.getElement())
            {
                return null;
            }
            else if(element < current.getElement())
            {
                parent = current;
                current = current.getLeftChild();
            }
            else
            {
                parent = current;
                current = current.getRightChild();
            }
        }
        
        return parent;
    }
}