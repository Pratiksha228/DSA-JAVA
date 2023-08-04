package JAVA;
import java.util.Scanner;

public class LeftRotationWithTempArray {

    static void LeftRotationWithTempArrayExample(int arr[], int d, int n){
        //temp array
        int temp[] = new int[n];
        int j = 0;

        for(int i=d; i<n; i++){
            temp[j] = arr[i];
            j++;
        }

        for(int i=0; i<d; i++){
            temp[j] = arr[i];
            j++;
        }

        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }

    static void printTheArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {10,20,30,40,89,90,45};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of shifting number: ");
        int d = sc.nextInt();

        //Array elements presented in the list
        System.out.println("Array Elements are: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }

        LeftRotationWithTempArrayExample(arr, d, n);
        printTheArray(arr, n);
    }
}
