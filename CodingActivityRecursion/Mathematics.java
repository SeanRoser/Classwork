//Programmer Name: Sean Roser

import java.lang.IllegalArgumentException;

public class Mathematics
{
    //Recursive Method
    public static double fractionSeries(int number)
    {
        if(number == 1)
        {
            throw new IllegalArgumentException("Infinite loop error: number can not be 1");
        }
        else if(number == 0)
        {
            throw new IllegalArgumentException("Division by zero error: number can not be zero");
        }
        else if(number < 0)
        {
            throw new IllegalArgumentException("Infinite loop error: number can not be negative");
        }
        else
        {
            if(number == 2)
            {
                return 1.0 / number;
            }
            else
            {
                return ((1.0 / number) + fractionSeries(number - 1));
            }
        }
    }
}