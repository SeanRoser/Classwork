//Programmer: Sean Roser

public class GlobalPositioningLocation
{
    private double latitude;
    private double longitude;
    private double elevation;
    private String elevationUnits;
    
    public GlobalPositioningLocation()
    {
        latitude = 1.1;
        longitude = 2.2;
        elevation = 3.3;
        elevationUnits = "meters";
    }
    
    public GlobalPositioningLocation(double latitude, double longitude, double elevation, String elevationUnits)
    {
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
        this.elevationUnits = elevationUnits;
    }
    
    public void setLatitude(double latitude)
    {
        this.latitude = latitude;
    }
    
    public double getLatitude()
    {
        return latitude;
    }
    
    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }
    
    public double getLongitude()
    {
        return longitude;
    }
    
    public void setElevation(double elevation)
    {
        this.elevation = elevation;
    }
    
    public double getElevation()
    {
        return elevation;
    }
    
    public void setElevationUnits(String elevationUnits)
    {
        this.elevationUnits = elevationUnits;
    }
    
    public String getElevationUnits()
    {
        return elevationUnits;
    }
}
