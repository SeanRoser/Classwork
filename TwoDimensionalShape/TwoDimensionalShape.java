//Programmer Name: Sean Roser

public abstract class TwoDimensionalShape
{
    //Variables
    private String units;
    private String lineColor;
    private String fillColor;
    
    //Constructors
    public TwoDimensionalShape()
    {
        units = "inches";
        lineColor = "blue";
        fillColor = "purple";
    }
    
    public TwoDimensionalShape(String units, String lineColor, String fillColor)
    {
        this.units = units;
        this.lineColor = lineColor;
        this.fillColor = fillColor;
    }
    
    //Instance Methods
    public void setUnits(String units)
    {
        this.units = units;
    }
    
    public String getUnits()
    {
        return units;
    }
    
    public void setLineColor(String lineColor)
    {
        this.lineColor = lineColor;
    }
    
    public String getLineColor()
    {
        return lineColor;
    }
    
    public void setFillColor(String fillColor)
    {
        this.fillColor = fillColor;
    }
    
    public String getFillColor()
    {
        return fillColor;
    }
    
    //Abstract Methods
    public abstract double area();
    
    public abstract double perimeter();
}






