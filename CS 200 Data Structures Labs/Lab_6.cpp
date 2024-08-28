// Roser, Sean (Team Leader)
// McCray, Daniel
// Huynh, Preston

	while(h < k)
	{
	   while(a[h] < pivot)
	   {
	      h++;
	   }
	   
	   while(a[k] > pivot)
	   {
	      k--;
	   }
	   
	   if(h < k)
	   {
	      swap(a[h], a[k]);
	   }
	}
	
	if(pivot > a[k])
	{
	   swap(a[startIndex], a[k]);
	}