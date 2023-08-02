package JAVA;

public class RightRotation {

    static void RightRotationExample(int arr[], int n){

        int temp = arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    //Unfortunately, using the increment operator in this specific scenario might not be possible, as we need to move elements from the end of the array to the beginning. As a result, the decrement operator is more suitable for this operation. I appreciate your understanding
    //   for(int i=0; i<n; i++){
    //      arr[i+1] = arr[i];
    //        }  
    //        arr[0] = temp;                                                                                                                                                                                                                   
    //     }
      
    
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        //int d = 3;
        System.out.println("Original Array will be: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        //Using Object
        //RightRotation object = new RightRotation();
        //int result = object.RightRotationExample(arr,n);

        //without creating object  ---->YOu don't have to initialized it with a variable
        RightRotationExample(arr, n);

        System.out.println("Array after rotation: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
}


