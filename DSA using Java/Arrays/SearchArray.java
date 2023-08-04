package JAVA;

public class SearchArray {

    static int SearchElementExample(int arr[], int target, int n){
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
       int arr[] = {11,12,13,14,15,16,17};
       int n = arr.length;
       int target = 25;

       int position = SearchElementExample(arr, target, n);

       if(position != -1){
        System.out.println("Element is present in the array at index: "+position);
       }
       else{
        System.out.println("Element is not present: "+position);
       }
    }
}
