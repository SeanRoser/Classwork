//Roser, Sean (Team Leader)
//Huynh, Preston
//Mccray, Daniel

//Part 1
bool CircularQueue::isEmpty() const
{
   return (queueFront == queueRear);
}

bool CircularQueue::isFull() const
{
   return queueFront == (queueRear + 1) % maxQueueSize;
}

int CircularQueue::size() const
{
   return (maxQueueSize - queueFront + queueRear) % maxQueueSize;
}


//Part 2
int CircularQueue::front() const
{
   if(queueFront == queueRear)
   {
      cerr << "Queue is empty." << endl;
      return -999;
   }
   else
   {
      return queueArray[queueFront];
   }
}

int CircularQueue::back() const
{
   if(queueFront == queueRear)
   {
      cerr << "Queue is empty." << endl;
      return -999;
   }
   else
   {
      return queueArray[((queueRear - 1) + maxQueueSize)
	% maxQueueSize];
   }
}


//Part 3
void CircularQueue::enqueue(const int element)
{
   if(queueFront == (queueRear + 1) % maxQueueSize)
   {
      cerr << "Cannot add to a full queue." << endl;
   }
   else
   {
      queueArray[queueRear] = element;
      queueRear = (queueRear + 1) % maxQueueSize;
   }
}

void CircularQueue::dequeue()
{
   if(queueFront == queueRear)
   {
      cerr << "Cannot remove from an empty queue." << endl;
   }
   else
   {
      queueFront = (queueFront + 1) % maxQueueSize;
   }
}


//Part 4
void CircularQueue::clear()
{
   queueRear = 0;
   queueFront = 0;
}

CircularQueue::~CircularQueue()
{
   delete [] queueArray;
   queueArray = nullptr;
}