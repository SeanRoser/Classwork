
/**
 * Write a description of class Cylinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cylinder
{
    //Instance Variables
    private double radius;
    private double height;
    private String material;
    private String units;
    
    //Constructors
    public Cylinder()
    {
        radius = 0.1;
        height = 0.2;
        material = "Titanium";
        units = "inches";
    }
    
    public Cylinder(double radius, double height, String material, String units)
    {
        this.radius = radius;
        this.height = height;
        this.material = material;
        this.units = units;
    }
    
    //Instance Methods
    public double volume()
    {
        return(height * Math.PI * Math.pow(radius, 2));
    }
    
    
    public double surfaceArea()
    {
        return((2.0 * Math.PI * radius * height) + (2.0 * Math.PI * Math.pow(radius, 2)));
    }
}

