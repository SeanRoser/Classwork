//Roser, Sean
//Mccray, Daniel
//Huynh, Preston

//Part 1
   bool BST::search(int element) const
   {
      Node *current = root;
      
      while(current != nullptr)
      {
         if(element == current->data)
         {
            return true;
         }
         else if(element < current->data)
         {
            current = current->llink;
         }
         else
         {
            current = current->rlink;
         }
      }
      
      return false;
   }

//Part 2
   int BST::totalLeaves() const
   {
       Node* current = root;
       stack<Node*> nodeStack;
       int numLeaves = 0;

       while(!nodeStack.empty() || current != nullptr)
       {
           while(current != nullptr)
           {
               nodeStack.push(current);
               current = current->llink;
           }
           current = nodeStack.top();

           if(current->rlink == nullptr && current->llink == nullptr)
           {
               numLeaves++;
           }

           nodeStack.pop();
           current = current->rlink;
       }

       return numLeaves;
   }

//Part 3
   int BST::totalParentsOneChild() const
   {
       int numOneChild = 0;
       Node* current = root;
       stack<Node*> nodeStack;

       while(!nodeStack.empty() || current != nullptr)
       {
           while(current != nullptr)
           {
               nodeStack.push(current);
               current = current->llink;
           }
           current = nodeStack.top();

           if((current->rlink == nullptr && current->llink != nullptr) || (current->rlink != nullptr && current->llink == nullptr))
           {
               numOneChild++;
           }

           nodeStack.pop();
           current = current->rlink;
       }

       return numOneChild;
   }