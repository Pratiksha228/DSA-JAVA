package JAVA;

public class MaxMinLinearSearch {

    static class Pair{
      int max;
      int min;
    }

    static Pair getMinMax(int arr[], int n){
        Pair minmax = new Pair();
        int i;

        if(n==1){
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }
        if(arr[0]>arr[1]){
            minmax.min = arr[1];
            minmax.max = arr[0];
        }
        else{
            minmax.min = arr[0];
            minmax.max = arr[1];
        }
        for(i = 2; i < n; i++){
          if(arr[i]>minmax.max){
            minmax.max = arr[i];
          }
          else if(arr[i]<minmax.min){
            minmax.min = arr[i];
          }
        }
        return minmax;
    }
    


public static void main(String[] args){
    int arr[] = {1000,10,11,56,78,77,98,22,30};
    int arr_size = arr.length-1;
    System.out.println(arr_size);

    Pair minmax = getMinMax(arr,arr_size);
    System.out.println("Maximum element in the array: "+minmax.max);
    System.out.println("Minimum element of the array: "+minmax.min);
}
}
