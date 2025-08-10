// PROGRAMMER NAME: Sean Roser

import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.OptionalDouble;

public class Pipeline
{
    //STATIC METHODS
    static int[] sort(int[] array, int numberOfSmallestElementsToRemove, int numberOfLargestElementsToRemove)
    {
        return IntStream.of(array).sorted().limit(array.length-numberOfLargestElementsToRemove).skip(numberOfSmallestElementsToRemove).toArray();
    }
    
    static int summation(int[] array, int numberOfSmallestElementsToRemove, int numberOfLargestElementsToRemove)
    {
        return IntStream.of(array).sorted().limit(array.length-numberOfLargestElementsToRemove).skip(numberOfSmallestElementsToRemove).sum();
    }
    
    static OptionalDouble average(double[] array, int numberOfSmallestElementsToRemove, int numberOfLargestElementsToRemove)
    {
        return DoubleStream.of(array).sorted().limit(array.length-numberOfLargestElementsToRemove).skip(numberOfSmallestElementsToRemove).average();
    }
}