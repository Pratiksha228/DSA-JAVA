package JAVA;

public class LeftRotation {

    static void LeftRotationExample(int arr[], int n){
        int temp = arr[0];
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50,60,70};
        int n = arr.length;
        
        System.out.println("Printing out the elements in the array: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        
        LeftRotationExample(arr, n);

        //Array after Left Rotation
        System.out.println("After rotation of the array: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }

    }
}
