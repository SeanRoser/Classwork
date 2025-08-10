//Programmer name: Sean Roser

import java.util.Scanner;
public class KeyboardInput
{
    Scanner keyboardInput = new Scanner(System.in);
    
    public void radius()
    {
        System.out.println("Enter a radius: ");
        
        Sphere sphere1 = new Sphere();
        
        try
        {
            sphere1.setRadius(sphere1.getRadius());
        }
        catch(IllegalArgumentException exception)
        {
            System.out.println(exception.toString());
        }
    }
    
    public void units()
    {
        System.out.println("Enter the units: ");
        
        String unit = keyboardInput.next();
        
        Sphere sphere2 = new Sphere();
        
        try
        {
            sphere2.setUnits(unit);
        }
        catch(IllegalArgumentException exception)
        {
            System.out.println(exception.toString());
        }
    }
    
    public void filename()
    {
        System.out.println("Enter the filename: ");
        
        Sphere sphere3 = new Sphere();
        
        try
        {
            sphere3.save(keyboardInput.next());
        }
        catch(IllegalArgumentException exception)
        {
            System.out.println(exception.toString());
        }
    }
}

