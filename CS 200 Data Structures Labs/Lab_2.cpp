//Roser, Sean
//Mccray, Daniel
//Huynh, Preston

   void Graph::bfsTraversal(int bfsData[]) const
   {
      bool *visited = new bool[numOfVertices]{false};
      
      Queue bfsQueue;
      int pos = 0;
      
      bfsData[0] = 0;
      visited[0] = true;
      
      for(int i = 1; i < numOfVertices; i++)
      {
         auto iter = graph[pos]->begin();
         while(iter != graph[pos]->end())
         {
            if(!visited[*iter])
            {
               bfsQueue.push(*iter);
               visited[*iter] = true;
            }
            iter++;
         }
         
         pos = bfsQueue.front();
         
         bfsData[i] = pos;
         
         bfsQueue.pop();
      }
      
      delete[] visited;
      visited = nullptr;
   }