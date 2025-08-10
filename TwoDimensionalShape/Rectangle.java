//Programmer Name: Sean Roser

public class Rectangle extends TwoDimensionalShape implements Comparable<Rectangle>
{
    //Variables
    private double width;
    private double height;
    
    //Constructors
    public Rectangle()
    {
        height = 2;
        width = 1;
    }
    
    public Rectangle(double height, double width, String units, String fillColor, String lineColor)
    {
        this.height = height;
        this.width = width;
        super.setUnits(units);
        super.setFillColor(fillColor);
        super.setLineColor(lineColor);
    }
    
    //Instance Methods
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public double getheight()
    {
        return height;
    }
    
    //Abstract Methods
    @Override
    public double area()
    {
        return width * height;
    }
    
    @Override
    public double perimeter()
    {
        return (2.0 * width) + (2.0 * height);
    }
    
    //Interface Method
    @Override
    public int compareTo(Rectangle object)
    {
        if(this.getFillColor().equalsIgnoreCase(object.getFillColor()))
        {
            return 0;
        }
        else if(this.getFillColor().compareTo(object.getFillColor()) < 1)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}




