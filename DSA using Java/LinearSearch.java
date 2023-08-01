//Recursive Impl

package JAVA;
//import java.util.*;

public class LinearSearch {

    public static int findoutLinearSearch(int arr[], int target){
      //Traverse the array to find out the element
      for(int i=0; i<arr.length-1; i++){
        if(arr[i]==target){
            //return i; //It will return the index
            return arr[i];   //It wil return the element of the particular index position
        }
      }
      return -1;   //-1 representing that your array does not contain the target value
    }
    public static void main(String[] args){
        int arr[] = { 20, 40, 78, 90, 67};
        int target = 90;

        int index = findoutLinearSearch(arr, target);
        
        if(index != -1){
            System.out.println("Target element is found at index"+index);
        }
        else{
            System.out.println("Target element is not found at"+index);
        }
    }
}
