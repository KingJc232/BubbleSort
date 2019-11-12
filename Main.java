/**
 * File: Main.java
 * Goal: To Implement Bubble Sort Recursively 
 * */

public class Main
{
   public static void main(String[] args)
   {
      
      int[] arr = {1,5,2,6,3,-4, 10, 7}; 
  
      printArr("Before:" , arr); 

      bubbleSort(arr, 0, arr.length-1); 

      printArr("After BubbleSort: " , arr); 

   }

  /** Implements BubbleSort Recursively 
    * @param arr the array to sort 
    * @param first the first index in the array 
    * @param last the last index in the array 
    * @return void A sorted array 
    * */
   public static void bubbleSort(int[] arr, int first, int last )
   {
      //Base Case if its an array of 1 element STOP !!!
      if(first >= last)
         return ; 

      // i < last so that we dont get an array out of bounds exception  
      for(int i = first; i < last; i++)
      {
         if(arr[i] > arr[i+1])
            swap(arr, i, i+1); 
      }

      //Recursively Calling Bubble sort to next wave 
      //Reason Doing Last -1 is because the last element is in its correct position After Every Iteration 
      bubbleSort(arr, first, last -1); 

   }

   /**Helper Method swaps two elements in an array given their index 
    * @param arr Array Where elements stored 
    * @param i Index of the First Element 
    * @param j Index of the Second Element 
    * @return void 
    * */

   private static void swap(int[] arr, int i, int j)
   {
      int temp = arr[i]; 
      arr[i] = arr[j]; 
      arr[j] = temp; 
   }

   public static void printArr(String msg, int[] arr)
   {
      String answer = msg + " \n"; 
      answer += "[ ";
      String comma = ""; 
      for(int i = 0; i < arr.length; i++)
      {
         answer += comma + arr[i];
         comma = " , ";
      }
      answer += " ]\n\n";

      log(answer); 
   }

   public static void log(String msg)
   {
      System.out.println(msg); 
   }
}
