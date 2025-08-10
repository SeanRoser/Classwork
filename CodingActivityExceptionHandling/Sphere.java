//Programmer name: Sean Roser

public class Sphere
{
    //Instance variable
    private double radius;
    private String units;
    
    //Constructor
    public Sphere()
    {
        radius = 5;
        units = "micrometers";
    }
    
    public Sphere(double radius, String units)
    {
        this.radius = radius;
        this.units = units;
    }
    
    //Instance method
    public double getRadius()
    {
        return radius;
    }
    
    public String getUnits()
    {
        return units;
    }
    
    public void setRadius(double radius)
    {   
        if(radius < 0)
        {
            throw new IllegalArgumentException("Radius is negative");
        }
        else if(radius == 0)
        {
            throw new IllegalArgumentException("Radius is zero");
        }
        else
        {
            this.radius = radius;
        }
    }
    
    public void setUnits(String units)
    {
        if(units.isEmpty())
        {
            throw new IllegalArgumentException("Invalid units");
        }
        else
        {
            this.units = units;
        }
    }
    
    //Save method
    public void save(String filename)
    {
        if(filename.isEmpty())
        {
            throw new IllegalArgumentException("Invalid filename");
        }
        else if(!filename.endsWith(".java"))
        {
            throw new IllegalArgumentException("Invalid file type");
        }
    }
}


