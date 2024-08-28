// Sean Roser

#include <iostream>
#include <string>
#include <iomanip>

#include "functions.h"

using namespace std;

int main(){

  // Implement your main program here using the functions declared in funtions.h
  
  const int NUM_CARS = 4;
  
  double times[NUM_CARS];
  
  double distance = getInput("Enter the distance between the wires (inches): ");
  
  distance = convertDistance(distance);
  
  for(int i = 0; i < NUM_CARS; i++)
  {
      times[i] = getInput("Enter time recorded (seconds): ");
  }
  
  cout << endl;

  cout << setw(10) << left << "Vehicle";
  cout << setw(15) << right << "Time (seconds)";
  cout << setw(15) << right << "Speed(m/s)";
  cout << setw(15) << right << "Speed(mph)";
  cout << endl;
  
  for(int j = 0; j < NUM_CARS; j++)
  {
      double metersPerSecond = getSpeed(distance, times[j]);
      double milesPerHour = convertSpeed(metersPerSecond);

      cout << setw(10) << left << (j + 1);
      cout << setw(15) << right << fixed << setprecision(2) << times[j];
      cout << setw(15) << right << fixed << setprecision(2) << metersPerSecond;
      cout << setw(15) << right << fixed << setprecision(2) << milesPerHour << endl;
  }
  
  return 0;
}