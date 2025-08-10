// PROGRAMMER: Sean Roser

public class PrimitiveDoubleBinarySearchTreeNode
{
    // INSTANCE VARIABLES
    private double element;
    private PrimitiveDoubleBinarySearchTreeNode leftChild;
    private PrimitiveDoubleBinarySearchTreeNode rightChild;
    
    // CONSTRUCTORS
    public PrimitiveDoubleBinarySearchTreeNode(double element)
    {
        this.element = element;
        this.leftChild = null;
        this.rightChild = null;
    }
    
    // INSTANCE METHODS
    public double getElement()
    {
        return this.element;
    }
    
    public PrimitiveDoubleBinarySearchTreeNode getLeftChild()
    {
        return this.leftChild;
    }
    
    public PrimitiveDoubleBinarySearchTreeNode getRightChild()
    {
        return this.rightChild;
    }
    
    public void setLeftChild(PrimitiveDoubleBinarySearchTreeNode leftChild)
    {
        this.leftChild = leftChild;
    }
    
    public void setRightChild(PrimitiveDoubleBinarySearchTreeNode rightChild)
    {
        this.rightChild = rightChild;
    }
}