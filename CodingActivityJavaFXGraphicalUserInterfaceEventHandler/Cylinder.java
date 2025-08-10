//Programmer Name: Sean Roser

public class Cylinder extends GeometricSolid
{
    private double radius;
    private double height;
    
    //Constructors
    public Cylinder()
    {
        radius = 1;
        height = 2;
        super.setUnits("nanometers");
        super.setMaterial("Polyethylene");
    }
    
    public Cylinder(double radius, double height, String units, String material, String description)
    {
        this.radius = radius;
        this.height = height;
        super.setUnits(units);
        super.setMaterial(material);
        super.setDescription(description);
    }
    
    //Instance Methods
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public void setDescription(String description)
    {
        super.setDescription(description);
    }
    
    public String getDescription()
    {
        return super.getDescription() + " - Cylinder";
    }
    
    public Double volume()
    {
        return height * Math.PI * Math.pow(radius, 2);
    }
}




