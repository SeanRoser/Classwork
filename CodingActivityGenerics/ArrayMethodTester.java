// PROGRAMMER: Sean Roser

import java.util.Scanner;

public class ArrayMethodTester
{
    // STATIC METHODS
    public static void test1()
    {
        final int NUMBER_OF_BUILDINGS = 3;
        Double[] buildingCost = new Double[NUMBER_OF_BUILDINGS];// $
        
        ArrayMethod.initialize(1234567.89, buildingCost);
        ArrayMethod.display("Initialized Costs ($)", buildingCost);
    }
    
    public static void test2()
    {
        Scanner keyboardInput = new Scanner(System.in);
        final int NUMBER_OF_BUILDINGS = 2;
        Double[] buildingCost = new Double[NUMBER_OF_BUILDINGS];// Euros
        
        for(int i = 0; i < NUMBER_OF_BUILDINGS; i++)
        {
            System.out.println("Please enter the cost of building " + (i + 1) + ": ");
            buildingCost[i] = keyboardInput.nextDouble();
            keyboardInput.nextLine();
        }
        ArrayMethod.display("Building Costs (Euros)", buildingCost);
    }
}