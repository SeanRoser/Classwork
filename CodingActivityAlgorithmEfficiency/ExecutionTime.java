// Programmer Name: Sean Roser

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class ExecutionTime
{
    // STATIC METHODS
    public static long createOneDimensionalArray(int numberOfElements)
    {
        if(numberOfElements < 0)
        {
            throw new IllegalArgumentException("Can not create random double array using number of elements specified");
        }
        else
        {
            long startTime = System.nanoTime();
            double[] oneDimensionalArray = new double[numberOfElements];
            for(int i = 0; i < numberOfElements; i++)
            {
                oneDimensionalArray[i] = Math.random();
            }
            long endTime = System.nanoTime();
            return endTime - startTime;
        }
    }
    
    public static long createTwoDimensionalArray(int numberOfRows, int numberOfColumns)
    {
        if(numberOfRows < 0)
        {
            throw new IllegalArgumentException("Can not create random double array using number of rows specified");
        }
        else if(numberOfColumns < 0)
        {
            throw new IllegalArgumentException("Can not create random double array using number of columns specified");
        }
        else
        {
            long startTime = System.nanoTime();
            double[][] twoDimensionalArray = new double[numberOfRows][numberOfColumns];
            for(int i = 0; i < numberOfColumns; i++)
            {
                for(int j = 0; j < numberOfRows; j++)
                {
                    twoDimensionalArray[j][i] = Math.random();
                }
            }
            long endTime = System.nanoTime();
            return endTime - startTime;
        }
    }
    
    public static long createHashSet(int numberOfElements)
    {
        if(numberOfElements < 0)
        {
            throw new IllegalArgumentException("Can not create random double hash set using number of elements specified");
        }
        else
        {
            long startTime = System.nanoTime();
            Set<Double> randomHash = new HashSet<Double>();
            for(int i = 0; i < numberOfElements; i++)
            {
                randomHash.add(Math.random());
            }
            long endTime = System.nanoTime();
            return endTime - startTime;
        }
    }
    
    public static long createTreeSet(int numberOfElements)
    {
        if(numberOfElements < 0)
        {
            throw new IllegalArgumentException("Can not create random double tree set using number of elements specified");
        }
        else
        {
            long startTime = System.nanoTime();
            Set<Double> randomTree = new TreeSet<Double>();
            for(int i = 0; i < numberOfElements; i++)
            {
                randomTree.add(Math.random());
            }
            long endTime = System.nanoTime();
            return endTime - startTime;
        }
    }
}