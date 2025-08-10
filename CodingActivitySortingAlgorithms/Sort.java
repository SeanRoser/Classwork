// PROGRAMMER: Sean Roser

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Sort
{
    // STATIC METHODS
    public static String[] selection(String filename) throws IOException
    {
        String[] selectionSortingArray = new String[26];
        Scanner fileInput = new Scanner(new File(filename));
        
        for(int i = 0; i < selectionSortingArray.length; i++)
        {
            selectionSortingArray[i] = fileInput.nextLine();
        }
        fileInput.close();
        
        int minimumPosition;
        String swapStorage;
        int indexCase;
        int minimumPositionCase;
        
        for(int currentPosition = 0; currentPosition < (selectionSortingArray.length - 1); currentPosition++)
        {
            minimumPosition = currentPosition;
            
            for(int index = (currentPosition + 1); index < selectionSortingArray.length; index++)
            {
                indexCase = selectionSortingArray[index].charAt(0);
                minimumPositionCase = selectionSortingArray[minimumPosition].charAt(0);
                if(indexCase >= 97)
                {
                    indexCase = indexCase - 32;
                }
                if(minimumPositionCase >= 97)
                {
                    minimumPositionCase = minimumPositionCase - 32;
                }
                
                if(indexCase < minimumPositionCase)
                {
                    minimumPosition = index;
                }
            }
            
            swapStorage = selectionSortingArray[currentPosition];
            selectionSortingArray[currentPosition] = selectionSortingArray[minimumPosition];
            selectionSortingArray[minimumPosition] = swapStorage;
        }
        
        return selectionSortingArray;
    }
}




