//Roser, Sean (Team Leader)
//Huynh, Preston
//Mccray, Daniel

//Part 1
void BST::deleteNoLeftSubtree(Node* deleteNode, Node* deleteParent)
{
   if(root == deleteNode)
   {
      root = deleteNode->rlink;
   }
   else if(deleteNode->rlink != nullptr && deleteNode->llink == nullptr)
   {
      if(deleteParent->rlink == deleteNode)
      {
         deleteParent->rlink = deleteNode->rlink;
      }
      else
      {
         deleteParent->llink = deleteNode->rlink;
      }
   }
   
   delete deleteNode;
}


//Part 2
void BST::deleteNoRightSubtree(Node* deleteNode, Node* deleteParent)
{
   if(root == deleteNode)
   {
      root = deleteNode->llink;
   }
   else if(deleteNode->llink != nullptr && deleteNode->rlink == nullptr)
   {
      if(deleteParent->rlink == deleteNode)
      {
         deleteParent->rlink = deleteNode->llink;
      }
      else
      {
         deleteParent->llink = deleteNode->llink;
      }
   }
   
   delete deleteNode;
}