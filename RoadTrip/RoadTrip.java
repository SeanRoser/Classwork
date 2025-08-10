//Programmer Name: Sean Roser

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class RoadTrip
{
    private String carModel;
    private double tripDistance;
    private String distanceUnits;
    private double tripTime;
    private String timeUnits;
    private String driver;
    
    
    public RoadTrip(String inputFile) throws IOException
    {
        Scanner fileInput = new Scanner(new File(inputFile));
        
        carModel = fileInput.nextLine();
        
        tripDistance = fileInput.nextDouble();
        fileInput.nextLine();
        
        distanceUnits = fileInput.next();
        fileInput.nextLine();
        
        tripTime = fileInput.nextDouble();
        fileInput.nextLine();
        
        timeUnits = fileInput.next();
        fileInput.nextLine();
        
        driver = fileInput.nextLine();
        
        fileInput.close();
    }
    
    
    public double averageSpeed()
    {
        return tripDistance / tripTime;
    }
    
    public void saveRoadTripInformation(String filename) throws IOException
    {
        PrintWriter fileWriter = new PrintWriter(filename);
        
        fileWriter.println("Road Trip Information");
        
        fileWriter.println("Car Model: " + carModel);
        
        fileWriter.print("Trip Distance: ");
        fileWriter.printf("%11.4f", tripDistance);
        fileWriter.println(" " + distanceUnits);
        
        fileWriter.print("Trip Time: ");
        fileWriter.printf("%15.4f", tripTime);
        fileWriter.println(" " + timeUnits);
        
        fileWriter.print("Average Speed: ");
        fileWriter.printf("%15.4f", averageSpeed());
        fileWriter.println(" " + timeUnits);
        
        fileWriter.print("Driver: ");
        fileWriter.printf("%18s", driver);
        
        fileWriter.close();
    }
}