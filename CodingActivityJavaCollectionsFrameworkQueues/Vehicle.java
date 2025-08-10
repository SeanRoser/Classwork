// PROGRAMMER: Sean Roser

public class Vehicle
{
    // INSTANCE VARIABLES
    private String customer;
    private String carModel;
    private String color;
    
    // CONSTRUCTORS
    public Vehicle(String customer, String carModel, String color)
    {
        this.customer = customer;
        this.carModel = carModel;
        this.color = color;
    }
    
    // INSTANCE METHODS
    public String getCustomer()
    {
        return customer;
    }
    
    public void setCustomer(String customer)
    {
        this.customer = customer;
    }
    
    public String getCarModel()
    {
        return carModel;
    }
    
    public void setCarModel(String carModel)
    {
        this.carModel = carModel;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
}