package JAVA;

public class ReverseArray {

    static void ReverseArrayExample(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args){
        int arr[] = {2, 5, 67, 89, 90, 100, 10, 142, 789};
        int n = arr.length-1;

        System.out.println("Elements before reversing the array: ");
        for(int i = 0; i<=n; i++){
            // System.out.print("Elements in the array are as follows ");
            System.out.println(arr[i]+" ");
        }

        ReverseArrayExample(arr, 0, n);
        System.out.println("Reverse of the array: ");

        for(int i=0; i<=n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
