//Java program to implement insert operation in an unsorted array and at the end of the array.
package JAVA;
import java.util.Scanner;

 class EndInsertionArray {

    static int result(int arr[], int num, int key, int capacity){
        //cannot insert more elements if num is less or equal to capacity
        if(num>=capacity){
            return num;
            
            // arr[num] = key;
            // return (num + 1);
        }
        arr[num] = key;
        return (num + 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements:");
        int capacity = 10;
        int key = 88;

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        //I want to print above elements
        System.out.println("Elements in the array are:");
        for(int i=0; i<num; i++){
            System.out.println(arr[i]+" ");
        }

        result(arr, num, key, capacity);

        //After Insertion
        System.out.println("After Insertion:");
        for(int i=0; i<num; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
