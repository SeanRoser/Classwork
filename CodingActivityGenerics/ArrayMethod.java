// PROGRAMMER: Sean Roser

public class ArrayMethod
{
    // STATIC METHODS
    public static <T> void display(String display, T[] array)
    {
        System.out.println(display);
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    
    public static <T> void initialize(T value, T[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = value;
        }
    }
}
