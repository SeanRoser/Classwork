//Programmer Name: Sean Roser

public class GeometricSolid
{
    //Instance Variables
    private String units;
    private String material;
    private String description;
    
    //Constructors
    public GeometricSolid()
    {
        units = "mm";
        material = "Aluminum";
        description = "Geometric Solid";
    }
    
    public GeometricSolid(String units, String material,String description)
    {
        this.units = units;
        this.material = material;
        this.description = description;
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
    
    public void setMaterial(String material)
    {
        this.material = material;
    }
    
    public String getMaterial()
    {
        return material;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public String getDescription()
    {
        return description;
    }
}





