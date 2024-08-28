#include "functions.h"
#include <cmath>

//
// Put your function definitions here

int earthTemp(int temp, int numYears)
{
   temp = (3 * numYears) + temp;
   return temp;
}


int requiredFood(int startWeight, int foodNeeded, int finalWeight)
{
   int weightChange = finalWeight - startWeight;
   
   int foodIncrease = 1;
   
   if(weightChange > 0)
   {
      foodIncrease = pow(2, weightChange);
   }
   return (foodNeeded * foodIncrease);
}

int numChickens(int startChickens, int numYears)
{
   int finalChickens = startChickens;
   
   if(numYears == 0)
   {
      return finalChickens;
   }
   else
   {
      int born = 0;
   
      for(int i = 0; i < numYears; i++)
      {
         born = (finalChickens * 10) / 2;
         
         finalChickens = (born + finalChickens) - (finalChickens / 4);
      }
      
      return finalChickens;
   }