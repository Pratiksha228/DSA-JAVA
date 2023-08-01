package JAVA;
//import java.io.*;

 class IterativeBinarySearch {

        int IterativeBinarySearchExample(int arr[], int target){   
        int start = 0;
        int end = arr.length-1;
        //int mid = (start + end)/2;  --->Throwing error at runtime 
        while(start<=end){
            int mid = (start + end)/2;   // -->Have to write this under while loop
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            
        }
        return -1;

    }
    public static void main(String[] args){
        IterativeBinarySearch object = new IterativeBinarySearch();
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        //int arr_size = arr.length;
        int target = 23;

        int result = object.IterativeBinarySearchExample(arr, target);

        if(result != -1){
           System.out.println("Target element found at index "+result);
        }
        else{
            System.out.println("Target element is not found at index"+result);
        }

    }
}



//Learning:  static int IterativeBinarySearchExample(int arr[], int target){   ye static keyword isiliye le rha hai taki mene IterativeBinarySearch class ka koi bhi object nhi banaya hai main method mein, as we know static method does not required object to be instantiated.
//Now I'm going to create object for that particular class which is IterativeBinarySearch now we will see and I will remove the static keyword infront of the method name and then definately it will not shown me the error---->
//IterativeBinarySearch object = new IterativeBinarySearch();   ----->Created Object for the class
//int result = object.IterativeBinarySearchExample(arr, target);   ----->Calling method through it's object