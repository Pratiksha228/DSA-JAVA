package JAVA;
import java.util.Arrays;

class Pair{
    public int min;
    public int max;
}

class MinMax {

  static Pair getMinMax(int arr[], int n){
        Pair minmax = new Pair();
        Arrays.sort(arr);
        minmax.min = arr[0];
        minmax.max = arr[n-1];

        return minmax;     
    }

    public static void main(String[] args){
        int arr[] = {30, 40, 55, 90, 67, 43, 12, 45};
        int arr_size = arr.length;

        Pair minmax = getMinMax(arr, arr_size);

        System.out.println(minmax);

    }
    
}
