package JAVA;

public class RecursiveBinarySearch {

    int RecursiveBinarySearchExample(int arr[], int start, int end, int target){
    // int start = 0;
    // int end = arr.length - 1;
    while(start<=end){
        int mid = (start + end)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]>target){
            //end = mid - 1;
            return RecursiveBinarySearchExample(arr,start, mid-1, target);
        }
        else{
            //start = mid + 1;
            return RecursiveBinarySearchExample(arr, mid-1, end, target);
        }
    }
    return -1;
    }
    
    public static void main(String[] args){
        RecursiveBinarySearch obj = new RecursiveBinarySearch();
        int arr[] = {4, 5, 9, 15, 20, 24, 36, 55, 67, 89, 90, 100, 188};
        int target = 90;
        int n = arr.length;
        
        int result = obj.RecursiveBinarySearchExample(arr, 0, n-1, target);

        if(target!=-1){
            System.out.println("Target element is found at index "+result);
        }
        else{
            System.out.println("Target element is found at index "+result);
        }
    }
}
