#include "setFunctions.h"
#include "set.h"
#include "set.cpp"

using namespace std;
// Returns a set that is the Union of the two sets s1 and s2
Set<char> setUnion(const Set<char>& s1, const Set<char>& s2)
{
	Set<char> result;

	int lengthS1 = s1.cardinality();

	for (int i = 0; i < lengthS1; i++)
	{
		result.insertElement(s1[i]);
	}

	int lengthS2 = s2.cardinality();

	for (int i = 0; i < lengthS2; i++)
	{
		result.insertElement(s2[i]);
	}

	return result;
}

// Returns a set that is the intersection of the two sets s1 and s2
Set<char> setIntersection(const Set<char>& s1, const Set<char>& s2)
{
	Set<char> result;
	
	int lengthS1 = s1.cardinality();

	for (int i = 0; i < lengthS1; i++)
	{
		if (s2.isElement(s1[i]))
		{
			result.insertElement(s1[i]);
		}
	}

	return result;
}

// Returns a set that is the s1 - s2
Set<char> setDiff(const Set<char>& s1, const Set<char>& s2)
{
	Set<char> result;

	int lengthS1 = s1.cardinality();

	for (int i = 0; i < lengthS1; i++)
	{
		result.insertElement(s1[i]);
	}

	int lengthS2 = s2.cardinality();

	for (int i = 0; i < lengthS2; i++)
	{
		result.removeElement(s2[i]);
	}

	return result;
}

// Returns a set that is the symetric difference of the two sets s1 and s2
Set<char> setSymDiff(const Set<char>& s1, const Set<char>& s2)
{
	Set<char> result;

	int lengthS1 = s1.cardinality();

	for (int i = 0; i < lengthS1; i++)
	{
		if (!s2.isElement(s1[i]))
		{
			result.insertElement(s1[i]);
		}
	}

	int lengthS2 = s2.cardinality();

	for (int i = 0; i < lengthS2; i++)
	{
		if (!s1.isElement(s2[i]))
		{
			result.insertElement(s2[i]);
		}
	}

	return result;
}

// Returns true if s1 is a subset of s2
bool isSubSet(const Set<char>& s1, const Set<char>& s2)
{
	if(s1 == s2)
	{
		return true;
	}
	else
	{
		int lengthS1 = s1.cardinality();
		for (int i = 0; i < lengthS1; i++)
		{
			if (!s2.isElement(s1[i]))
			{
				return false;
			}
		}

		return true;
	}

	return false;
}

// Returns true if s1 is a proper subset of s2
bool isProperSubSet(const Set<char>& s1, const Set<char>& s2)
{
	if (s1 == s2)
	{
		return false;
	}
	else
	{
		int length = s1.cardinality();

		for (int i = 0; i < length; i++)
		{
			if (!s2.isElement(s1[i]))
			{
				return false;
			}
		}

		return true;
	}

	return false;
}

// Returns the Power Set of set s as a set of sets
Set<Set<char>> PowerSet(const Set<char>& s)
{
	Set<Set<char>> result;

	int length = s.cardinality();

	Set<char> empty;
	result.insertElement(empty);

	double resultEndCardinality = pow(2, length);

	for (int i = 0; i < resultEndCardinality; i++)
	{
		for (int j = 0; j < length; j++)
		{
			Set<char> powerSet = result[i];

			powerSet.insertElement(s[j]);

			result.insertElement(powerSet);
		}
	}

	return result;
}

// Returns true if the sets in p make up a Partition of set s
bool isPartition(const Set<Set<char>>& p, const Set<char>& s)
{
	Set<char> all;

	int lengthP = p.cardinality();

	for (int i = 0; i < lengthP; i++)
	{
		int lengthP2 = p[i].cardinality();

		for (int j = 0; j < lengthP2; j++)
		{
			if(!all.isElement(p[i][j]))
			{
				all.insertElement(p[i][j]);
			}
			else
			{
				return false;
			}
		}
	}

	if (all == s)
	{
		return true;
	}

	return false;
}