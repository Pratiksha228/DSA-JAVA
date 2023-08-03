package JAVA;
// import java.util.Scanner;

public class RightRotationTempArray {

    static void rotate(int arr[], int d, int n){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of elements do you want in the array: ");
        // n = sc.nextInt();
        //Storing the array elements in the temporary array
        int temp[] = new int[n];
        //keeping track of current index in the temporary element
        int j = 0;

        //loop for storing the n-d values in the temporary array
        for(int i=d; i<n; i++){
            temp[j] = arr[i];
            j++;
        }

        //loop for storing the remaining values in to the array
        for(int i=0; i<d; i++){
            temp[j] = arr[i];
            j++;
        }

        //loop for copying all the elements of the temporary array into the main array
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
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int d = 2;

        // System.out.println("Elements in the array:");
        // for(int i=0; i<n; i++){
        //     System.out.println(arr[i]+" ");
        // }     //of no use
        rotate(arr, d, n);
        printTheArray(arr, n);
        

        
    }
}
