package JAVA.Arrays;
public class ArrayDeletion {
    //function to search a key to be deleted
    static int deleteElementExample(int arr[], int n, int key){
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    //Function to delete an element
    static int deleteElement(int arr[], int n, int key){
         int pos = deleteElementExample(arr, n, key);

         if(pos == -1){
            System.out.println("Element is not found");
            return n;
         }

         for(int i=pos; i<n-1; i++){
            arr[i] = arr[i+1];
         }
         return n - 1;
    }
    public static void main(String[] args){
        int arr[] = {22,89,90,7,56,78,55,87,99};
        int n =arr.length;
        int key = 56;

        //Array before deletion
        System.out.println("Array before deletion: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }

        //Function calling
        n = deleteElement(arr, n, key);

        //Array after deletion
        System.out.println("Array after deletion: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
