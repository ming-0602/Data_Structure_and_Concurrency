package Lab4;

public class BinarySearchDemo
{
   public static void main(String[] args)
   {
        int[] list = {4, 6, 7, 10, 12, 13};

        int index = binarySearch(list, 6);
        System.out.println("6 was found at position " + index);
    }	

   // Binary search
   public static int binarySearch( int array[], int key ) 
   {
//      int low = 0;                  // low subscript
//      int high = array.length - 1;  // high subscript
//      int middle;                   // middle subscript
//
//      while ( low <= high ) {
//         middle = ( low + high ) / 2;
//
//         if ( key == array[ middle ] )  // match
//            return middle;
//         else if ( key < array[ middle ] )
//            high = middle - 1;  // search low end of array
//         else
//            low = middle + 1;   // search high end of array
//      }
//
//      return -1;   // searchKey not found
      return recursiveBinary(array, key, 0, array.length-1);
   }


   private static int recursiveBinary(int array[], int key, int low, int high){

      if (low <= high){
         int middle = (low + high)/2;

         if(array[middle] == key){
            return middle;
         } else if (array[middle] < key) {
            return recursiveBinary(array, key, middle+1, high);
         } else if (array[middle] > key) {
            return recursiveBinary(array, key, low, middle-1);
         }
      }

      return -1;
   }
}