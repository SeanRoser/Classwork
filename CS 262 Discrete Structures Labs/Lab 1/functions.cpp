// Sean Roser

#include "functions.h"

#include <iostream>
#include <iomanip>

using namespace std;

// Implement the functions from functions.h here
double getInput(const string& prompt)
{
	double input = 0;

	cout << prompt;
	cin >> input;

	if (input > 0)
	{
		return input;
	}
	else
	{
		return getInput(prompt);
	}
}

double convertDistance(double inches)
{
	return (inches * 0.025);
}

double getSpeed(double distance, double seconds)
{
	double metersPerSecond = 0;

	metersPerSecond = distance / seconds;

	return metersPerSecond;
}

double convertSpeed(double metersPerSec)
{
	double milesPerHour = 0;

	milesPerHour = (metersPerSec * 3600) / 1609;

	return milesPerHour;
}